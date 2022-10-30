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

}
