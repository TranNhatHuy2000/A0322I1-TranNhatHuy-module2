package CaseStudy.Services;

import CaseStudy.Models.Employee;

import java.util.List;

public interface EmployeeService extends Service {
    void displayEmployee();
    void addEmployee();
    void editEmployee();
}
