package ss01_introduction_java.baitap;

import java.util.Scanner;

public class Currency_conversion {
    public static void main(String[] args) {
        int vnd,usd;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số USD:");
        usd = input.nextInt();
        vnd = usd*23000;
        System.out.println("Giá trị VNĐ:"+vnd+" (vnđ)");
    }
}
