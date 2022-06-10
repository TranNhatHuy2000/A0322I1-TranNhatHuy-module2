package ss03_Array_Method.thuchanh;

import java.util.Scanner;

public class FindMaxElementArray {
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
            System.out.println("nhập phần tử thứ "+(i+1)+" tại vị trí thứ "+i+":");
            array[i]=input.nextInt();
        }
        System.out.print("Mảng vừa nhập là: ");
        for (int element : array){
            System.out.print(element+" ");
        }
        int max = array[0];
        int index = 0 ;
        for (int j = 0;j < array.length;j++){
            if (max < array[j]){
                max = array[j];
                index = j +1;
            }
        }
        System.out.println();
        System.out.println("Phần tử lớn nhất trong mảng là: "+max+" ở vị trí thứ "+index);
    }
}
