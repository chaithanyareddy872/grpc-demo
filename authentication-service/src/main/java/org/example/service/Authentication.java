package org.example.service;

import io.grpc.stub.StreamObserver;
import org.example.UserRegister;
import org.example.userRegisterGrpc;

import java.net.ServerSocket;
import java.sql.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;


import io.jsonwebtoken.*;

import java.util.Date;
import java.util.function.DoubleUnaryOperator;
import java.util.stream.DoubleStream;

public class Authentication extends userRegisterGrpc.userRegisterImplBase {
    @Override
    public void forgetPassword(UserRegister.forgetPswdRequest request, StreamObserver<UserRegister.forgetPswdResponse> responseObserver) {
        String email = request.getEmail();


        UserRegister.forgetPswdResponse.Builder response = UserRegister.forgetPswdResponse.newBuilder();

        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
//                Ootp = GenerateOTP.generateOTP();
                int otpSentFromNot5 = Channel.ResetPswd(email);
                VerificationDetails.getVerify().put(email, otpSentFromNot5);
                System.out.println("Forget Password : " + VerificationDetails.getVerify().get(email));
                System.out.println("OTP : " + otpSentFromNot5);

                System.out.println(email);
                response.setMessageForget("OTP succesfully sent").setResponseCode(200);


            } else {
                System.out.println("Invalid Email");
                response.setMessageForget("Invalid email").setResponseCode(400);
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void resetPassword(UserRegister.resetPswdRequest request, StreamObserver<UserRegister.resetPswdResponse> responseObserver) {
        String email = request.getEmailId();
        String password = request.getPassword();
        System.out.println(password);

        System.out.println(password);
        int otp = request.getOtp();
        System.out.println("Reset Password : " + VerificationDetails.getVerify().get(email));
        UserRegister.resetPswdResponse.Builder response = UserRegister.resetPswdResponse.newBuilder();
        if (Validations.validateEmail(email)) {
            if (Validations.validateRegistration(email)) {
                int generatedOTp = VerificationDetails.getVerify().get(email);
                if (generatedOTp == otp) {
                    System.out.println(password);
                    DatabaseOperations.upDatePassword(email, password);
                    VerificationDetails.getVerify().remove(email, otp);
                    response.setMessageReset("Password Reset Successful").setResponseCode(200);

                } else {
                    response.setMessageReset("Invalid OTP").setResponseCode(200);
                    System.out.println("Invalid OTP");
                }
            } else {
                response.setMessageReset("Invalid Email").setResponseCode(400);
            }
        }


        responseObserver.onNext(response.build());
        responseObserver.onCompleted();


    }

    String username = "";
    String fname = "";
    String lname = "";
    String email = "";
    String contact = "";
    String password = "";
    String city = "";
    String state = "";
    String pincode = "";
    String[] genArr;
    String[] InstArr;
    String usertype = "";

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
            } else {
                if (Validations.validateFirstName(fname) && Validations.validateLastName(lname) && Validations.validateUsername(username)
                        && Validations.validateEmail(email) && Validations.validateContact(contact) && Validations.validatePassword(password) && usertype != "") {
                    int Ootp = Channel.verifyReg(email);
                    VerificationDetails.getVerify().put(email, Ootp);
                    System.out.println("Verify registration : " + VerificationDetails.getVerify().get(email));
                    System.out.println("OTP : " + Ootp);
                    regResponse.setResponseMessage("OTP sent successfully").setResponseCode(200);
                } else {
                    if (Validations.validateUsername(username) == false) {
                        regResponse.setResponseMessage("Invalid Username");
                        regResponse.setResponseCode(400);
                    } else if (Validations.validateFirstName(fname) == false) {
                        regResponse.setResponseMessage("Invalid FirstName");
                        regResponse.setResponseCode(400);

                    } else if (Validations.validateLastName(lname) == false) {
                        regResponse.setResponseMessage("invalid LastName");
                        regResponse.setResponseCode(400);
                    } else if (Validations.validateEmail(email) == false) {
                        regResponse.setResponseMessage("Invalid Email");
                        regResponse.setResponseCode(400);
                    } else if (Validations.validatePassword(password) == false) {
                        regResponse.setResponseMessage("Invalid password");
                        regResponse.setResponseCode(400);
                    } else if (Validations.validateContact(contact) == false) {
                        regResponse.setResponseMessage("Invalid contact");
                        regResponse.setResponseCode(400);
                    }
                }
            }
        }else {
            regResponse.setResponseMessage("Invalid email").setResponseCode(400);
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
        System.out.println("email : " + email);
        System.out.println("contact :" + contact);
        System.out.println(usertype);

        UserRegister.APIResponseR.Builder response = UserRegister.APIResponseR.newBuilder();
        if (Validations.validateEmail(email)) {
            System.out.println(otp);
            int generatedOtp = VerificationDetails.getVerify().get(email);
            System.out.println("generated otp : " + generatedOtp);
            if (generatedOtp == otp) {
                System.out.println("adding user to the registartion table");

                int userId = DatabaseOperations.addRegistraion(username, fname, lname, email, contact, password, usertype);
                DatabaseOperations.addAddress(city, state, pincode, userId);
                DatabaseOperations.addPreferences(genArr, InstArr, userId);
                if (usertype.equals("student")) {
                    DatabaseOperations.addstudent(userId);
                } else if (usertype.equals("teacher")) {
                    DatabaseOperations.addteacher(userId);
                }

                VerificationDetails.getVerify().remove(email, otp);

                Channel.verifiedRegistration(email);
                response.setResponseMessage("Registration successful").setResponseCode(200);

            } else {
                response.setResponseMessage("Invalid OTP").setResponseCode(400);
                System.out.println("Invalid OTP");
            }
        } else {
            response.setResponseMessage("Invalid Email").setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void login(UserRegister.authenticationRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String email = request.getEmail();
        String password = request.getPassword();
        Base64.Encoder encoder = Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String encdPassword = encoder.encodeToString(password.getBytes());
        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();

        Connection connection = DatabaseConnection.getConnection();
        String query = ConstantQuery.GETEMAILPASSWORD;
        String query1 = ConstantQuery.GETUSERID;
        int userId = 0;
        String userType="";
        String token="";
        try {
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, email);
            stmnt.setString(2, encdPassword);
            ResultSet resultSet = stmnt.executeQuery();
            String em = "";
            if (resultSet.next()) {
                email = resultSet.getString(1);
                password = resultSet.getString(2);
                String last_login_query = ConstantQuery.UPDATELASTLOGIN;
                PreparedStatement stmnt2 = connection.prepareStatement(last_login_query);
                stmnt2.setString(1, email);
                stmnt2.setString(2, encdPassword);
                stmnt2.executeUpdate();

                PreparedStatement stmnt1 = connection.prepareStatement(query1);
                stmnt1.setString(1, email);
                ResultSet rs = stmnt1.executeQuery();
                if (rs.next()) {
                    userId = rs.getInt(1);
                    userType=rs.getString(2);
                    System.out.println("Log in successfull");

                    if(userType.equals("student")){
                        int studentId=0;
                        String getStduentId=ConstantQuery.GETSTUDENTID;
                        PreparedStatement statement=connection.prepareStatement(getStduentId);
                        statement.setInt(1,userId);
                        ResultSet result=statement.executeQuery();
                        while (result.next()){
                            studentId=result.getInt(1);
                        }
                         token = GetJwtToken.getToken(email,studentId,userType);
                        Channel.getRecommendedTeachers(token,studentId);

                    } else if (usertype.equals("teacher")) {
                        int teacherId=0;
                        String getStduentId=ConstantQuery.GETTEACHERID;
                        PreparedStatement statement=connection.prepareStatement(getStduentId);
                        statement.setInt(1,userId);
                        ResultSet result=statement.executeQuery();
                        while (result.next()){
                            teacherId=result.getInt(1);
                        }
                        token = GetJwtToken.getToken(email,teacherId,userType);
                        Channel.getSessionsofTeacher(teacherId);

                        //response.setResponseMessage("Log in successfull for : " + email).setResponseCode(200).setUserId(userId).setToken(token);
                    }
                }
                response.setResponseMessage("Log in successfull for : " + email).setResponseCode(200).setUserId(userId).setToken(token);
            } else {
                System.out.println("Invalid Email or password");
                response.setResponseMessage("Invalid Email or password").setResponseCode(400);
            }


            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }


    @Override
    public void deleteuser(UserRegister.deleteRequest request, StreamObserver<UserRegister.APIResponse1> responseObserver) {
        String emailId = request.getEmailId();

        UserRegister.APIResponse1.Builder response = UserRegister.APIResponse1.newBuilder();
        Connection connection = DatabaseConnection.getConnection();

        String query = ConstantQuery.DELETEUSER;
        String query1 = ConstantQuery.GETUSERID;
        int userId = 0;
        try {

            PreparedStatement stmnt1 = connection.prepareStatement(query1);
            stmnt1.setString(1, emailId);
            ResultSet rs = stmnt1.executeQuery();
            while (rs.next()) {
                userId = rs.getInt(1);
            }
            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, emailId);
            int rowsaffected = stmnt.executeUpdate();


            if (rowsaffected > 0) {
                System.out.println("Account Deleted");
                response.setResponseMessage("Account Deleted successfully").setResponseCode(200).setUserId(userId);
            } else {
                response.setResponseMessage("Invalid email ID").setResponseCode(400);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

