package Final.Models;

public class OutProduct extends Product {
    private double giaXuatKhau;
    private String quocGia;


    public OutProduct(String maSanPham, double giaSanPham, int soLuongSanPHam, String nhaSanXuat) {
        super(maSanPham, giaSanPham, soLuongSanPHam, nhaSanXuat);
    }

    public OutProduct(String maSanPham, double giaSanPham, int soLuongSanPHam, String nhaSanXuat, double giaXuatKhau, String quocGia) {
        super(maSanPham, giaSanPham, soLuongSanPHam, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
    }

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String getInfoCSV() {
        return super.getInfoCSV()+","+giaXuatKhau+","+quocGia;
    }

    @Override
    public String toString() {
        return super.toString()+"OutProduct{" +
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
