package CaseStudy.Services;

import CaseStudy.Models.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    List<Employee> displayEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);
}
