package ss01_introduction_java.baitap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello "+name);
    }
}
