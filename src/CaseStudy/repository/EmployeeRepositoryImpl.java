package CaseStudy.repository;

import CaseStudy.Models.Employee;
import CaseStudy.Ultils.ReadAndWrite;
import CaseStudy.Ultils.RegexData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeesList ;
    private static Scanner input = new Scanner(System.in);

    private static final String BIRTHDAY_REGEX = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$"; //dd/mm/yyyy

    static {
         employeesList = new ArrayList<>();
         employeesList.add(new Employee(1 ,"Dai hoc","Giam doc",2000000,"Tran Nhat Huy","01/01/1999",
                 "Nam",191915126,123456789,"55abc@gmail.com"));
         employeesList.add(new Employee(2 ,"Dai hoc","Dau bep",3000000,"Pham Trung Hiu","12/12/2005",
                 "Nam",654789,123456789,"kjlk@gmail.com"));
         employeesList.add(new Employee(3 ,"Dai hoc","Le tan",4000000,"Ho Thanh Dot","04/06/2007",
                 "Nu",7415325,123456789,"abc@gmail.com"));
    }

    private int indexEmployee(int id)
    {
        int index=-1;
        for (int i=0; i<employeesList.size(); i++)
        {
            if (id==employeesList.get(i).getIdEmployee())
            {
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayEmployee() {
        List<Employee> employees = ReadAndWrite.writeEmployee(employeesList);
        for (Employee employee:employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        try {
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
            String dateOfBirth = RegexData.regexAge(input.nextLine(),BIRTHDAY_REGEX);
            System.out.print("Gender: ");
            String gender = input.nextLine();
            System.out.print("ID: ");
            int idNumber = Integer.parseInt(input.nextLine());
            System.out.print("Phone: ");
            int phone = Integer.parseInt(input.nextLine());
            System.out.print("Mail: ");
            String email = input.nextLine();
            System.out.println();
            Employee employee = new Employee(idEmployee,level,position,salary,fullName,dateOfBirth,gender,idNumber,phone,email );
            employeesList.add(employee);
            System.out.println("added success!!!");
            ReadAndWrite.writeEmployee(employeesList);

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }



    @Override
    public void editEmployee() {
        try {
            System.out.print("Edit id:");
            int edit = Integer.parseInt(input.nextLine());
            int index = indexEmployee(edit);
            if (index !=-1){
                while (true){
                    if (employeesList.get(index).getIdEmployee() == edit){
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
                        String dateOfBirthEdit = RegexData.regexAge(input.nextLine(),BIRTHDAY_REGEX);
                        System.out.print("Edit Gender: ");
                        String genderEdit = input.nextLine();
                        System.out.print("Edit ID: ");
                        int idNumberEdit = Integer.parseInt(input.nextLine());
                        System.out.print("Edit Phone: ");
                        int phoneEdit = Integer.parseInt(input.nextLine());
                        System.out.print("Edit Mail: ");
                        String emailEdit = input.nextLine();
                        System.out.println();
                        employeesList.set(index,new Employee(idEmployeeEdit,levelEdit,positionEdit,salaryEdit,fullNameEdit,dateOfBirthEdit,genderEdit,idNumberEdit,phoneEdit,emailEdit));
                        System.out.println("Edited success!!!");
                        ReadAndWrite.writeEmployee(employeesList);
                        break;
                    }
                }
            }else {
                System.out.println("Not found employee to edit");
            }

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }



    }
}
