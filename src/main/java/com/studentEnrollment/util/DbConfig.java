package com.studentEnrollment.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {


    private static final String URL= "jdbc:mysql://localhost:3306/student_enrollment";
    private static final String USERNAME="root";
    private static final String PASSWORD ="";

    public static Connection getDbConnection () throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }



}
