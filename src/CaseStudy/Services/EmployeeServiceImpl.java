package CaseStudy.Services;

import CaseStudy.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employees;
    static {
        employees = new ArrayList<>();

    }
    @Override
    public List<Employee> displayEmployee() {
        return null;
    }

    @Override
    public void addEmployee(Employee employee) {

    }

    @Override
    public void editEmployee(int index, Employee employee) {

    }
}
