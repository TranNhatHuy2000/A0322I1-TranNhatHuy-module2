package Final.Models;

public class InProduct extends Product {
    private double gianNhapKhau;
    private String tinhThanhNhap;
    private double thueNhapKhau;


    public InProduct(String maSanPham, double giaSanPham, int soLuongSanPHam, String nhaSanXuat) {
        super(maSanPham, giaSanPham, soLuongSanPHam, nhaSanXuat);
    }

    public InProduct(String maSanPham, double giaSanPham, int soLuongSanPHam, String nhaSanXuat, double gianNhapKhau, String tinhThanhNhap, double thueNhapKhau) {
        super(maSanPham, giaSanPham, soLuongSanPHam, nhaSanXuat);
        this.gianNhapKhau = gianNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    public double getGianNhapKhau() {
        return gianNhapKhau;
    }

    public void setGianNhapKhau(double gianNhapKhau) {
        this.gianNhapKhau = gianNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String getInfoCSV() {
        return super.getInfoCSV()+","+gianNhapKhau+","+tinhThanhNhap+","+thueNhapKhau;
    }

    @Override
    public String toString() {
        return super.toString()+"InProduct{" +
                "gianNhapKhau=" + gianNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
