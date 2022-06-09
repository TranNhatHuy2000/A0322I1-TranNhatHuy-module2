package ss01_introduction_java.thuchanh;

import java.util.Scanner;

public class First_Equation {
    public static void main(String[] args) {
        float a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Phương trình có dạng: ax+b=c");
        System.out.print("Nhập a=");
        a = input.nextFloat();
        System.out.print("Nhập b=");
        b = input.nextFloat();
        System.out.print("Nhập c=");
        c = input.nextFloat();
        float x ;
        if (a != 0){
            x = (c-b)/a;
            System.out.println("Phương trình có nghiệm x ="+x);
        }else if (b == c){
            System.out.println("Phương trình có vô só nghiệm");
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
