package ss10_Stack_Queue.baitap.bt7_DemergingQueue;

import CaseStudy.Models.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EmployeeManage {
    private String name;
    private String gender;
    private String dateOfBirth;

    public EmployeeManage(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "EmployeeManage{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    public static void main(String[] args) {
        EmployeeManage employeeManage = new EmployeeManage("Dat","Nu","30/2/2009");
        EmployeeManage employeeManage1 = new EmployeeManage("Huy","Nam","1/1/2000");
        EmployeeManage employeeManage2 = new EmployeeManage("Hieu","Nu","15/1/2005");
        EmployeeManage employeeManage3 = new EmployeeManage("Dot","Nam","15/1/2010");

        Queue<EmployeeManage> nu = new LinkedList<>();
        Queue<EmployeeManage> nam = new LinkedList<>();

        List<EmployeeManage> employeeManagesList = new ArrayList<>();
        employeeManagesList.add(employeeManage1);
        employeeManagesList.add(employeeManage2);
        employeeManagesList.add(employeeManage3);
        employeeManagesList.add(employeeManage);

        int length = employeeManagesList.size();
        for (int i = 0; i < length;i++){
            if (employeeManagesList.get(i).gender.equals("Nu")){
                nu.add(employeeManagesList.get(i));
            }else{
                nam.add(employeeManagesList.get(i));
            }
        }

        employeeManagesList.clear();

        for (int i = 0 ; i <length; i++){
            if (!nu.isEmpty()){
                employeeManagesList.add(nu.poll());
                continue;
            }
            employeeManagesList.add(nam.poll());
        }

        System.out.println(employeeManagesList);

    }
}
