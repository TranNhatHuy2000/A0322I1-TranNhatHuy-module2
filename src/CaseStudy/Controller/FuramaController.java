package CaseStudy.Controller;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;
import CaseStudy.Services.CustomerService;
import CaseStudy.Services.CustomerServiceImpl;
import CaseStudy.Services.EmployeeService;
import CaseStudy.Services.EmployeeServiceImpl;
import CaseStudy.repository.CustomerRepositoryImpl;
import CaseStudy.repository.EmployeeRepositoryImpl;


import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FuramaController {
    private static EmployeeService employeeService = new EmployeeServiceImpl();
    private static CustomerService customerService = new CustomerServiceImpl();
    private static List<Customer> customerList = CustomerRepositoryImpl.getCustomerList();
    private static List<Employee> employeesList = EmployeeRepositoryImpl.getEmployeesList();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n"+
                    "5. Promotion Management\n"+
                    "6. Exit");
            System.out.print("input choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    menuEmployee();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    menuFacility();
                    break;
                case 4:
                    menuBooking();
                    break;
                case 5:
                    menuPromotion();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }


    /*---------------------------------------------Employee---------------------------------------------*/
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
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }

    /*---------------------------------------------Customer---------------------------------------------*/
    public static void displayCustomer(){
        for (Customer customer : customerService.displayCustomer()){
            System.out.println(customer);
        }
    }

    public static void addNewCustomer(Customer customer){
        customerService.addCustomer(customer);
    }

    public static void editCustomer(int id, Customer customer){
        customerService.editCustomer(id, customer);
    }

    public static void menuCustomer(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("input choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-----Display List Customer-----");
                    displayCustomer();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-----Add New Customer-----");
                    System.out.print("Input ID Customer: ");
                    int idCustomer = Integer.parseInt(input.nextLine());
                    System.out.print("Type Customer: ");
                    String typeCustomer = input.nextLine();
                    System.out.print("Address: ");
                    String address = input.nextLine();
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
                    addNewCustomer(new Customer(idCustomer,typeCustomer,address,fullName,dateOfBirth,gender,idNumber,phone,email));
                    System.out.println("added success!!!");
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----Edit Customer-----");
                    Iterator<Customer> customerIterator = customerList.iterator();
                    while (customerIterator.hasNext()){
                        Customer customer = customerIterator.next();
                        System.out.println("Edit id:");
                        int edit = Integer.parseInt(input.nextLine());
                        if (customer.getIdCustomer() == edit){
                            System.out.print("Input ID Customer: ");
                            int idCustomerEdit = Integer.parseInt(input.nextLine());
                            System.out.print("Type Customer: ");
                            String typeCustomerEdit = input.nextLine();
                            System.out.print("Address: ");
                            String addressEdit = input.nextLine();
                            System.out.print("Full Name: ");
                            String fullNameEdit = input.nextLine();
                            System.out.print("Date of birth: ");
                            String dateOfBirthEdit = input.nextLine();
                            System.out.print("Gender: ");
                            String genderEdit = input.nextLine();
                            System.out.print("ID: ");
                            int idNumberEdit = Integer.parseInt(input.nextLine());
                            System.out.print("Phone: ");
                            int phoneEdit= Integer.parseInt(input.nextLine());
                            System.out.print("Mail: ");
                            String emailEdit =input.nextLine() ;
                            System.out.println();
                            editCustomer(edit,new Customer(idCustomerEdit,typeCustomerEdit,addressEdit,fullNameEdit,dateOfBirthEdit,genderEdit,idNumberEdit,phoneEdit,emailEdit));
                            System.out.println("added success!!!");
                            System.out.println("-------------------------------");
                        }
                    }
                    System.out.println("Not found customer to edit???");
                    break;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
    public static void menuFacility(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            System.out.print("input choice: ");
            choice = input.nextInt();
            switch (choice){
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
    public static void menuBooking(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Display list booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list constracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.print("input choice: ");
            choice = input.nextInt();
            switch (choice){
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
    public static void menuPromotion(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.print("input choice: ");
            choice = input.nextInt();
            switch (choice){
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
