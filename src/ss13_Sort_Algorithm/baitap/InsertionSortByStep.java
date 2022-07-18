package ss13_Sort_Algorithm.baitap;

import java.util.Scanner;

public class InsertionSortByStep {
    public static  void insertionSortByStep(int[] array){
        for (int i = 1; i < array.length; i++ ){
            int currentElement = array[i];
            int k = i - 1;
            for (;k>=0 && array[k]>currentElement;k--){
                System.out.println("swap "+array[k+1] +" with "+ array[k]);
                array[k+1] = array[k];
            }
            array[k+1] = currentElement;
            System.out.print("List after the  " + k + "' sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }
}
