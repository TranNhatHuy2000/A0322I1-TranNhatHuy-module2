package CaseStudy.Services;

import CaseStudy.Models.Employee;
import CaseStudy.repository.EmployeeRepository;
import CaseStudy.repository.EmployeeRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public void displayEmployee() {
        employeeRepository.displayEmployee();
    }

    @Override
    public void addEmployee() {
        employeeRepository.addEmployee();
    }

    @Override
    public void editEmployee() {
        employeeRepository.editEmployee();
    }

}
