package test;

import bean.Student;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import service.StudentService;
import service.StudentServiceImpl;
import service.InvalidAttendanceException;

import java.util.*;

public class TestStudent {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();
        StudentDAO dao = new StudentDAOImpl();

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "Amit", "Java", 85, 92));
        studentList.add(new Student(2, "Neha", "Python", 59, 80));
        studentList.add(new Student(3, "Ravi", "C++", 70, 88));
        studentList.add(new Student(4, "Sita", "ML", 95, 91));
        studentList.add(new Student(5, "Rohan", "AI", 65, 60));
        studentList.add(new Student(6, "Priya", "DBMS", 55, 75));
        studentList.add(new Student(7, "Ankit", "Cloud", 82, 66));
        studentList.add(new Student(8, "Meena", "Java", 90, 93));
        studentList.add(new Student(9, "Arjun", "DSA", 78, 81));
        studentList.add(new Student(10, "Komal", "HTML", 61, 68));

        for (Student s : studentList) {
            try {
                service.calculateGrade(s);
            } catch (InvalidAttendanceException e) {
                s.setGrade("not eligible");
                System.out.println("!!!" + s.getSname() + ": " + e.getMessage());
            }
        }

        List<Student> sortedList = dao.sortByAttendance(studentList);

        System.out.println("\nStudents Sorted by Attendance Descending : ");
        for (Student s : sortedList) {
            System.out.println(s);
        }

        dao.saveStudentsToFile(studentList);
    }
}
