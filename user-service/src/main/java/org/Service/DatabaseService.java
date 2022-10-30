package org.Service;
import io.grpc.internal.DnsNameResolver;
import io.grpc.stub.StreamObserver;
import org.grpc.generated.Userprofile;
import java.sql.*;
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
}
