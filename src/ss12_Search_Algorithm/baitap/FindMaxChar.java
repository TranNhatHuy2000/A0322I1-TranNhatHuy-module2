package ss12_Search_Algorithm.baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input string: ");
        String string = input.nextLine();

        LinkedList<Character> maxChar = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > maxChar.size()) {
                maxChar.clear();
                maxChar.addAll(list);
            }
            list.clear();
        }

        for (Character character: maxChar) {
            System.out.print(character);
        }
        System.out.println();
    }

}

