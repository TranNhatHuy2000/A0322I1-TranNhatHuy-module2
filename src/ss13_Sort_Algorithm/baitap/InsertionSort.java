package ss13_Sort_Algorithm.baitap;

public class InsertionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static  void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++ ){
            int currentElement = array[i];
            int k = i - 1;
            for (;k>=0 && array[k]>currentElement;k--){
                array[k+1] = array[k];
            }
            array[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
