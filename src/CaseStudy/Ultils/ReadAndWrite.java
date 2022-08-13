package CaseStudy.Ultils;

import CaseStudy.Models.Employee;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadAndWrite {

    public static List<Employee> writeEmployee(List<Employee> employeeList){
        File file = new File("D:\\codegym\\module2\\src\\CaseStudy\\data\\employee.csv");
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch (Exception e){
                System.out.println("File no found");
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Employee employee: employeeList) {
                bufferedWriter.write(employee.getIdEmployee()+","+employee.getLevel()+","+employee.getPosition()+","+employee.getSalary()+","+employee.getFullName()+ ","+
                        employee.getDateOfBirth()+","+employee.getGender()+","+employee.getIdNumber()+","+employee.getEmail());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }


    public static List<Employee> readEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        File file = new File("D:\\codegym\\module2\\src\\CaseStudy\\data\\employee.csv");
        FileReader fileReader = null;
        BufferedReader buffRead = null;
        if (!file.exists()) {
            try {
                file.createNewFile();
            }catch (Exception e){
                System.out.println("File no found");
            }
        }
        try {
             fileReader = new FileReader(file);
             buffRead = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;
            while ((line = buffRead.readLine()) != null) {
                temp = line.split(",");
                int idEmployee = Integer.parseInt(temp[0]);
                String level = temp[1];
                String position = temp[2];
                double salary = Double.parseDouble(temp[3]);
                String fullName = temp[4];
                String dateOfBirth = temp[5];
                String gender = temp[6];
                int idNumber = Integer.parseInt(temp[7]);
                int phone = Integer.parseInt(temp[8]);
                String email = temp[9];

                employee = new Employee(idEmployee,level,position,salary,fullName,dateOfBirth,gender,idNumber,phone,email);
                employeeList.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
         return employeeList;
    }
}
