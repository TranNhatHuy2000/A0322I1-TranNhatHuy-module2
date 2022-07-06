package ss10_Stack_Queue.baitap;


import java.util.Scanner;
import java.util.Stack;

public class bt4_DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> binary = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thập phân:");
        int deciamal = scanner.nextInt();

        while (deciamal != 0){
            binary.push(deciamal%2);
            deciamal = deciamal/2;

        }

        System.out.println("Chuyen sang nhi phan la: ");
        while (!binary.empty()){
            System.out.print(binary.pop());
        }

    }
}
