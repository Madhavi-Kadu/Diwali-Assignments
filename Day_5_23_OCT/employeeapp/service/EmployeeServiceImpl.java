package service;

import bean.Employee;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO dao = new EmployeeDAOImpl();

    @Override
    public void addEmployee(int id, String name, String role) {
        dao.addEmployee(new Employee(id, name, role));
    }

    @Override
    public boolean removeEmployee(int id) {
        return dao.removeEmployee(id);
    }

    @Override
    public void showAllEmployee() {
        List<Employee> list = dao.getAllEmployee();
        if (list.isEmpty())
            System.out.println("Employee not found.");
        else
            list.forEach(System.out::println);
    }

    @Override
    public void showSortedEmployees() {
            dao.getSortedEmployees().forEach(System.out::println);
    }

    @Override
    public void findEmployee(String name) {
        Employee e = dao.findEmployeeByName(name);
        if (e != null)
            System.out.println(e);
        else
            System.out.println("Employee not found");
    }

    @Override
    public void saveEmployees(String filename) {
        dao.saveToFile(filename);
    }

    @Override
    public void loadEmployee(String filename) {
        dao.loadFromFile(filename);
    }
}
