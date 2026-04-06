package com.studentEnrollment.model;

import java.util.Date;

public class Enrollment {

    private int id;
    private int userId;
    private int courseId;
    public Date enrolledDate;


    public Enrollment(){}

    public Enrollment(int id, int userId, int courseId, Date enrolledDate) {
        this.id = id;
        this.userId = userId;
        this.courseId = courseId;
        this.enrolledDate = enrolledDate;
    }

    public Enrollment(int userId, int courseId, Date enrolledDate) {
        this.userId = userId;
        this.courseId = courseId;
        this.enrolledDate = enrolledDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


