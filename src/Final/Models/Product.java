package Final.Models;


public abstract class Product {
    private int idSanPham;
    private String maSanPham;
    private double giaSanPham;
    private  int soLuongSanPHam;
    private String nhaSanXuat;
    public static int tangId = 0;

    public Product(String maSanPham, double giaSanPham, int soLuongSanPHam, String nhaSanXuat) {
        this.idSanPham = tangId;
        this.maSanPham = maSanPham;
        this.giaSanPham = giaSanPham;
        this.soLuongSanPHam = soLuongSanPHam;
        this.nhaSanXuat = nhaSanXuat;
        increaID();
    }

    public static void increaID(){
        tangId++;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public int getSoLuongSanPHam() {
        return soLuongSanPHam;
    }

    public void setSoLuongSanPHam(int soLuongSanPHam) {
        this.soLuongSanPHam = soLuongSanPHam;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getInfoCSV(){
        return maSanPham+","+giaSanPham+","+soLuongSanPHam+","+nhaSanXuat;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idSanPham=" + idSanPham +
                ", maSanPham='" + maSanPham + '\'' +
                ", giaSanPham=" + giaSanPham +
                ", soLuongSanPHam=" + soLuongSanPHam +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }
}
