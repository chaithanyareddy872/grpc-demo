package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.UserRegister;
import org.example.userRegisterGrpc;
import java.sql.*;
import java.util.ArrayList;
import com.stackroute.musicmantra.noty5.emailserver.*;
import java.util.List;
import java.util.function.DoubleUnaryOperator;

public class Authentication extends userRegisterGrpc.userRegisterImplBase{
    @Override
    public void registration(UserRegister.details request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        System.out.println("Inside registration method");
        //Getting userDetails
        String username = request.getUsername();
        String fname = request.getFirstName();
        String lname = request.getLastName();
        String email = request.getEmailId();
        String contact = request.getContactNo();
        String password = request.getPassword();
        String city = request.getAddressOrBuilder().getCity();
        String state = request.getAddressOrBuilder().getState();
        String pincode = request.getAddressOrBuilder().getPincode();

        //ArrayList to String array
        List<UserRegister.Genre> genreList = request.getPreferences().getGenreList();
        List<String> genrete=new ArrayList<>() ;
        for(UserRegister.Genre g : genreList){
            genrete.add(String.valueOf(g));
        }

        String[] genArr=new String[genrete.size()];
        genArr = genrete.toArray(genArr);

        for(String s: genArr) {
            System.out.println(s);
        }

        //ArrayList to String array
        List<UserRegister.Instruments> instList=request.getPreferences().getInstrumentList();
        List<String> Inst=new ArrayList<>() ;

        for(UserRegister.Instruments i : instList){
            Inst.add(String.valueOf(i));
        }
        String[] InstArr=new String[Inst.size()];
        InstArr = Inst.toArray(InstArr);

        for (String s : InstArr) {
            System.out.println(s);
        }


        String usertype = String.valueOf(request.getUsertype());

        System.out.println(username);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(email);
        System.out.println(contact);
        System.out.println(password);
        System.out.println(city);
        System.out.println(state);

        UserRegister.APIResponse1.Builder regResponse = UserRegister.APIResponse1.newBuilder();
        //validating and adding to registration,address and preferences tables
        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
                System.out.println("User exist");
            } else {
                System.out.println("adding user to the registartion table");
                if (Validations.validateFirstName(fname) && Validations.validateLastName(lname) && Validations.validateUsername(username)
                        && Validations.validateEmail(email) && Validations.validateContact(contact) && Validations.validatePassword(password) && usertype != "") {
                    int userId = DatabaseOperations.addRegistraion(username, fname, lname, email, contact, password, usertype);
                    DatabaseOperations.addAddress(city, state, pincode, userId);
                    DatabaseOperations.addPreferences(genArr,InstArr,userId);
                    regResponse.setResponseMessage("Registration successful");
                    regResponse.setResponseCode(200);
                    DatabaseOperations.getUserByEmail(email);
                }
            }
        }

        responseObserver.onNext(regResponse.build());
        responseObserver.onCompleted();

    }

    @Override
    public void login(UserRegister.authenticationRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String email=request.getEmail();
        String password= request.getPassword();
        //Response builder
        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();
        Connection connection=DatabaseConnection.getConnection();
        String query="Select emailId,password from user_info where emailId=? and password=? ";
        String query1 = "Select user_id from user_info where emailid=?";
        int userId=0;
        try{
            PreparedStatement stmnt= connection.prepareStatement(query);
            stmnt.setString(1,email);
            stmnt.setString(2,password);
            ResultSet resultSet = stmnt.executeQuery();


            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            stmnt1.setString(1, email);
            ResultSet rs = stmnt1.executeQuery();
            while (rs.next()) {
                userId = rs.getInt(1);
            }

            if(resultSet.next()){
                System.out.println("Log in successfull");
                response.setResponseMessage("Log in successfull").setResponseCode(200).setUserId(userId);
            }
            else{
                System.out.println("Invalid Username or password");
                response.setResponseMessage("Invalid Username or password").setResponseCode(400);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteuser(UserRegister.deleteRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String emailId = request.getEmailId();

        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();
        Connection connection=DatabaseConnection.getConnection();

        String query="Delete from registration where emailId=?";
        String query1 = "Select user_id from registration where emailid=?";
        int userId=0;
        try{

            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            stmnt1.setString(1, emailId);
            ResultSet rs = stmnt1.executeQuery();
            while (rs.next()) {
                userId = rs.getInt(1);
            }
            PreparedStatement stmnt=connection.prepareStatement(query);
            stmnt.setString(1,emailId);
            int rowsaffected = stmnt.executeUpdate();


            if(rowsaffected>0) {
                System.out.println("Account Deleted");
                response.setResponseMessage("Account Deleted successfully").setResponseCode(200).setUserId(userId);
            }else {
                response.setResponseMessage("Invalid email ID").setResponseCode(400);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
