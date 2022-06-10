package ss03_Array_Method.thuchanh;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.print("input the name: ");
        String name = input.nextLine();
        boolean isExit = false;
        for (int i = 0; i < student.length;i++){
            if (name.equals(student[i])){
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("not found!");
        }
    }
}
