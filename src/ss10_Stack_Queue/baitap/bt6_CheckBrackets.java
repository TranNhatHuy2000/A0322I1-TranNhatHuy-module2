package ss10_Stack_Queue.baitap;

import java.util.Scanner;
import java.util.Stack;

public class bt6_CheckBrackets {
    public static boolean checkBrakets() {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input some thing bro: ");
        String input = scanner.nextLine();
        boolean check = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(1);
            }
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return check;
                }
                stack.pop();
            }
        }
        if (stack.size() == 0) {
            check = true;
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println(checkBrakets());
    }
}
