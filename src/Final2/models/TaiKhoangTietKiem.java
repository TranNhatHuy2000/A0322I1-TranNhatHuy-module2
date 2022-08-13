package Final2.models;

public class TaiKhoangTietKiem extends TaiKhoangNganHang {
    private double soTienTietKiem;
    private String ngayGui;
    private double laiSuat;
    private String kiHan;

    public TaiKhoangTietKiem(String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang, double soTienTietKiem, String ngayGui, double laiSuat, String kiHan) {
        super(maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
        this.soTienTietKiem = soTienTietKiem;
        this.ngayGui = ngayGui;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoangTietKiem(String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang) {
        super(maTaiKhoang, tenChuTaiKhoang, ngayTaoTaiKhoang);
    }

    public double getSoTienTietKiem() {
        return soTienTietKiem;
    }

    public void setSoTienTietKiem(double soTienTietKiem) {
        this.soTienTietKiem = soTienTietKiem;
    }

    public String getNgayGui() {
        return ngayGui;
    }

    public void setNgayGui(String ngayGui) {
        this.ngayGui = ngayGui;
    }

    public double getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(double laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String getInfoCSV() {
        return super.getInfoCSV()+","+soTienTietKiem+","+ngayGui+","+laiSuat+","+kiHan;
    }

    @Override
    public String toString() {
        return super.toString()+ "TaiKhoangTietKiem{" +
                "soTienTietKiem=" + soTienTietKiem +
                ", ngayGui='" + ngayGui + '\'' +
                ", laiSuat=" + laiSuat +
                ", kiHan='" + kiHan + '\'' +
                '}';
    }
}
