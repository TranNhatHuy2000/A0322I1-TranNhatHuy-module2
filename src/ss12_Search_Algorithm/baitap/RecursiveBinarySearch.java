package ss12_Search_Algorithm.baitap;

public class RecursiveBinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    public int binarySearch(int arr[], int value, int left, int right) {
        int mid = (left + right) / 2;
        if (right <= left) {
            return -1;
        } else {
            if (arr[mid] < value) {
                return binarySearch(arr, value, left + 1, right);
            }
            if (arr[mid] > value) {
                return binarySearch(arr, value, left, right - 1);
            }
            if (arr[mid] == value) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        System.out.println(recursiveBinarySearch.binarySearch(list,10,0,list.length));
        System.out.println(recursiveBinarySearch.binarySearch(list,77,0,list.length));
        System.out.println(recursiveBinarySearch.binarySearch(list,50,0,list.length));
    }
}
