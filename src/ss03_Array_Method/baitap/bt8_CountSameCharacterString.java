package ss03_Array_Method.baitap;

import java.util.Scanner;

public class bt8_CountSameCharacterString {
    public static void main(String[] args) {
        String name = "nhat huy dep troai";
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kí tự cần đếm trong chuỗi:");
        String str = input.nextLine();
        for (int i = 0; i < name.length();i++){
            if (str.equals(Character.toString(name.charAt(i)))) {
                count ++;
            }
        }
        System.out.print("có "+count+" kí tự '"+str+"' trong chuỗi '"+name+"'");
    }
}
