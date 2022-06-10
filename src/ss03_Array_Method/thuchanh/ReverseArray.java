package ss03_Array_Method.thuchanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập độ lớn của mảng:");
            size = input.nextInt();
            if (size>20){
                System.out.println("Độ lớn không được quá 20");
            }
        }while (size>20);
        int[] array = new int[size];
        for (int i = 0;i < array.length;i++){
            System.out.print("nhập phần thử thứ "+(i+1)+" ở vị trí "+i+": ");
            array[i] = input.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int element : array) {
            System.out.print(element+" ");
        }
        System.out.println();
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.print("Mảng sau khi đảo là: ");
        for (int newelement : array) {
            System.out.print(newelement+" ");
        }

    }
}
