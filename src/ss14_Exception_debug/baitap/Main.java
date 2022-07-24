package ss14_Exception_debug.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.println("Input a: ");
                double a = Double.parseDouble(scanner.nextLine());
                System.out.println("Input b: ");
                double b = Double.parseDouble(scanner.nextLine());
                System.out.println("Input c: ");
                double c =  Double.parseDouble(scanner.nextLine());
                Triangle triangle = new Triangle(a,b,c);
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }while (true);
    }
}
