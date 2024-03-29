package CaseStudy.Controller;
import java.util.Scanner;

public class FuramaController {

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n"+
                    "5. Promotion Management\n"+
                    "6. Exit");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }

            switch (choice){
                case 1:
                    EmployeeController.menuEmployee();
                    break;
                case 2:
                    CustomerController.menuCustomer();
                    break;
                case 3:
                    FacilityController.menuFacility();
                    break;
                case 4:
                    BookingController.menuBooking();
                    break;
                case 5:
                    menuPromotion();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }


    public static void menuPromotion(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 3) {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            System.out.print("input choice: ");
            choice = input.nextInt();
            switch (choice){
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
