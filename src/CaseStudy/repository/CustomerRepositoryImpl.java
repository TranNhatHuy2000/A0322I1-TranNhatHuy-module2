package CaseStudy.repository;

import CaseStudy.Models.Customer;
import CaseStudy.Models.Employee;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    private static List<Customer> customerList ;
    static {
        customerList = new LinkedList<>();
        customerList.add(new Customer(1 ,"Vip","Hue","Tran Nhat Huy","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        customerList.add(new Customer(2 ,"Normal","Da Nag","Ho Thanh Dot","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        customerList.add(new Customer(3 ,"Vip","Quang Tri","Ngoc Dinh","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
    }

    public static List<Customer> getCustomerList() {
        return customerList;
    }

    @Override
    public List<Customer> displayCustomer() {
        return customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerList.add(customer);

    }

    @Override
    public void editCustomer(int id, Customer customer) {
        for (int i=0; i<customerList.size(); i++)
        {
            if (id==customerList.get(i).getIdCustomer())
            {
                id=i;
                break;
            }
        }
        customerList.set(id,customer);
    }
}
