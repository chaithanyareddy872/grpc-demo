package org.Service;
import io.grpc.internal.DnsNameResolver;
import io.grpc.stub.StreamObserver;
import org.grpc.generated.SessionCreate;
import org.grpc.generated.Userprofile;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DatabaseService {
    public Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/musicmantradb";
        String psqlname = "postgres";
        String psqlpassword = "root123";
        Connection connection;
        try {
            connection = DriverManager.getConnection(url, psqlname, psqlpassword);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public  Userprofile.GetProfileResp.Builder getUser(int id){

        Connection connection = getConnection();

        String query = "select username,fname,lname,emailid,contact,city,state,pincode,genre,instrument from users u \n" +
                "inner join address a on u.userid=a.userid \n" +
                "inner join preferences p on u.userid=p.userid where u.userid=?";

        Userprofile.GetProfileResp.Builder response=Userprofile.GetProfileResp.newBuilder();

        Array array = null;
        String[] strings = null;
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1,id);
            ResultSet resultSet=statement.executeQuery();

            if(resultSet.next()){

                array = resultSet.getArray(9);
                strings = (String[]) array.getArray();
                list = Arrays.asList(strings);
                array = resultSet.getArray(10);
                strings = (String[]) array.getArray();
                list1 = Arrays.asList(strings);

                return response.setUsername(resultSet.getString(1))
                        .setFirstname(resultSet.getString(2))
                        .setLastname(resultSet.getString(3))
                        .setEmail(resultSet.getString(4))
                        .setContact(resultSet.getString(5))
                        .setCity(resultSet.getString(6))
                        .setState(resultSet.getString(7))
                        .setPincode(resultSet.getString(8))
                        .addAllGenre(list)
                        .addAllInstrument(list1)
                        .setStatuscode(200)
                        .setStatusMessage("SUCCESS");
            }
            else {
                return response.setStatuscode(404).setStatusMessage("Profile not found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public Userprofile.Address getAddressFromID(int id) throws SQLException {
        Connection connection = getConnection();
        String query = "select * from address where userid = '"+id+"';";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()) {
            Userprofile.Address.Builder userAddress = Userprofile.Address.newBuilder();
            userAddress.setId(resultSet.getInt(2));
            userAddress.setCity(resultSet.getString(3));
            userAddress.setPinCode(resultSet.getString(4));
            userAddress.setState(resultSet.getString(5));
            return userAddress.build();
        }else{
            return null;
        }
    }
    public Userprofile.Preference getPreferenceFromID(int id) throws SQLException {
        Connection connection = getConnection();
        String query = "select * from preferences where userid = '"+id+"';";
        PreparedStatement statement = connection.prepareStatement(query);

        Array array = null;
        String[] strings = null;
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()) {
            Userprofile.Preference.Builder userPreference = Userprofile.Preference.newBuilder();
            array = resultSet.getArray(3);
            strings = (String[]) array.getArray();
            list = Arrays.asList(strings);
            userPreference.addAllGenre(list);
            array = resultSet.getArray(4);
            strings = (String[]) array.getArray();
            list1 = Arrays.asList(strings);
            userPreference.addAllIntrument(list1);
            userPreference.setId(resultSet.getInt(1));
            return userPreference.build();
        }else{
            return null;
        }
    }

    public Userprofile.Profile findUser(int id) throws SQLException {
        Connection conn = getConnection();
        String query = "select * from users where userid = '"+id+"';";
        PreparedStatement statement = conn.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        Userprofile.Profile.Builder userProfile = Userprofile.Profile.newBuilder();
        Userprofile.Address getAddress = getAddressFromID(id);
        Userprofile.Preference getPreference = getPreferenceFromID(id);
        if(resultSet.next()){
            userProfile.setFirstname(resultSet.getString(3));
            userProfile.setLastname(resultSet.getString(4));
            userProfile.setEmail(resultSet.getString(5));
            userProfile.setContact(resultSet.getString(6));
            userProfile.setAddress(getAddress);
            userProfile.setPreference(getPreference);
            return userProfile.build();
        }else{
            return null;
        }
    }
    public String getEmailFromId(int id) throws SQLException {
        String email = "";
        Connection connection = getConnection();
        String query = "select emailid from users where userid = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next())
            email = resultSet.getString(1);
        return email;
    }
    public Userprofile.Profile updateFirstName(String firstName, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update users SET fname =  '" + firstName + "' where userid = '" + id + "';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public Userprofile.Profile updateLastName(String lastName, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update users SET lname =  '" + lastName + "' where userid = '" + id + "';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public Userprofile.Profile updateContact(String contact, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update users SET contact =  '" + contact + "' where userid = '" + id + "';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public Userprofile.Profile updatePassword(String password, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update users SET pswd =  '" + password + "' where userid = '" + id + "';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public Userprofile.Profile updateAddress(String updatedCity, String updatedPincode, String updatecState, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        System.out.println(userExists);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update address SET  city =  '" +updatedCity  + "', pincode = '"+updatedPincode+"',state = '"+updatecState+"' where userid = '" + id + "';";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public String formatList(List<String> pre){
        String str = "ARRAY[";
        for (int i = 0; i<pre.size();i++){
            if(i == pre.size()-1)
                str = str+"'"+pre.get(i)+"'";
            else
                str = str+"'"+pre.get(i)+"',";
        }
        return str+"]";
    }
    public Userprofile.Profile updatePreference(String[] genre,String[] instrument, int id) throws SQLException {
        Userprofile.Profile userExists = findUser(id);
        System.out.println(userExists);
        if(userExists != null) {
            Connection conn = getConnection();
            String query = "update preferences set genre = ?, instrument = ? where userid = ?;";
            PreparedStatement pstmt = conn.prepareStatement(query);
            Array array = conn.createArrayOf("VARCHAR",genre);
            Array array1 = conn.createArrayOf("VARCHAR",instrument);
            pstmt.setArray(1,array);
            pstmt.setArray(2,array1);
            pstmt.setInt(3,id);
            pstmt.executeUpdate();
            Userprofile.Profile user = findUser(id);
            return user;
        }
        return null;
    }
    public boolean validateDate(String startDate, String startTime, String endDate, String endTIme){
        String start = startDate + " " + startTime;
        String end = endDate + " " + endTIme;
        Timestamp starting = Timestamp.valueOf(start);
        Timestamp ending = Timestamp.valueOf(end);
        LocalDate currentDate = LocalDate.parse(startDate);
        LocalDate localDate = LocalDate.now();
        if((currentDate.getYear() == localDate.getYear()) && (currentDate.getMonth() == localDate.getMonth()) && (currentDate.getDayOfMonth() >= localDate.getDayOfMonth())){
            if(starting.before(ending)){
                return true;
            }
        }
        return false;
    }

    public SessionCreate.SessionResponse.Builder findSessionById(int sessionid){
        Connection connection=getConnection();
        String query = "select * from sessions where sessionid = ?";
        PreparedStatement statement = null;
        SessionCreate.SessionResponse.Builder response = SessionCreate.SessionResponse.newBuilder();
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1,sessionid);
            ResultSet resultSet=statement.executeQuery();
            if (resultSet.next()){
                response.setSessionId(resultSet.getInt(1))
                        .setTeacherId(resultSet.getInt(2))
                        .setSessionName(resultSet.getString(3))
                        .setSessionStartDate(String.valueOf(resultSet.getDate(4)))
                        .setSessionStartTime(String.valueOf(resultSet.getTime(4)))
                        .setSessionEndDate(String.valueOf(resultSet.getDate(5)))
                        .setSessionEndTime(String.valueOf(resultSet.getTime(5)))
                        .setInstrumentId(resultSet.getInt(6))
                        .setGenreId(resultSet.getInt(7))
                        .setFees(resultSet.getInt(8));
                return response;
            }
            else {
                return response.setStatusCode(400).setResponseMessage("Session Not Found");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public SessionCreate.SessionResponse.Builder findSessionByIds(int sessionid,int teacherid){
        Connection connection=getConnection();
        String query = "select * from sessions where sessionid = ? and teacherid=?";
        PreparedStatement statement = null;
        SessionCreate.SessionResponse.Builder response = SessionCreate.SessionResponse.newBuilder();
        try {
            statement = connection.prepareStatement(query);
            statement.setInt(1,sessionid);
            statement.setInt(2,teacherid);
            ResultSet resultSet=statement.executeQuery();
            if (resultSet.next()){
                response.setSessionId(resultSet.getInt(1))
                        .setTeacherId(resultSet.getInt(2))
                        .setSessionName(resultSet.getString(3))
                        .setSessionStartDate(String.valueOf(resultSet.getDate(4)))
                        .setSessionStartTime(String.valueOf(resultSet.getTime(4)))
                        .setSessionEndDate(String.valueOf(resultSet.getDate(5)))
                        .setSessionEndTime(String.valueOf(resultSet.getTime(5)))
                        .setInstrumentId(resultSet.getInt(6))
                        .setGenreId(resultSet.getInt(7))
                        .setFees(resultSet.getInt(8));
                return response;
            }
            else {
                return response.setStatusCode(400).setResponseMessage("Session Not Found for this user");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int storeSession(int teacherId, String sessionName, String startDate, String startTime, String endDate, String endTIme, int instrumentId, int genreId, int fees) throws SQLException {
        String start = startDate + " " + startTime;
        String end = endDate + " " + endTIme;
        Timestamp starting = Timestamp.valueOf(start);
        Timestamp ending = Timestamp.valueOf(end);
        Connection connection = getConnection();
        boolean result = validateDate(startDate,startTime,endDate,endTIme);
        if (result == true) {
            String query = "insert into sessions(teacherid,sessionname,startdate,enddate, instrumentid,genreid,fees) values(?,?,?,?,?,?,?);";
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, teacherId);
            preparedStatement.setString(2, sessionName);
            preparedStatement.setTimestamp(3, starting);
            preparedStatement.setTimestamp(4, ending);
            preparedStatement.setInt(5, instrumentId);
            preparedStatement.setInt(6, genreId);
            preparedStatement.setInt(7, fees);
            preparedStatement.executeUpdate();
            int sessionId = 0;
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next())
                sessionId = resultSet.getInt(1);
            return sessionId;
        }
        return 0;
    }
    public List<SessionCreate.SessionResponse> getAllSessionsBasedOnID(int teacherid) throws SQLException {
        Connection connection = getConnection();
        List<SessionCreate.SessionResponse> list = new ArrayList<>();
        String query = "select * from sessions where teacherid = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,teacherid);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            SessionCreate.SessionResponse.Builder response = SessionCreate.SessionResponse.newBuilder();
            response.setSessionId(resultSet.getInt(1));
            response.setTeacherId(resultSet.getInt(2));
            response.setSessionName(resultSet.getString(3));
            response.setSessionStartDate(String.valueOf(resultSet.getDate(4)));
            response.setSessionStartTime(String.valueOf(resultSet.getTime(4)));
            response.setSessionEndDate(String.valueOf(resultSet.getDate(5)));
            response.setSessionEndTime(String.valueOf(resultSet.getTime(5)));
            response.setInstrumentId(resultSet.getInt(6));
            response.setGenreId(resultSet.getInt(7));
            response.setFees(resultSet.getInt(8));
            response.setResponseMessage("SessionID "+resultSet.getInt(1));
            response.setStatusCode(200);
            list.add(response.build());
        }
        return list;
    }

    public SessionCreate.SessionResponse.Builder updateSessionNameById(int sessionid,int teacherid,String sessionname){
        Connection connection = getConnection();
        SessionCreate.SessionResponse.Builder response;
        String query = "update sessions set sessionname=? where sessionid=? and teacherid=?";
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setString(1,sessionname);
            statement.setInt(2,sessionid);
            statement.setInt(3,teacherid);
            statement.executeUpdate();
            response=findSessionById(sessionid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(!(response.getStatusCode()==400)){
            response.setStatusCode(200).setResponseMessage("Updated Successfully");
            return response;
        }
        else {
            return response;
        }
    }

    public SessionCreate.SessionResponse.Builder updateSessionTimingsById(SessionCreate.SessionTimingRequest request) {
        int sessionid = request.getSessionId();
        int teacherid = request.getTeacherId();
        String start = request.getSessionStartDate() + " " + request.getSessionStartTime();
        String end = request.getSessionEndDate() + " " + request.getSessionEndTime();
        Timestamp starting = Timestamp.valueOf(start);
        Timestamp ending = Timestamp.valueOf(end);
        boolean result = validateDate(request.getSessionStartDate(), request.getSessionStartTime(), request.getSessionEndDate(), request.getSessionEndTime());
        Connection connection = getConnection();
        SessionCreate.SessionResponse.Builder response;
        SessionCreate.SessionResponse.Builder elseResponse=SessionCreate.SessionResponse.newBuilder();
        if (result == true) {
            String query = "update sessions set startdate=?, enddate=? where sessionid=? and teacherid=?";
            try {
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setTimestamp(1, starting);
                statement.setTimestamp(2, ending);
                statement.setInt(3, sessionid);
                statement.setInt(4, teacherid);

                statement.executeUpdate();

                response = findSessionByIds(sessionid, teacherid);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            if (!(response.getStatusCode() == 400)) {
                response.setStatusCode(200).setResponseMessage("Updated Successfully");
                return response;
            } else {
                return response;
            }
        } else {
            return elseResponse.setStatusCode(400).setResponseMessage("Invalid Time entries");
        }
    }

    public SessionCreate.SessionResponse.Builder updateSessionFeesById(int sessionid,int teacherid,int fees){
        Connection connection = getConnection();
        SessionCreate.SessionResponse.Builder response;
        String query = "update sessions set fees=? where sessionid=? and teacherid=?";
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setInt(1,fees);
            statement.setInt(2,sessionid);
            statement.setInt(3,teacherid);
            statement.executeUpdate();
            response=findSessionByIds(sessionid,teacherid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(!(response.getStatusCode()==400)){
            response.setStatusCode(200).setResponseMessage("Updated Successfully");
            return response;
        }
        else {
            return response;
        }
    }

    public SessionCreate.DeleteSessionResponse.Builder deleteSessionById(int sessionid,int teacherid){
        Connection connection = getConnection();
        SessionCreate.DeleteSessionResponse.Builder response=SessionCreate.DeleteSessionResponse.newBuilder();
        String query = "delete from sessions where sessionid=? and teacherid=?";
        int result=0;
        try {
            PreparedStatement statement= connection.prepareStatement(query);
            statement.setInt(1,sessionid);
            statement.setInt(2,teacherid);
            result=statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(result==1){
            return response.setStatusCode(200).setStatusMessage("Deleted Successfully");
        }
        else{
            return response.setStatusCode(400).setStatusMessage("Session not found this user");
        }
    }

}
