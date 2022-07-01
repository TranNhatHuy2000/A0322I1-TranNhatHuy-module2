package ss03_Array_Method.baitap;

import java.util.Scanner;

public class bt2_InsertElementArray {
    public static void main(String[] args) {
        int[] array = {4,8,6,5,2,6,5,9,0,0,5,3,8};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhâp phần tử muốn thêm vào mảng:");
        int insert = input.nextInt();
        System.out.print("Nhập vị trí thêm vào trong mảng:");
        int index = input.nextInt();
        if(index <= -1 || index > array.length-1){
            System.out.println("Không chèn được phần tử trong mảng");
        }else{
            for(int i = array.length-1; i >index;i--){
                array[i] = array[i-1];
            }
            array[index] = insert;
            System.out.print("Mảng sau khi thêm là");
            for (int element : array){
                System.out.print(element+ " ");
            }
        }

    }

}
