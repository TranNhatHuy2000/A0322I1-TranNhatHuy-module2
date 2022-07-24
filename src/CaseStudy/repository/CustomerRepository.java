package CaseStudy.repository;

import CaseStudy.Models.Customer;


import java.util.List;

public interface CustomerRepository {
    List<Customer> displayCustomer();
    void addCustomer(Customer customer);
    void editCustomer(int index, Customer customer);
}
