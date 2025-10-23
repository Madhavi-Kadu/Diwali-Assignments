package dao;

import bean.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO{

    private ArrayList<Employee> empList = new ArrayList<>();

    @Override
    public void addEmployee(Employee e) {
        empList.add(e);
    }

    @Override
    public boolean removeEmployee(int id) {
        return empList.removeIf(e -> e.getEmpID() == id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return empList;
    }

    @Override
    public List<Employee> getSortedEmployees() {
        empList.sort(Comparator.comparingInt(Employee::getEmpID));
        return empList;
    }

    @Override
    public Employee findEmployeeByName(String name) {
        for (Employee e : empList){
            if (e.getEmpName().equalsIgnoreCase(name))
                return e;
        }
        return null;
    }

    @Override
    public void saveToFile(String filename) {
        try(ObjectOutputStream abc = new ObjectOutputStream(new FileOutputStream(filename))){
            abc.writeObject(empList);
            System.out.println("Employee saved successfully to "+filename);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            empList = (ArrayList<Employee>) ois.readObject();
            System.out.println("Employees loaded from " + filename);
        } catch (Exception e) {
            System.out.println("No data file found or error loading file.");
        }
    }
}
