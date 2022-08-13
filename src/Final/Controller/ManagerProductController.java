package Final.Controller;

import Final.Services.ProductService;
import Final.Services.ProductServiceImpl;

import java.util.Scanner;

public class ManagerProductController {
    private static ProductService productService = new ProductServiceImpl();

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các sản phẩm\n" +
                    "4. Tìm kiếm\n"+
                    "5. Thoát");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }

            switch (choice){
                case 1:
                    displayAddNewProduct();
                    break;
                case 2:
                    productService.xoaSanPham();
                    break;
                case 3:
                    productService.xemDanhSachSanPham();
                    break;
                case 4: ;
                    productService.timKiemSanPham();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }

    public  static void displayAddNewProduct(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("-----Thêm sản phẩm-----");
            System.out.println("1. Thêm sản phẩm nhập khẩu \n" +
                    "2. Thêm sản phẩm xuất khẩu\n" +
                    "3. Trở về "
                    );
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Thêm Sản Phẩm Nhập Khẩu-----");
                    productService.themMoiSanPhamNK();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-----Thêm Sản Phẩm Xuất Khẩu-----");
                    productService.themMoiSanPhamXK();
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
