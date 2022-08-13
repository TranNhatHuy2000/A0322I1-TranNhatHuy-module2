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
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Display List Employee-----");
                    employeeService.displayEmployee();
                    System.out.println("-------------------------------");
                    break;
                case 2 :
                    System.out.println("-----Add New Employee-----");
                    employeeService.addEmployee();
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----Edit Employee-----");
                    employeeService.editEmployee();
                    System.out.println("-------------------------------");
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
