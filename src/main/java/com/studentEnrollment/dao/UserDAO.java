package com.studentEnrollment.dao;

import com.studentEnrollment.util.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    public boolean registerUser(){
        String sql ="Insert into users (fullname, email, password,role) values (?,?,?,?)";
        try(Connection conn = DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){


        } catch (Exception e) {
            return false;
        }
    }
}
