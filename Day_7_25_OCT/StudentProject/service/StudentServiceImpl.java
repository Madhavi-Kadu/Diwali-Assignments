package service;

import bean.Student;

public class StudentServiceImpl implements StudentService {

    @Override
    public void calculateGrade(Student student) throws InvalidAttendanceException {
        if (student.getAttendancePercentage() < 60) {
            throw new InvalidAttendanceException("Attendance below 60% Student not eligible for grading.");
        }
        double score = student.getScore();
        String grade;
        if (score >= 90)
            grade = "A";
        else if (score >= 75)
            grade = "B";
        else if (score >= 60)
            grade = "C";
        else
            grade = "D";
        student.setGrade(grade);
    }
}
