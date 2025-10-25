package dao;

import bean.Student;
import java.io.*;
import java.util.*;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void saveStudentsToFile(List<Student> studentList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(studentList);
            System.out.println("saved to file successfully");
        } catch (IOException e) {
            System.out.println("error while saving : " + e.getMessage());
        }
    }

    @Override
    public List<Student> sortByAttendance(List<Student> students) {
        students.sort((s1, s2) -> Double.compare(s2.getAttendancePercentage(), s1.getAttendancePercentage()));
        return students;
    }
}
