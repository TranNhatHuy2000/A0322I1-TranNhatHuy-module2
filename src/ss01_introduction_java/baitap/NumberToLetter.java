package ss01_introduction_java.baitap;

import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        int number;
        String donvi;
        Scanner input = new Scanner(System.in);
        number =  input.nextInt();
        if (number > 0 && number < 10 ){
            switch (number){
                case 1:
                    donvi = "one";
                    System.out.println(number +":"+donvi);
                    break;
                case 2:
                    donvi = "two";
                    System.out.println(number +":"+donvi);
                    break;
                case 3:
                    donvi = "three";
                    System.out.println(number +":"+donvi);
                    break;
                case 4:
                    donvi = "four";
                    System.out.println(number +":"+donvi);
                    break;
                case 5:
                    donvi = "five";
                    System.out.println(number +":"+donvi);
                    break;
                case 6:
                    donvi = "six";
                    System.out.println(number +":"+donvi);
                    break;
                case 7:
                    donvi = "seven";
                    System.out.println(number +":"+donvi);
                    break;
                case 8:
                    donvi = "eight";
                    System.out.println(number +":"+donvi);
                    break;
                case 9:
                    donvi = "nine";
                    System.out.println(number +":"+donvi);
                    break;
                default:
                    System.out.println(" out of ability");
                    break;
            }

        }
    }
}
