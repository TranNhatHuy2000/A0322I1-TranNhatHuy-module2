package ss16_IO_BinaryFile.baitap.QLSP;

import java.io.Serializable;

public class Product implements Serializable {
    public Product(int codeProduct, String nameProduct, String manufacturer, double price, String otherDescriptions) {
        this.codeProduct = codeProduct;
        this.nameProduct = nameProduct;
        this.manufacturer = manufacturer;
        this.price = price;
        this.otherDescriptions = otherDescriptions;
    }

    int  codeProduct ;
    String nameProduct;
    String manufacturer;
    double price ;
    String otherDescriptions;

    public int getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(int codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String maanufacturer) {
        this.manufacturer = maanufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescriptions() {
        return otherDescriptions;
    }

    public void setOtherDescriptions(String otherDescriptions) {
        this.otherDescriptions = otherDescriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "codeProduct=" + codeProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", otherDescriptions='" + otherDescriptions + '\'' +
                '}';
    }
}
