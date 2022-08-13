package CaseStudy.Services;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;

import java.util.List;

public interface CustomerService extends Service {
    void displayCustomer();
    void addCustomer();
    void editCustomer();
}
