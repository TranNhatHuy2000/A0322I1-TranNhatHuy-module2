package CaseStudy.Models;

public class Customer extends Person {
    private int idCustomer;         /*Ma khach hang*/
    private String typeCustomer;    /*Loai khach hang*/
    private String address;         /*Dia chi*/

    public Customer(){}

    public Customer(int idCustomer, String typeCustomer, String address) {
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public Customer(int idCustomer, String typeCustomer, String address,
                    String fullName, String dateOfBirth, String gender, int idNumber, int phone,String email) {
        super(fullName, dateOfBirth, gender, idNumber, phone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                ", idCustomer=" + idCustomer +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
