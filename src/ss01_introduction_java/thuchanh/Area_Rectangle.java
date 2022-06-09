package ss01_introduction_java.thuchanh;

import java.util.Scanner;

public class Area_Rectangle {
    public static void main(String[] args) {
        float width ;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chiều rộng: ");
        width = input.nextFloat();
        System.out.print("Nhập chiều cao: ");
        height = input.nextFloat();

        float area = width * height;
        System.out.println("Diện tích hcn có chiều rộng "+width+" chiều cao "+height+" là: "+area);

    }
}
