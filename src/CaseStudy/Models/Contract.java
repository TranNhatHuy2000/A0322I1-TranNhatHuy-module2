package CaseStudy.Models;

public class Contract {
    private int contractNumber;    /*So hop dong*/
    private int bookingCode;       /*Ma booking*/
    private double advanceDeposit;    /*So tien coc truoc*/
    private double totalPayment;      /*Tong so tien thanh toan*/
    private int idCustomer;           /*Ma khach hang*/

    public Contract(){}

    public Contract(int contractNumber, int bookingCode, double advanceDeposit, double totalPayment, int idCustomer) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getAdvanceDeposit() {
        return advanceDeposit;
    }

    public void setAdvanceDeposit(double advanceDeposit) {
        this.advanceDeposit = advanceDeposit;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", advanceDeposit=" + advanceDeposit +
                ", totalPayment=" + totalPayment +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
