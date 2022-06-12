package ss03_Array_Method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class bt6_SumColArray_2chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số hàng:");
        int row = input.nextInt();
        System.out.print("Nhập số cột:");
        int col = input.nextInt();

        int[][] array = new int[row][col];
        for (int i = 0;i < array.length; i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print("Nhập phần tử ở hàng "+i+" cột "+j+" :");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập là: "+ Arrays.deepToString(array));
        int choiceCol;
        do {
            System.out.print("Nhập cột muốn tính tổng:");
            choiceCol = input.nextInt();
            if (choiceCol > row){
                System.out.print("không có cột đó trong mảng trong mảng!");
            }
        }while (choiceCol > row);
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length; j++){
                if (j == choiceCol){
                    sum += array[i][j];
                }
            }
        }
        System.out.print("Tổng của các phần tử trong cột "+choiceCol+" là:"+sum);
    }
}
