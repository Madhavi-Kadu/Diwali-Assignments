package dao;

import bean.Employee;

import java.util.List;

public interface EmployeeDAO {
    void addEmployee(Employee e);
    boolean removeEmployee(int id);
    List<Employee> getAllEmployee();
    List<Employee> getSortedEmployees();
    Employee findEmployeeByName(String name);
    void saveToFile(String filename);
    void loadFromFile(String filename);
}
