package ss10_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.TreeMap;

public class bt2_CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TreeMap<Character,Integer> sameChar = new TreeMap<>();

        System.out.println("Nhap chuoi");
        String string = input.nextLine();
        string.toLowerCase();
        for (int i = 0; i < string.length();i++){
            if (sameChar.get(string.charAt(i)) != null ){
                int count= sameChar.get(string.charAt(i));
                count++;
                sameChar.put(string.charAt(i),count);
            }else {
                sameChar.put(string.charAt(i),1);
            }
        }
        System.out.println(sameChar);
    }
}
