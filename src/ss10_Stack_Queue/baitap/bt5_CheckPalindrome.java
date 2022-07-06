package ss10_Stack_Queue.baitap;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bt5_CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input palindrome:");
        String palindrome = scanner.nextLine();
        palindrome = palindrome.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i =0;i < palindrome.length();i++){
            stack.push(palindrome.charAt(i));
            queue.add(palindrome.charAt(i));
        }

        boolean check = false;
        while (!stack.empty()){
            if (stack.pop().equals(queue.poll())){
                check = true;
            }else {
                check = false;
            }
        }

        if (check){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
