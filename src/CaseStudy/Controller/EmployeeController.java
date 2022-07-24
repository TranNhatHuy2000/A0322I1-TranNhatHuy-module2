package CaseStudy.Controller;

import CaseStudy.Models.Employee;
import CaseStudy.Services.EmployeeService;
import CaseStudy.Services.EmployeeServiceImpl;
import CaseStudy.repository.EmployeeRepositoryImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    /*---------------------------------------------Employee---------------------------------------------*/

    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static List<Employee> employeesList = EmployeeRepositoryImpl.getEmployeesList();
    public static void displayEmployee(){
        for (Employee employee : employeeService.displayEmployee()){
            System.out.println(employee);
        }
    }

    public static void addNewEmployee(Employee employee){
        employeeService.addEmployee(employee);
    }

    public static void editEmployee(int id, Employee employee){
        employeeService.editEmployee(id, employee);
    }

    public static void menuEmployee(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("-----Employee Manager-----");
            System.out.println("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu");
            System.out.print("input choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-----Display List Employee-----");
                    displayEmployee();
                    System.out.println("-------------------------------");
                    break;
                case 2 :
                    System.out.println("-----Add New Employee-----");
                    System.out.print("Input ID Employee: ");
                    int idEmployee = Integer.parseInt(input.nextLine());
                    System.out.print("Level: ");
                    String level = input.nextLine();
                    System.out.print("Position: ");
                    String position = input.nextLine();
                    System.out.print("Salary: ");
                    double salary = Double.parseDouble(input.nextLine());
                    System.out.print("Full Name: ");
                    String fullName = input.nextLine();
                    System.out.print("Date of birth: ");
                    String dateOfBirth = input.nextLine();
                    System.out.print("Gender: ");
                    String gender = input.nextLine();
                    System.out.print("ID: ");
                    int idNumber = Integer.parseInt(input.nextLine());
                    System.out.print("Phone: ");
                    int phone = Integer.parseInt(input.nextLine());
                    System.out.print("Mail: ");
                    String email = input.nextLine();
                    System.out.println();
                    addNewEmployee(new Employee(idEmployee,level,position,salary,fullName,dateOfBirth,gender,idNumber,phone,email ));
                    System.out.println("added success!!!");
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----Edit Employee-----");
                    System.out.println("Edit id:");
                    int edit = Integer.parseInt(input.nextLine());
                    Iterator<Employee> employeeIterator = employeesList.iterator();
                    while (employeeIterator.hasNext()){
                        Employee employee = employeeIterator.next();
                        if (employee.getIdEmployee() == edit){
                            System.out.print("Edit ID Employee: ");
                            int idEmployeeEdit = Integer.parseInt(input.nextLine());
                            System.out.print("Edit Level: ");
                            String levelEdit = input.nextLine();
                            System.out.print("Edit Position: ");
                            String positionEdit = input.nextLine();
                            System.out.print("Edit Salary: ");
                            double salaryEdit = Double.parseDouble(input.nextLine());
                            System.out.print("Edit Full Name: ");
                            String fullNameEdit = input.nextLine();
                            System.out.print("Edit Date of birth: ");
                            String dateOfBirthEdit = input.nextLine();
                            System.out.print("Edit Gender: ");
                            String genderEdit = input.nextLine();
                            System.out.print("Edit ID: ");
                            int idNumberEdit = Integer.parseInt(input.nextLine());
                            System.out.print("Edit Phone: ");
                            int phoneEdit = Integer.parseInt(input.nextLine());
                            System.out.print("Edit Mail: ");
                            String emailEdit = input.nextLine();
                            System.out.println();
                            editEmployee(edit,new Employee(idEmployeeEdit,levelEdit,positionEdit,salaryEdit,fullNameEdit,dateOfBirthEdit,genderEdit,idNumberEdit,phoneEdit,emailEdit));
                            System.out.println("Edited success!!!");
                            System.out.println("-------------------------------");
                        }
                    }
                    System.out.println("Not found employee to edit");
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }

}
