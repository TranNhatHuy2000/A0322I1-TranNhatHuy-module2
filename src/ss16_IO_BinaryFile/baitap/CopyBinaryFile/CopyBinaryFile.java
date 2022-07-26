package ss16_IO_BinaryFile.baitap.CopyBinaryFile;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    private static void copyFile(String source, String dest) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(source);
        FileOutputStream fileOutputStream = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fileInputStream.read(buffer)) > 0) {
            fileOutputStream.write(buffer, 0, length);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static void main(String[] args) {
        String source_path="D:\\codegym\\module2\\src\\ss16_IO_BinaryFile\\baitap\\CopyBinaryFile\\source";
        String dest_path="D:\\codegym\\module2\\src\\ss16_IO_BinaryFile\\baitap\\CopyBinaryFile\\dest";
        try {
            copyFile(source_path,dest_path);
            System.out.println("copy success!");
        } catch (IOException e) {
            System.out.println("copy fail!");
        }
    }
}
