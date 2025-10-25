package service;

import bean.Student;

public interface StudentService {
    void calculateGrade(Student student) throws InvalidAttendanceException;
}
