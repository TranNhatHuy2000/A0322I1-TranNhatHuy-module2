package Final2.repository;
import CaseStudy.Ultils.RegexData;
import Final.Ultils.ReadAndWriteToCSV;
import Final2.models.TaiKhoanThanhToan;
import Final2.models.TaiKhoangNganHang;
import Final2.models.TaiKhoangTietKiem;
import Final2.ultils.NotFoundBankAccountException;
import Final2.ultils.WriteAndReadCSV;

import java.util.ArrayList;
import java.util.Scanner;

public class TaiKhoangRepositoryImpl implements TaiKhoangRepository{
    private static ArrayList<TaiKhoangNganHang> taiKhoangNganHangs  = WriteAndReadCSV.readListFromCSV();
    private static Scanner input = new Scanner(System.in);

    public static final String REGEX="^[1-9]\\d*$";  // > 0

    private String tienTK(){
        System.out.print("Số tiền gửi tiết kiệm:");
        return RegexData.regexStr(input.nextLine(),REGEX,"Sô tiền tiết kiệm phải > 0");
    }
    private String soThe(){
        System.out.print("Số thẻ:");
        return RegexData.regexStr(input.nextLine(),REGEX,"Số thẻ phải > 0");
    }
    private String tienTaiKhoan(){
        System.out.print("Số tiền trong tài khoản:");
        return RegexData.regexStr(input.nextLine(),REGEX,"Số tiền tài khoản > 0");
    }

    @Override
    public void xemDanhSachTK() {
        ArrayList<TaiKhoangNganHang> list = WriteAndReadCSV.writeToCSV(taiKhoangNganHangs);
        for (TaiKhoangNganHang taiKhoangNganHang:list) {
            System.out.println(taiKhoangNganHang);
        }
    }

    @Override
    public void themTaiKhoanTK() {
        try {
            System.out.print("Thêm mới mã tài khoảng: ");
            String maTK = input.nextLine();
            System.out.print("Tên chủ tài khoản:");
            String tenChuTK = input.nextLine();
            System.out.print("Ngày tạo tài khoảng: ");
            String ngayTaoTK = input.nextLine();

            Double soTienTK = Double.parseDouble(tienTK());
            System.out.print("Ngày gửi tiết kiệm: ");
            String ngayGuiTK = input.nextLine();
            System.out.print("Lãi suất : ");
            Double laiSuat = Double.parseDouble(input.nextLine());
            System.out.print("Kì hạn : ");
            String kiHan = input.nextLine();
            System.out.println();
            TaiKhoangTietKiem khoangTietKiem = new TaiKhoangTietKiem(maTK,tenChuTK,ngayTaoTK,soTienTK,ngayGuiTK,laiSuat,kiHan);
            taiKhoangNganHangs.add(khoangTietKiem);
            WriteAndReadCSV.writeToCSV(taiKhoangNganHangs);
            System.out.println("Thêm thành công!!!");


        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }
    }

    @Override
    public void themTaiKhoanTT() {
        try {
            System.out.print("Thêm mới mã tài khoảng: ");
            String maTK = input.nextLine();
            System.out.print("Tên chủ tài khoản");
            String tenChuTK = input.nextLine();
            System.out.print("Ngày tạo tài khoảng: ");
            String ngayTaoTK = input.nextLine();

            int soThe = Integer.parseInt(soThe());

            Double soTienTT = Double.parseDouble(tienTaiKhoan());
            System.out.println();
            TaiKhoanThanhToan khoanThanhToan = new TaiKhoanThanhToan(maTK,tenChuTK,ngayTaoTK,soThe,soTienTT);
            taiKhoangNganHangs.add(khoanThanhToan);
            WriteAndReadCSV.writeToCSV(taiKhoangNganHangs);
            System.out.println("Thêm thành công!!!");

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }
    }

    private int indexTaiKhoan(int id)
    {
        int index=-1;
        for (int i=0; i<taiKhoangNganHangs.size(); i++)
        {
            if (id==taiKhoangNganHangs.get(i).getIdTaiKhoan())
            {
                index=i;
                break;
            }
        }
        return index;
    }

    @Override
    public void xoaTaiKhoan() {
        try {
            System.out.print("Nhập id tài khoản muốn xóa:");
            int del = Integer.parseInt(input.nextLine());
            int index = indexTaiKhoan(del);
            boolean check = true;
            if (index !=-1){
                while (check){
                    System.out.println("Có chắc muốn xóa không đấy?\n" +
                            "1.xóa .\n" +
                            "2.Không xóa. \n" +
                            "3.exit\n");
                    switch (input.nextLine()) {
                        case "1":
                            if (taiKhoangNganHangs.get(index).getIdTaiKhoan() == del){
                                taiKhoangNganHangs.remove(del);
                                WriteAndReadCSV.writeToCSV(taiKhoangNganHangs);
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
                throw new NotFoundBankAccountException("không tìm thấy tài khoản muôn xóa");
            }

        }catch (NumberFormatException e){
            System.err.println("Nhập sai kiểu rồi ba");
        } catch (NotFoundBankAccountException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void timKiemTaiKhoan() {
        try {
            System.out.print("Nhập id sản tài khoản muốn tìm kiếm:");
            int search = Integer.parseInt(input.nextLine());
            int index = indexTaiKhoan(search);
            if (index !=-1){
                while (true){
                    if (taiKhoangNganHangs.get(index).getIdTaiKhoan() == search){
                        System.out.println(taiKhoangNganHangs.get(index));
                        break;
                    }
                }
            }else {
                System.out.println("Tài khoản không tồn tại");
            }

        }catch (NumberFormatException e){
            System.err.println("Nhập sai kiểu rồi ba");
        }
    }
}
