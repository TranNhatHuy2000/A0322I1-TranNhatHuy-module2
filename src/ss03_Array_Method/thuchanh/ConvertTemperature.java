package ss03_Array_Method.thuchanh;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9/5)*celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5/9)*fahrenheit - 32;
        return celsius;
    }

    public static void main(String[] args) {
        double fahrenheit,celsius;
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Menu\n" +
                    "1. Fahrenheit to Celsius\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "0. Exit\n" +
                    "Enter your choice:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Input fahrenheit:");
                    fahrenheit = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius = "+fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.print("Input celsius:");
                    celsius = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit = "+celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }while (choice != 0);
    }
}


