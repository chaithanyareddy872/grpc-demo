package org.example.service;

public class ConstantQuery {
public static String GETEMAILPASSWORD ="Select emailid,pswd from users where emailId=? and pswd=?";
public static String GETUSERID="Select userid,usertype from users where emailid=?";

public static String GETSTUDENTID="Select studentid from students where userid=?";

public static String GETTEACHERID="Select teacherid from teachers where userid=?";
public static String UPDATELASTLOGIN="update  users set last_login=current_timestamp(2) where emailid=? and pswd=?";
public static String DELETEUSER="Delete from users where emailId=?";
public static String INSERTUSERINFO="Insert into users(username,fname,lname,emailid,contact,pswd,usertype) values(?,?,?,?,?,?,?)";
public static String INSERTSTUDENTINFO="Insert into students(userid) values(?);";
public static String INSERTTEACHERINFO="Insert into teachers(userid) values(?);";
public static String INSERTADDRESS="Insert into address(userid,city,state,pincode) values(?,?,?,?)";
public static String INSERTPREFRENCES="INSERT INTO preferences( userid, genre, instrument) VALUES (?,?,?)";
public static String UPDATEPASSWORD="Update users set pswd=? where emailId=?";

}
