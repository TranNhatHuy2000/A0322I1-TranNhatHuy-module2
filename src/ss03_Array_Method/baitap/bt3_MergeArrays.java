package ss03_Array_Method.baitap;

import java.util.Scanner;

public class bt3_MergeArrays {
    public static void main(String[] args) {
        int size1;
        int size2;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1:");
        size1 = input.nextInt();
        System.out.print("Nhập kích thước mảng 2:");
        size2 = input.nextInt();

        int arrFirst[] = new int[size1];
        int arrSecond[] = new int[size2];
        int arrMerge[] = new int[arrFirst.length+arrSecond.length];

        for(int index = 0; index < arrFirst.length; index++){
            System.out.print("Mảng 1: Nhập giá trị ở vị trí "+index+" của mảng: ");
            int value = input.nextInt();
            arrFirst[index] = value;
        }

        for(int index = 0; index < arrSecond.length; index++){
            System.out.print("Mảng 2: Nhập giá trị ở vị trí "+index+" của mảng: ");
            int value = input.nextInt();
            arrSecond[index] = value;
        }

        for(int index = 0; index < arrFirst.length; index++){
            arrMerge[index] = arrFirst[index];
        }

        for(int index = 0; index < arrSecond.length; index++){
            arrMerge[index + arrFirst.length] = arrSecond[index];
        }

        System.out.print("Mảng gộp của mảng 1 và mảng 2 là: ");
        for (int element :arrMerge) {
            System.out.print(element+" ");
        }

    }
}
