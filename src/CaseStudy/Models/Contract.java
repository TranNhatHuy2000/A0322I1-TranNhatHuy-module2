package CaseStudy.Models;

public class Contract {
    private String contractNumber;    /*So hop dong*/
    private String bookingCode;       /*Ma booking*/
    private double advanceDeposit;    /*So tien coc truoc*/
    private double totalPayment;      /*Tong so tien thanh toan*/
    private int idCustomer;           /*Ma khach hang*/

    public Contract(){}

    public Contract(String contractNumber, String bookingCode, double advanceDeposit, double totalPayment, int idCustomer) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.advanceDeposit = advanceDeposit;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
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
