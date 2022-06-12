package ss03_Array_Method.baitap;

import java.lang.reflect.Array;
import java.util.Scanner;

public class b1_DeleteElementArray {
    public static void main(String[] args) {
        int size;
        int del;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước của mảng:");
            size = input.nextInt();
            if (size > 20){
                System.out.println("Nhiều vậy nhập mệt lắm");
            }
        }while (size > 20);
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++ ){
            System.out.print("Nhập phần tử ở vị trí: "+i+" của mảng :");
            array[i] = input.nextInt();
        }
        System.out.print("Mảng vừa nhâp là:");
        for (int element:array) {
            System.out.print(element+" ");
        }
        System.out.println();
        System.out.print("Nhập phần giá trị muốn xóa trong mảng:");
        del = input.nextInt();
        for (int i = 0; i < array.length;i++){
            if (array[i]==del){
                for (int j = i ;j <array.length;j++){
                    if (j == array.length-1){
                        array[j] = 0;
                        continue;
                    }
                    array[j] = array[j+1];
                }

            }
        }
        System.out.print("Mảng sau khi xóa là: ");
        for (int element:array) {
            System.out.print(element+" ");
        }
    }

}
