package CaseStudy.repository;

import CaseStudy.Models.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static List<Employee> employeesList ;
    static {
         employeesList = new ArrayList<>();
         employeesList.add(new Employee(1 ,"Dai hoc","Giam doc",2000000,"Tran Nhat Huy","01/01/1999",
                 "Nam",191915126,123456789,"55abc@gmail.com"));
         employeesList.add(new Employee(2 ,"Dai hoc","Dau bep",3000000,"Pham Trung Hiu","12/12/2005",
                 "Nam",654789,123456789,"kjlk@gmail.com"));
         employeesList.add(new Employee(3 ,"Dai hoc","Le tan",4000000,"Ho Thanh Dot","04/06/2007",
                 "Nu",7415325,123456789,"abc@gmail.com"));
    }

    public static List<Employee> getEmployeesList() {
        return employeesList;
    }

    @Override
    public List<Employee> displayEmployee() {
        return employeesList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }



    @Override
    public void editEmployee(int id, Employee employee) {
        for (int i=0; i<employeesList.size(); i++)
        {
            if (id==employeesList.get(i).getIdEmployee())
            {
                id=i;
                break;
            }
        }
        employeesList.set(id,employee);
    }


}
