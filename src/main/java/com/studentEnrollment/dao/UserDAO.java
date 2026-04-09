package com.studentEnrollment.dao;

import com.studentEnrollment.model.User;
import com.studentEnrollment.util.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {

    public boolean registerUser(User user){
        String sql ="Insert into users (fullname, email, password,role) values (?,?,?,?)";
        try(Connection conn = DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1, user.getFullName());
            ps.setString(2,user.getEmail());
            ps.setString(3,user.getPassword());
            ps.setString(3,user.getRole());
            return ps.executeUpdate() >0;


        } catch (Exception e) {
            System.out.println("ERror registering user: "+e.getMessage());
        }
        return false;

    }

    public User loginUser(String email, String password){
        String sql = "Select * from users where email =? AND password =?";
        try(Connection conn =DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1,email);
            ps.setString(2,password);
            ResultSet rs =ps.executeQuery();
            if(rs.next()){
                return new User(rs.getInt("id"),rs.getString("fullname"),
                        rs.getString("email"),rs.getString("password"),
                        rs.getString("role"));
            }

        } catch (Exception e) {
            System.out.println("Error during loin: "+e.getMessage());
        }
        return null;
    }

    public User findByEmail(String email){
        String sql = "Select * from users where email =?";
        try(Connection conn = DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1,email);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new User(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            System.out.println("Error finding user by email"+e.getMessage());
        }
        return null;
    }

    public User findById(int id){
        String sql = "Select * from users where id =?";
        try(Connection conn = DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return new User(
                        rs.getInt("id"),
                        rs.getString("fullname"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("role")
                );
            }

        } catch (Exception e) {
            System.out.println("Error finding user by id: "+e.getMessage());

        }
        return null;
    }



}
