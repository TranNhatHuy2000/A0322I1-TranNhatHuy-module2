package ss01_introduction_java.thuchanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double bmi, weight, height;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cân nặng (kg): ");
        weight = input.nextFloat();
        System.out.print("Nhập cân chiều cao (met): ");
        height = input.nextFloat();
        bmi = weight/Math.pow(height,2);   //Math.pow() tính lũy thừa
        if (bmi < 18.5){
            System.out.println("bmi = "+bmi+" Underweight");
        }else if (bmi < 25){
            System.out.println("bmi = "+bmi+" Normal");
        }else if(bmi < 30){
            System.out.println("bmi = "+bmi+" Overweight");
        }else {
            System.out.println("bmi = "+bmi+" Obese");
        }

    }
}
