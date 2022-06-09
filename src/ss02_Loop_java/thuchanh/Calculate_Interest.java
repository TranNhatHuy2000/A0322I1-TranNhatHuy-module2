package ss02_Loop_java.thuchanh;

import java.util.Scanner;

public class Calculate_Interest {
    public static void main(String[] args) {
        float money, interestRate, totalInterest=0;
        int month;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số tiền muốnn vay:");
        money = input.nextFloat();
        System.out.print("Nhập lãi suất:");
        interestRate = input.nextFloat();
        System.out.print("Nhập tháng:");
        month = input.nextInt();

        for (int i = 0; i < month;i++){
            totalInterest += money*(interestRate/100)/12*month;
        }

        System.out.println("Total of interest: " + totalInterest);
    }
}
