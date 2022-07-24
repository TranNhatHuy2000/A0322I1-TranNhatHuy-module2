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
    private static List<Customer> customerList = CustomerRepositoryImpl.getCustomerList();


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
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }


}
