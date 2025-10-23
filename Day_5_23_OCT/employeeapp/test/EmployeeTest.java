package test;

import bean.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeTest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();
        String filename = "employees.dat";

        service.loadEmployee(filename);

        int choice;
        do {
            System.out.println("\n Employee Menu-------");
            System.out.println("1. Add_Employee");
            System.out.println("2. Remove_Employee");
            System.out.println("3. Show_All_Employees");
            System.out.println("4. Show_Sorted_Employees");
            System.out.println("5. Find_Employee_by_Name");
            System.out.println("6. Save_Employees");
            System.out.println("7. Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Role: ");
                    String role = sc.nextLine();
                    service.addEmployee(id, name, role);
                    break;
                case 2:
                    System.out.print("Enter ID to remove: ");
                    int rid = sc.nextInt();
                    if (service.removeEmployee(rid))
                        System.out.println("Employee removed successfully.");
                    else
                        System.out.println("Employee not found.");
                    break;

                case 3:
                    service.showAllEmployee();
                    break;

                case 4:
                    service.showSortedEmployees();
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter name you want to find: ");
                    String fname = sc.nextLine();
                    service.findEmployee(fname);
                    break;

                case 6:
                    service.saveEmployees(filename);
                    break;

                case 7:
                    service.saveEmployees(filename);
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice!!");
            }
        }while (choice != 7);

        sc.close();
    }
}
