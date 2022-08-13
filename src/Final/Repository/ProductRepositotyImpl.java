package Final.Repository;
import Final.Models.InProduct;
import Final.Models.OutProduct;
import Final.Models.Product;
import Final.Ultils.ReadAndWriteToCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepositotyImpl implements ProductRepository {
    private static ArrayList<Product> productList  =  ReadAndWriteToCSV.readProductListFromCSV();
    private static Scanner input = new Scanner(System.in);

    /*static {
        productList = new ArrayList<>();
        productList.add(new InProduct("nk321",456,456,"zxczxc",123,"abc",123));
        productList.add(new InProduct("nk987",987,456,"321321",123,"mmnb",123));
        productList.add(new OutProduct("xk987",454,456,"321321",123,"mmnb"));
        productList.add(new OutProduct("xk987",789,456,"321321",123,"mmnb"));
    }*/


    @Override
    public void xemDanhSachSanPham() {
        ArrayList<Product> list = ReadAndWriteToCSV.writeInProductToCSV(productList);
        for (Product product:list) {
            System.out.println(product);
        }
    }

    @Override
    public void themMoiSanPhamXK() {
        try {
            System.out.print("Thêm mới mã sản phẩm: ");
            String maSP = input.nextLine();
            System.out.print("Giá sản phẩm: ");
            double giaSP = Double.parseDouble(input.nextLine());
            System.out.print("Số lượng sản phẩm: ");
            int soluong = Integer.parseInt(input.nextLine());
            System.out.print("Nhà sản xuất: ");
            String nhaSX = input.nextLine();
            System.out.print("Giá xuất khẩu: ");
            double giaXK = Double.parseDouble(input.nextLine());
            System.out.print("Quốc gia xuất khẩu: ");
            String quocGia = input.nextLine();
            System.out.println();
            OutProduct outProduct = new OutProduct(maSP,giaSP,soluong,nhaSX,giaXK,quocGia);
            productList.add(outProduct);
            ReadAndWriteToCSV.writeInProductToCSV(productList);
            System.out.println("Thêm thành công!!!");


        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }
    }

    @Override
    public void themMoiSanPhamNK() {
        try {
            System.out.print("Thêm mới mã sản phẩm: ");
            String maSP = input.nextLine();
            System.out.print("Giá sản phẩm: ");
            double giaSP = Double.parseDouble(input.nextLine());
            System.out.print("Số lượng sản phẩm: ");
            int soluong = Integer.parseInt(input.nextLine());
            System.out.print("Nhà sản xuất: ");
            String nhaSX = input.nextLine();
            System.out.print("Giá nhập khẩu: ");
            double giaNK = Double.parseDouble(input.nextLine());
            System.out.print("Tỉnh thành nhập khẩu: ");
            String tinhThanh = input.nextLine();
            System.out.print("Thuế nhập khẩu: ");
            double thue = Double.parseDouble(input.nextLine());
            System.out.println();
            InProduct inProduct = new InProduct(maSP,giaSP,soluong,nhaSX,giaNK,tinhThanh,thue);
            productList.add(inProduct);
            System.out.println("Thêm thành công!!!");
            ReadAndWriteToCSV.writeInProductToCSV(productList);

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }
    }

    private int indexProduct(int id)
    {
        int index=-1;
        for (int i=0; i<productList.size(); i++)
        {
            if (id==productList.get(i).getIdSanPham())
            {
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public void xoaSanPham() {
        try {
            System.out.print("Nhập id sản phẩm muốn xóa:");
            int del = Integer.parseInt(input.nextLine());
            int index = indexProduct(del);
            boolean check = true;
            if (index !=-1){
                while (check){
                    System.out.println("Có chắc muốn xóa không đấy?\n" +
                            "1.xóa .\n" +
                            "2.Không xóa. \n" +
                            "3.exit\n");
                    switch (input.nextLine()) {
                        case "1":
                            if (productList.get(index).getIdSanPham() == del){
                                productList.remove(del);
                                ReadAndWriteToCSV.writeInProductToCSV(productList);
                                System.out.println("Xóa thành công!!!");
                                check = false;
                                break;
                            }
                            break;
                        case "2":
                            return;
                        case "3":
                            return;
                        default:
                            break;
                    }

                }
            }else {
                System.out.println("Not found product to delete");
            }

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }
    }

    @Override
    public void timKiemSanPham() {
        try {
            System.out.print("Nhập id sản phẩm muốn tìm kiếm:");
            int search = Integer.parseInt(input.nextLine());
            int index = indexProduct(search);
            if (index !=-1){
                while (true){
                    if (productList.get(index).getIdSanPham() == search){
                        System.out.println(productList.get(index));
                        break;
                    }
                }
            }else {
                System.out.println("Not found product to delete");
            }

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }
}
