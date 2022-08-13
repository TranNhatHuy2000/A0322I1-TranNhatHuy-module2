package CaseStudy.Controller;

import CaseStudy.Models.Customer;
import CaseStudy.Services.CustomerService;
import CaseStudy.Services.CustomerServiceImpl;
import CaseStudy.repository.CustomerRepositoryImpl;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    /*---------------------------------------------Customer---------------------------------------------*/

    private static CustomerService customerService = new CustomerServiceImpl();

    public static void menuCustomer(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Display list customers\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Display List Customer-----");
                    customerService.displayCustomer();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-----Add New Customer-----");
                    customerService.addCustomer();
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----Edit Customer-----");
                    customerService.editCustomer();
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
