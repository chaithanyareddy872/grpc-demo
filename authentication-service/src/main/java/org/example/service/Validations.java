package org.example.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Validations {//validation class

    public static boolean validateFirstName(String firstname) {
        try {
            if (firstname.matches("[A-Z][a-z]*")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid First Name");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid First Name");
            return false;
        }
    }


    public static boolean validateLastName(String lastname) {
        try {
            if (lastname.matches("[a-zA-z]+([ '-][a-zA-Z]+)*")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid Last Name");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Last Name");
            return false;
        }
    }

    public static boolean validateEmail(String email) {
        try {
            if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid Email");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Email");
            return false;
        }
    }

    public static boolean validateContact(String contact) {
        try {
            if (contact.matches("^[0-9]{10}$")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid Email");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Contact");
            return false;
        }
    }

    public static boolean validatePassword(String password) {
        try {
            if (password.matches("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%*&^]).{8,20})")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid Password");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Password");
            return false;
        }

    }

    public static boolean validateUsername(String username) {
        try {
            if (username.matches("^[a-zA-z0-9_-]{5,15}$")) {

                return true;
            } else
                throw new InvalidArgumentException("Invalid Username");
        } catch (InvalidArgumentException e) {
            System.out.println("Invalid Username");
            return false;
        }

    }


    public static boolean validateRegistration(String email) {
        Connection connection = DatabaseConnection.getConnection();
        String query = "select username from users where emailid=?";
        boolean result = true;

        try {

            PreparedStatement stmnt = connection.prepareStatement(query);
            stmnt.setString(1, email);
            ResultSet resultSet = stmnt.executeQuery();

            if (resultSet.next()) {
                System.out.println("User with username " + resultSet.getString(1) + " exist in the table");
            } else {
                result = false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

