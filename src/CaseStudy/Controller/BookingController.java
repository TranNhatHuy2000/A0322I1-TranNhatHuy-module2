package CaseStudy.Controller;

import CaseStudy.Services.BookingService;
import CaseStudy.Services.BookingServiceImpl;
import CaseStudy.Services.ContactService;
import CaseStudy.Services.ContactServiceImpl;

import java.util.Scanner;

public class BookingController {
    /*---------------------------------------------Booking---------------------------------------------*/
    private static BookingService bookingService = new BookingServiceImpl();
    private static ContactService contactService = new ContactServiceImpl();
    public static void menuBooking(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayBooking();
                    break;

                case 3:
                    contactService.createNewContract();
                    break;
                case 4:
                    contactService.displayListContracts();
                    break;
                case 5:
                    contactService.editContracts();
                    break;
                case 6:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
