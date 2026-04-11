package com.studentEnrollment.dao;

import com.studentEnrollment.model.Course;
import com.studentEnrollment.util.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {

    public boolean addCourse(Course course){
        String sql = "insert into courses (course_name, course_code, instructor, credit_hour) values (?,?,?,?)";

        try(Connection conn = DbConfig.getDbConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){
            ps.setString(1,course.getCourseName());
            ps.setString(2, course.getCourseCode());
            ps.setString(3, course.getIntructor());
            ps.setInt(4,course.getCreditHour());
        } catch (Exception e) {
            System.out.println("error found during adding courses: ");

        }
        return false;
    }

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        String sql = "select * from courses";
        try(Connection conn = DbConfig.getDbConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ){
            while(rs.next()){
                Course course = new Course(
                        rs.getInt("id"),
                        rs.getString("course_name"),
                        rs.getString("course_code"),
                        rs.getString("instructor"),
                        rs.getInt("credit_hour")
                );
                  courses.add(course);
            }

        } catch (Exception e) {
            System.out.println("Error fetching courses: ");
        }
        return courses;
    }
}
