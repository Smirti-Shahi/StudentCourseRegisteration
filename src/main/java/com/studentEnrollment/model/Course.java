package com.studentEnrollment.model;

public class Course {

    private int id;
    private String courseName;
    private String courseCode;
    private String intructor;
    private int creditHour;

    public Course(){

    }

    public Course(int id, String courseName, String courseCode, String intructor, int creditHour) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.intructor = intructor;
        this.creditHour = creditHour;
    }

    public Course(String courseName, String courseCode, String intructor, int creditHour) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.intructor = intructor;
        this.creditHour = creditHour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getIntructor() {
        return intructor;
    }

    public void setIntructor(String intructor) {
        this.intructor = intructor;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    @Override
    public String toString(){
        return "["+id+"]"+courseName
                +"| Code: "+courseCode
                +"| Instructor: "+intructor
                +"| Credit Hour: "+creditHour;
    }
}
