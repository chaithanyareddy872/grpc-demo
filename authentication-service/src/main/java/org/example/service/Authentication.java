package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.UserRegister;
import org.example.userRegisterGrpc;

import java.net.ServerSocket;
import java.sql.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;

import com.stackroute.musicmantra.noty5.emailserver.*;
import io.jsonwebtoken.*;

import java.util.Date;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class Authentication extends userRegisterGrpc.userRegisterImplBase{
    int Ootp=0;
    @Override
    public void forgetPassword(UserRegister.forgetPswdRequest request, StreamObserver<UserRegister.forgetPswdResponse> responseObserver) {
        String email = request.getEmail();


        UserRegister.forgetPswdResponse.Builder response = UserRegister.forgetPswdResponse.newBuilder();

        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
//                Ootp = GenerateOTP.generateOTP();
                int otpSentFromNot5=Channel.ResetPswd(email);
                VerificationDetails.getVerify().put(email,otpSentFromNot5);
                System.out.println("Forget Password : "+VerificationDetails.getVerify().get(email));
                System.out.println("OTP : "+otpSentFromNot5);

                System.out.println(email);
                response.setMessageForget("OTP succesfully sent").setResponseCode(200);


            }else{
                System.out.println("Invalid Email");
                response.setMessageForget("Invalid email").setResponseCode(400);
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void resetPassword(UserRegister.resetPswdRequest request, StreamObserver<UserRegister.resetPswdResponse> responseObserver) {
        String email=request.getEmailId();
        String password = request.getPassword();
        int otp = request.getOtp();
        System.out.println("Reset Password : "+VerificationDetails.getVerify().get(email));
        UserRegister.resetPswdResponse.Builder response = UserRegister.resetPswdResponse.newBuilder();
        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
                int generatedOTp=VerificationDetails.getVerify().get(email);
                if (generatedOTp == otp) {
                    DatabaseOperations.upDatePassword(email, password);
                    response.setMessageReset("Password Reset Successful").setResponseCode(200);

                } else {
                    response.setMessageReset("Invalid OTP").setResponseCode(200);
                    System.out.println("Invalid OTP");
                }
            }else{
                response.setMessageReset("Invalid Email").setResponseCode(400);
            }
                }

        VerificationDetails.getVerify().remove(email,otp);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    String username="";
    String fname="";
    String lname="";
    String email="";
    String contact="";
    String password="";
    String city="";
    String state="";
    String pincode="";
    String[] genArr;
    String[] InstArr;
    String usertype="";

    //registration service
    @Override
    public void registration(UserRegister.details request, StreamObserver<UserRegister.APIResponseR> responseObserver) {
        System.out.println("Inside registration method");
        //Getting userDetails
        username = request.getUsername();
        fname = request.getFirstName();
        lname = request.getLastName();
        email = request.getEmailId();
        contact = request.getContactNo();
        password = request.getPassword();
        city = request.getAddressOrBuilder().getCity();
        state = request.getAddressOrBuilder().getState();
        pincode = request.getAddressOrBuilder().getPincode();

        //ArrayList to String array
        List<UserRegister.Genre> genreList = request.getPreferences().getGenreList();
        List<String> genrete = new ArrayList<>();
        for (UserRegister.Genre g : genreList) {
            genrete.add(String.valueOf(g));
        }

        genArr = new String[genrete.size()];
        genArr = genrete.toArray(genArr);

        for (String s : genArr) {
            System.out.println(s);
        }

        //ArrayList to String array
        List<UserRegister.Instruments> instList = request.getPreferences().getInstrumentList();
        List<String> Inst = new ArrayList<>();

        for (UserRegister.Instruments i : instList) {
            Inst.add(String.valueOf(i));
        }
        InstArr = new String[Inst.size()];
        InstArr = Inst.toArray(InstArr);

        for (String s : InstArr) {
            System.out.println(s);
        }


        usertype = String.valueOf(request.getUsertype());

        System.out.println(username);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(email);
        System.out.println(contact);
        System.out.println(password);
        System.out.println(city);
        System.out.println(state);

        UserRegister.APIResponseR.Builder regResponse = UserRegister.APIResponseR.newBuilder();
        //validating and adding to registration,address and preferences tables
        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
                System.out.println("User exist");
                regResponse.setResponseMessage("User exist").setResponseCode(200);

            } else if(Validations.validateFirstName(fname) && Validations.validateLastName(lname) && Validations.validateUsername(username)
                    && Validations.validateEmail(email) && Validations.validateContact(contact) && Validations.validatePassword(password) && usertype != "")
            {
//                Ootp = GenerateOTP.generateOTP();
//                System.out.println("OTP : " + Ootp);
                int Ootp= Channel.verifyReg(email);
                VerificationDetails.getVerify().put(email,Ootp);
                System.out.println("Verify registration : "+VerificationDetails.getVerify().get(email));
                System.out.println("OTP : "+Ootp);
                regResponse.setResponseMessage("OTP sent successfully").setResponseCode(200);
            }
        }


        responseObserver.onNext(regResponse.build());
        responseObserver.onCompleted();

    }

    @Override
    public void verifyRegistration(UserRegister.verify request, StreamObserver<UserRegister.APIResponseR> responseObserver) {
        String email = request.getEmail();
        int otp = request.getOtp();
        System.out.println(username);
        System.out.println(fname);
        System.out.println(lname);
        System.out.println(password);
        System.out.println(pincode);
        System.out.println("email : "+email);
        System.out.println("contact :"+ contact);
        System.out.println(usertype);

        UserRegister.APIResponseR.Builder response = UserRegister.APIResponseR.newBuilder();
        if (Validations.validateEmail(email)) {
            System.out.println(otp);
            int generatedOtp=VerificationDetails.getVerify().get(email);
            System.out.println("generated otp : "+generatedOtp);
                if (generatedOtp == otp) {
                    System.out.println("adding user to the registartion table");
                    if (Validations.validateFirstName(fname) && Validations.validateLastName(lname) && Validations.validateUsername(username)
                            && Validations.validateEmail(email) && Validations.validateContact(contact) && Validations.validatePassword(password) && usertype != "")
                        {
                            int userId = DatabaseOperations.addRegistraion(username, fname, lname, email, contact, password, usertype);
                            DatabaseOperations.addAddress(city, state, pincode, userId);
                            DatabaseOperations.addPreferences(genArr, InstArr, userId);
                            if (usertype == "student") {
                                DatabaseOperations.addstudent(userId);
                            }

                            Channel.verifiedRegistration(email);
                            response.setResponseMessage("Registration successful").setResponseCode(200);



                        }else{
                        response.setResponseMessage("Invalid Credentials").setResponseCode(400);
                            System.out.println("Invalid credentials");
                        }
//
                    } else {
                        response.setResponseMessage("Invalid OTP").setResponseCode(400);
                        System.out.println("Invalid OTP");
                    }
                } else {
                    response.setResponseMessage("Invalid Email").setResponseCode(400);
                }


            VerificationDetails.getVerify().remove(email, otp);

        }



    @Override
    public void login(UserRegister.authenticationRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String email = request.getEmail();
        String password = request.getPassword();
        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();

        Connection connection = DatabaseConnection.getConnection();
        String query = "Select emailId,pswd from user_info where emailId=? and pswd=? ";
        String query1 = "Select user_id from user_info where emailid=?";
        int userId = 0;
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, email);
            stmnt.setString(2, password);
            ResultSet resultSet = stmnt.executeQuery();


            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            stmnt1.setString(1, email);
            ResultSet rs = stmnt1.executeQuery();
            while (rs.next()) {
                userId = rs.getInt(1);
            }
            if(Integer.valueOf(userId)!=null){
                System.out.println("Log in successfull");
                String token=GetJwtToken.getToken(email);
                response.setResponseMessage("Log in successfull").setResponseCode(200).setUserId(userId).setToken(token);
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

//            if (resultSet.next()) {
//                System.out.println("Log in successfull");
//                response.setResponseMessage("Log in successfull").setResponseCode(200).setUserId(userId);
//            } else {
//                System.out.println("Invalid Username or password");
//                response.setResponseMessage("Invalid Username or password").setResponseCode(400);
//            }
//            responseObserver.onNext(response.build());
//            responseObserver.onCompleted();
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
        //Response builder
//        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();
//        boolean userExist = getDetails(email, password,response.getUserId());
//        if(userExist==true){
//            Instant now = Instant.now();
//            String jwtToken =  Jwts.builder()
//                    .claim("email:", email)
//                    .setSubject(email)
//                    .setId(UUID.randomUUID().toString())
//                    .setIssuedAt(Date.from(now))
//                    .setExpiration(Date.from(now.plus(5L, ChronoUnit.MINUTES)))
//                    .compact();
//            response.setResponseMessage("\n"+"Login Successful : "+"Access Token : "+jwtToken).setResponseCode(200);
//        }
//        else if(userExist==false){
//            response.setResponseMessage("\n"+"Login Failed : "+"Invalid!! Username or Password");
//        }
//        else{
//            response.setResponseMessage("\n"+"Login Failed : "+"User Does not Exists.");
//        }
//        responseObserver.onNext(response.build());
//        responseObserver.onCompleted();
//    }

    @Override
    public void deleteuser(UserRegister.deleteRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String emailId = request.getEmailId();

        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();
        Connection connection=DatabaseConnection.getConnection();

        String query="Delete from user_info where emailId=?";
        String query1 = "Select user_id from user_info where emailid=?";
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

//    public  boolean getDetails(String email,String password,int user_Id){
//        Connection connection=DatabaseConnection.getConnection();
//        String query="Select emailId,pswd from user_info where emailId=? and pswd=? ";
//        String query1 = "Select user_id from user_info where emailid=?";
//        int userId=0;
//        try{
//            PreparedStatement stmnt= connection.prepareStatement(query);
//            stmnt.setString(1,email);
//            stmnt.setString(2,password);
//            ResultSet resultSet = stmnt.executeQuery();
//
//
//            PreparedStatement stmnt1 = connection.prepareStatement(query1);
//            stmnt1.setString(1, email);
//            ResultSet rs = stmnt1.executeQuery();
//            while (rs.next()) {
//                userId = rs.getInt(1);
//            }
//
//            if(resultSet.next()){
//                String last_login_query = "update  user_info set last_login=current_timestamp(2) where emailid=? and pswd=?; ";
//                PreparedStatement stmnt2 = connection.prepareStatement(last_login_query);
//                stmnt2.setString(1, email);
//                stmnt2.setString(2, password);
//                stmnt2.executeUpdate();
//                return true;
//            } else {
//                return false;
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
    }

