package Final2.models;

public abstract class TaiKhoangNganHang {
    private int idTaiKhoan;
    private String maTaiKhoang;
    private String tenChuTaiKhoang ;
    private  String ngayTaoTaiKhoang;
    public static int tangId = 0;

    public TaiKhoangNganHang(String maTaiKhoang, String tenChuTaiKhoang, String ngayTaoTaiKhoang) {
        this.idTaiKhoan = tangId;
        this.maTaiKhoang = maTaiKhoang;
        this.tenChuTaiKhoang = tenChuTaiKhoang;
        this.ngayTaoTaiKhoang = ngayTaoTaiKhoang;
        increaID();
    }
    public static void increaID(){
        tangId++;
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getMaTaiKhoang() {
        return maTaiKhoang;
    }

    public void setMaTaiKhoang(String maTaiKhoang) {
        this.maTaiKhoang = maTaiKhoang;
    }

    public String getTenChuTaiKhoang() {
        return tenChuTaiKhoang;
    }

    public void setTenChuTaiKhoang(String tenChuTaiKhoang) {
        this.tenChuTaiKhoang = tenChuTaiKhoang;
    }

    public String getNgayTaoTaiKhoang() {
        return ngayTaoTaiKhoang;
    }

    public void setNgayTaoTaiKhoang(String ngayTaoTaiKhoang) {
        this.ngayTaoTaiKhoang = ngayTaoTaiKhoang;
    }

    public String getInfoCSV(){
        return idTaiKhoan+","+maTaiKhoang+","+tenChuTaiKhoang+","+ngayTaoTaiKhoang;
    }

    @Override
    public String toString() {
        return "TaiKhoangNganHang{" +
                "idTaiKhoan=" + idTaiKhoan +
                ", maTaiKhoang='" + maTaiKhoang + '\'' +
                ", tenChuTaiKhoang='" + tenChuTaiKhoang + '\'' +
                ", ngayTaoTaiKhoang='" + ngayTaoTaiKhoang + '\'' +
                '}';
    }
}
