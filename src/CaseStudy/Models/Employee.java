package CaseStudy.Models;

public class Employee extends Person {
    private int idEmployee;     /*Ma nhan vien*/
    private String level;       /* trinh do */
    private String position;    /* vi tri */
    private double salary;      /* luong */

    public Employee(){

    }
    public Employee( int idEmployee, String level, String position, double salary,
                     String fullName, String dateOfBirth, String gender, int idNumber, int phone, String email) {
        super(fullName, dateOfBirth, gender, idNumber, phone, email);
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int idEmployee, String level, String position, double salary) {
        this.idEmployee = idEmployee;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }


    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { " +
                super.toString()+
                ", idEmployee=" + idEmployee +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
