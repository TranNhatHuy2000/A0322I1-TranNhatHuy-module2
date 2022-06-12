package ss03_Array_Method.thuchanh;

import java.util.Scanner;

public class FindMinElementArray {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước của mảng:");
            size = input.nextInt();
            if (size>20){
                System.out.println("kích thước không được quá 20");
            }
        }while (size>20);
        System.out.println();
        int[] array = new int[size];
        for (int i=0; i < array.length;i++){
            System.out.print("nhập phần tử thứ "+(i+1)+" tại vị trí thứ "+i+":");
            array[i]=input.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int element : array){
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.println("Phần tử nhỏ nhất của mảng là: " + minValue(array));
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
