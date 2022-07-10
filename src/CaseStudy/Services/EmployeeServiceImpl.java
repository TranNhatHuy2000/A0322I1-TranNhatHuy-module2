package CaseStudy.Services;

import CaseStudy.Models.Employee;
import CaseStudy.repository.EmployeeRepository;
import CaseStudy.repository.EmployeeRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> displayEmployee() {
        return employeeRepository.displayEmployee();
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void editEmployee(int index, Employee employee) {
        employeeRepository.editEmployee(index, employee );
    }

}
