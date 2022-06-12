package ss01_introduction_java.baitap;

import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        int number;
        String str ="" ;
        System.out.print("Nhập số: ");
        Scanner input = new Scanner(System.in);
        number =  input.nextInt();
        if (number > 0 && number < 10 ){
            switch (number){
                case 1:
                    str = "one";
                    System.out.println(number +":"+str);
                    break;
                case 2:
                    str = "two";
                    System.out.println(number +":"+str);
                    break;
                case 3:
                    str = "three";
                    System.out.println(number +":"+str);
                    break;
                case 4:
                    str = "four";
                    System.out.println(number +":"+str);
                    break;
                case 5:
                    str = "five";
                    System.out.println(number +":"+str);
                    break;
                case 6:
                    str = "six";
                    System.out.println(number +":"+str);
                    break;
                case 7:
                    str = "seven";
                    System.out.println(number +":"+str);
                    break;
                case 8:
                    str = "eight";
                    System.out.println(number +":"+str);
                    break;
                case 9:
                    str = "nine";
                    System.out.println(number +":"+str);
                    break;
                default:
                    System.out.println(" out of ability");
                    break;
            }
        }else if (number<20){
            int units = number%10;
            switch (units){
                case 0:
                    str = "ten";
                    System.out.println(number +":"+str);
                    break;
                case 1:
                    str = "eleven";
                    System.out.println(number +":"+str);
                    break;
                case 2:
                    str = "Twelve";
                    System.out.println(number +":"+str);
                    break;
                case 3:
                    str = "Thirteen";
                    System.out.println(number +":"+str);
                    break;
                case 4:
                    str = "Fourteen";
                    System.out.println(number +":"+str);
                    break;
                case 5:
                    str = "Fifteen";
                    System.out.println(number +":"+str);
                    break;
                case 6:
                    str = "Sixteen";
                    System.out.println(number +":"+str);
                    break;
                case 7:
                    str = "Seventeen";
                    System.out.println(number +":"+str);
                    break;
                case 8:
                    str = "Eighteen";
                    System.out.println(number +":"+str);
                    break;
                case 9:
                    str = "Nineteen";
                    System.out.println(number +":"+str);
                    break;
            }
        }else if (number < 100){
            int ones = number%10;
            int tens = number/10;
            switch (tens){
                case 2:
                    str ="Twenty";
                    System.out.print(number +":"+str);
                    break;
                case 3:
                    str ="Thirty";
                    System.out.print(number +":"+str);
                    break;
                case 4:
                    str ="Forty";
                    System.out.print(number +":"+str);
                    break;
                case 5:
                    str ="Fifty";
                    System.out.print(number +":"+str);
                    break;
                case 6:
                    str ="Sixty";
                    System.out.print(number +":"+str);
                    break;
                case 7:
                    str ="Seventy";
                    System.out.print(number +":"+str);
                    break;
                case 8:
                    str ="Eighty";
                    System.out.print(number +":"+str);
                    break;
                case 9:
                    str ="Ninety";
                    System.out.print(number +":"+str);
                    break;
            }
            if(ones != 0) {
                switch (ones) {
                    case 1:
                        str ="one";
                        System.out.println(" "+str);
                        break;
                    case 2:
                        str ="two";
                        System.out.println(" "+str);
                        break;
                    case 3:
                        str ="three";
                        System.out.println(" "+str);
                        break;
                    case 4:
                        str ="four";
                        System.out.println(" "+str);
                        break;
                    case 5:
                        str ="five";
                        System.out.println(" "+str);
                        break;
                    case 6:
                        str ="six";
                        System.out.println(" "+str);
                        break;
                    case 7:
                        str ="seven";
                        System.out.println(" "+str);
                        break;
                    case 8:
                        str ="eight";
                        System.out.println(" "+str);
                        break;
                    case 9:
                        str ="nine";
                        System.out.println(" "+str);
                        break;
                }
            }
        }
    }
}
