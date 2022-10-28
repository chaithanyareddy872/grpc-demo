package org.example.service;

public class ConstantQuery {
public static String GETEMAILPASSWORD ="Select emailid,pswd from user_info where emailId=? and pswd=?";
public static String GETUSERID="Select user_id,usertype from user_info where emailid=?";

public static String GETSTUDENTID="Select studentid from student where userid=?";

public static String GETTEACHERID="Select teacherid from teacher where user_id=?";
public static String UPDATELASTLOGIN="update  user_info set last_login=current_timestamp(2) where emailid=? and pswd=?";
public static String DELETEUSER="Delete from user_info where emailId=?";
public static String INSERTUSERINFO="Insert into user_info(username,fname,lname,emailid,contact,pswd,usertype) values(?,?,?,?,?,?,?)";
public static String INSERTSTUDENTINFO="Insert into student(user_id) values(?);";
public static String INSERTTEACHERINFO="Insert into teacher(user_id) values(?);";
public static String INSERTADDRESS="Insert into address(user_id,city,state,pincode) values(?,?,?,?)";
public static String INSERTPREFRENCES="INSERT INTO public.preferences( user_id, genre, instruments) VALUES (?,?,?)";
public static String UPDATEPASSWORD="Update user_info set pswd=? where emailId=?";

}
