package bean;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String sname;
    private String course;
    private double attendancePercentage;
    private double score;
    private String grade;

    public Student() {}

    public Student(int rollNo, String sname, String course, double attendancePercentage, double score) {
        this.rollNo = rollNo;
        this.sname = sname;
        this.course = course;
        this.attendancePercentage = attendancePercentage;
        this.score = score;
    }

    public int getRollNo() {
        return rollNo;
    }
    public String getSname() {
        return sname;
    }
    public String getCourse() {
        return course;
    }
    public double getAttendancePercentage() {
        return attendancePercentage;
    }
    public double getScore() {
        return score;
    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return rollNo + " - " + sname + " - " + course + " - " + attendancePercentage + "% - Score: " + score + " - Grade: " + grade;
    }
}

