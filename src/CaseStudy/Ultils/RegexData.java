package CaseStudy.Ultils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
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

    public static String regexAge(String input, String regex){
        boolean check = true;
        while (check) {
            try {

                if (Pattern.matches(regex,input)){
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(input,formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age,now).getYears();
                    if (current < 100 && current >18){
                        check = false;
                    }else {
                        throw new AgeException("Age > Age > 100");

                    }
                }else {
                    throw new AgeException("Age format input wrong");
                }
            }catch (AgeException e){
                System.out.println(e.getMessage());
                input = scanner.nextLine();
            }
        }
        return input;
    }



}
