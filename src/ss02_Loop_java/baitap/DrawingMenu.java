package ss02_Loop_java.baitap;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        byte choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4){
            System.out.println("1.Print the rectangle\n" +
                    "\n" +
                    "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "\n" +
                    "3.Print isosceles triangle\n" +
                    "\n" +
                    "4.Exit");
            System.out.print("Enter your choice:");
            choice = input.nextByte();
            switch (choice){
                case 1:
                    for (int i = 0;i<3;i++){
                        for (int j=0;j<7;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0;i<5;i++){
                        for (int j = 0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    for (int i = 5;i>0;i--){
                        for (int j = 0;j<i;j++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    System.out.println("\n");
            }

        }
    }
}
