package Final2.controller;

import Final2.service.TaiKhoangService;
import Final2.service.TaiKhoangServiceImpl;

import java.util.Scanner;

public class NganHangController {
    private static TaiKhoangService taiKhoangService = new TaiKhoangServiceImpl();

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
                    "3. Xem danh sách các tài khoản ngân hàng\n" +
                    "4. Tìm kiếm\n"+
                    "5. Thoát");
            System.out.print("Nhập: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai format rồi: "+e);
            }

            switch (choice){
                case 1:
                    displayAddNewTK();
                    break;
                case 2:
                    taiKhoangService.xoaTaiKhoan();
                    break;
                case 3:
                    taiKhoangService.xemDanhSachTK();
                    break;
                case 4: ;
                    taiKhoangService.timKiemTaiKhoan();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn đó!");
            }
        }
    }

    public  static void displayAddNewTK(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("-----Thêm tài khoản-----");
            System.out.println("1. Thêm tài khoản tiết kiệm \n" +
                    "2. Thêm tài khoản thanh toán\n" +
                    "3. Trở về "
            );
            System.out.print("Nhập: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Nhập sai format rồi: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Thêm tài khoản tiết kiệm-----");
                    taiKhoangService.themTaiKhoanTK();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-----Thêm tài khoản thanh toán-----");
                    taiKhoangService.themTaiKhoanTT();
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
