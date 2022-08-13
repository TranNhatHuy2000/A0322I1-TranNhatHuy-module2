package Final2.models;

public class TaiKhoanThanhToan extends TaiKhoangNganHang {
    private int soThe;
    private double soTien;

    public TaiKhoanThanhToan(String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang) {
        super(maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
    }

    public TaiKhoanThanhToan(String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang, int soThe, double soTien) {
        super(maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
        this.soThe = soThe;
        this.soTien = soTien;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String getInfoCSV() {
        return super.getInfoCSV()+","+soThe+","+soTien;
    }

    @Override
    public String toString() {
        return super.toString()+ "TaiKhoanThanhToan{" +
                "soThe=" + soThe +
                ", soTien=" + soTien +
                '}';
    }
}
