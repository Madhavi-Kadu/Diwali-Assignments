package service;

public interface EmployeeService {
    void addEmployee(int id, String name, String role);
    boolean removeEmployee(int id);
    void showAllEmployee();
    void showSortedEmployees();
    void findEmployee(String name);
    void saveEmployees(String filename);
    void loadEmployee(String filename);
}
