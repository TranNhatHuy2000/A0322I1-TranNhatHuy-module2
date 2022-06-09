package ss01_introduction_java.thuchanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("nhập năm: ");
        year = input.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 == 0){
                System.out.println(year+" là năm nhuận");
            }else {
                System.out.println(year+" là năm nhuận");
            }
        }else {
            System.out.println(year+" không phải năm nhuận");
        }
    }
}
