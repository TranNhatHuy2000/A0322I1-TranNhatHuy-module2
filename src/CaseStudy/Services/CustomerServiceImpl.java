package CaseStudy.Services;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;
import CaseStudy.repository.CustomerRepository;
import CaseStudy.repository.CustomerRepositoryImpl;
import CaseStudy.repository.EmployeeRepository;
import CaseStudy.repository.EmployeeRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public void displayCustomer() {
        customerRepository.displayCustomer();
    }

    @Override
    public void addCustomer() {
        customerRepository.addCustomer();
    }

    @Override
    public void editCustomer() {
        customerRepository.editCustomer();
    }
}
