package CaseStudy.repository;

import CaseStudy.Models.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> displayEmployee();
    void addEmployee(Employee employee);
    void editEmployee(int index, Employee employee);

}
