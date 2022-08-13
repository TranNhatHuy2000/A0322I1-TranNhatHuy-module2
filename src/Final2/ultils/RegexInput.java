package Final2.ultils;

import java.util.Scanner;

public class RegexInput {
    static Scanner scanner = new Scanner(System.in);
    public static String regexStr(String input, String regex, String error){
        boolean check = true;
        do {
            if (input.matches(regex)){
                check = false;
            }else {
                System.out.println(error);
                input = scanner.nextLine();
            }
        }while (check);
        return input;
    }
}
