package Final2.ultils;

import Final2.models.TaiKhoanThanhToan;
import Final2.models.TaiKhoangNganHang;
import Final2.models.TaiKhoangTietKiem;

import java.io.*;
import java.util.ArrayList;

public class WriteAndReadCSV {
    public static ArrayList<TaiKhoangNganHang> writeToCSV(ArrayList<TaiKhoangNganHang> taiKhoangNganHangs) {
        File file = new File("D:\\codegym\\module2\\src\\Final2\\data\\TaiKhoangNganHang.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, false);// append: true // cho phép ghi tiếp/ false nghi đề
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (TaiKhoangNganHang taiKhoangNganHang : taiKhoangNganHangs) {
                if (taiKhoangNganHang instanceof TaiKhoangTietKiem) {
                    bufferedWriter.write("TK," + taiKhoangNganHang.getInfoCSV());
                    bufferedWriter.newLine();
                } else {
                    bufferedWriter.write("TT," + taiKhoangNganHang.getInfoCSV()+",,");
                    bufferedWriter.newLine();
                }

            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
        }
        return taiKhoangNganHangs;
    }

    public static ArrayList<TaiKhoangNganHang> readListFromCSV() {
        ArrayList<TaiKhoangNganHang> taiKhoangNganHangs = new ArrayList<>();
        try {
            File file = new File("D:\\codegym\\module2\\src\\Final2\\data\\TaiKhoangNganHang.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line ;
            String temp[] ;
            TaiKhoangNganHang taiKhoangNganHang;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                if (temp[0].trim().equals("TK")) {
                    taiKhoangNganHang = new TaiKhoangTietKiem(temp[2],temp[3],temp[4],Double.parseDouble(temp[5]), temp[6], Double.parseDouble(temp[7]),temp[8]) {
                    };
                } else {
                    taiKhoangNganHang = new TaiKhoanThanhToan(temp[2],temp[3],temp[4],Integer.parseInt(temp[5]), Double.parseDouble(temp[6])) {
                    };
                }
                taiKhoangNganHangs.add(taiKhoangNganHang);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        return taiKhoangNganHangs;
    }

}
