package CaseStudy.repository;

import CaseStudy.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeesList ;
   /* static {
         employeesList = new ArrayList<>();
         employeesList.add(new Employee(11 ,"mot","12/12/1999",true,"123456789C",
                 123456778,"55abc@gmail.com","Dai hoc","Phuc vu",1000100));
    }*/

    @Override
    public List<Employee> displayEmployee() {
        return employeesList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public void editEmployee(int index,Employee employee) {
        employeesList.set(index,employee);

    }
}
