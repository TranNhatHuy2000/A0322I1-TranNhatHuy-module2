package ss03_Array_Method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bt5_FindMinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước của mảng: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0 ; i < array.length; i++){
            System.out.print("Nhập phần tử ở vị trí thứ "+i+" của mảng:");
            array[i] = input.nextInt();
        }
        System.out.println("Mảng sau khi nhập là: "+ Arrays.toString(array));
        int Min = array[0];
        for (int i = 0 ; i < array.length; i++){
            if(Min > array[i]){
                Min = array[i];
            }
        }
        System.out.print("Giái trị nhỏ nhất của mảng là:"+Min);
    }
}
