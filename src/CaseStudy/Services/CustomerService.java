package CaseStudy.Services;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> displayCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
}
