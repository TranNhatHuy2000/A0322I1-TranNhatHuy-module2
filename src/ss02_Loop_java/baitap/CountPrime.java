package ss02_Loop_java.baitap;

import java.util.Scanner;

public class CountPrime {
    public static void main(String[] args) {
        int number, count = 0, N=2;
        boolean check = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in: ");
        number = input.nextByte();
        for (int i = 2; i <= number;){
            for (int j = 2 ;j <= Math.sqrt(N) ;j++) {
                if (N%j==0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                i++;
                System.out.println(N);
            }
            check = true;
            N++;
        }
        }
    }

