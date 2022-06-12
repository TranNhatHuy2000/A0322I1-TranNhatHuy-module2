package ss03_Array_Method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bt7_TongDuongCheoMaTranVuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số kích thước cho ma trân vuông:");
        int size = input.nextInt();

        int[][] array = new int[size][size];
        for (int i = 0;i < array.length; i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print("Nhập phần tử ở hàng "+i+" cột "+j+" :");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: "+ Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length; j++){
                if (j == i){
                    sum += array[i][j];
                    break;
                }
            }
        }
        System.out.print("Tổng của các phần tử trong đường chéo chính là:"+sum);
    }
}
