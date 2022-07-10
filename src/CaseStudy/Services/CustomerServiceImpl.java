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
    public List<Customer> displayCustomer() {
        return customerRepository.displayCustomer();
    }

    @Override
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer(int index, Customer customer) {
        customerRepository.editCustomer(index, customer );
    }
}
