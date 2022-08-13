package CaseStudy.repository;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList ;
    private static Scanner input = new Scanner(System.in);
    static {
        customerList = new LinkedList<>();
        customerList.add(new Customer(1 ,"Vip","Hue","Tran Nhat Huy","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        customerList.add(new Customer(2 ,"Normal","Da Nag","Ho Thanh Dot","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        customerList.add(new Customer(3 ,"Vip","Quang Tri","Ngoc Dinh","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
    }

    private int indexCustomer(int id)
    {
        int index=-1;
        for (int i=0; i<customerList.size(); i++)
        {
            if (id==customerList.get(i).getIdCustomer())
            {
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayCustomer() {
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        try {
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
            Customer customer = new Customer(idCustomer,typeCustomer,address,fullName,dateOfBirth,gender,idNumber,phone,email);
            customerList.add(customer);
            System.out.println("added success!!!");
        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }

    @Override
    public void editCustomer() {
        try {
            System.out.print("Edit id:");
            int edit = Integer.parseInt(input.nextLine());
            int index = indexCustomer(edit);
            if(index !=-1){
                while (true){
                    if (customerList.get(index).getIdCustomer() == edit){
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
                        customerList.set(index,new Customer(idCustomerEdit,typeCustomerEdit,addressEdit,fullNameEdit,dateOfBirthEdit,genderEdit,idNumberEdit,phoneEdit,emailEdit));
                        System.out.println("added success!!!");
                        break;
                    }
                }
            }else {
                System.out.println("Not found customer to edit???");
            }

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }
}
