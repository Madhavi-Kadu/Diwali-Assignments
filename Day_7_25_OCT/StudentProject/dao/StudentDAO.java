package dao;

import bean.Student;
import java.util.List;

public interface StudentDAO {
    void saveStudentsToFile(List<Student> studentList);
    List<Student> sortByAttendance(List<Student> students);
}
