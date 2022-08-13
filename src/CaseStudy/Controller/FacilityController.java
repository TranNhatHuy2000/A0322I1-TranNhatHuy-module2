package CaseStudy.Controller;

import CaseStudy.Models.Facility;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Models.Villa;
import CaseStudy.Services.FacilityService;
import CaseStudy.Services.FacilityServiceImpl;
import CaseStudy.repository.FacilityRepositoryImpl;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    /*---------------------------------------------Facility---------------------------------------------*/
    private static FacilityService facilityService = new FacilityServiceImpl();

    public  static void displayAddNewFacility(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("-----Add New Facility-----");
            System.out.println("1. Add New Villa \n" +
                    "2. Add new House\n" +
                    "3. Add New Room \n" +
                    "4. Back to menu");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Add Villa-----");
                    facilityService.addNewVilla();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    System.out.println("-----Add House-----");
                    facilityService.addNewHouse();
                    System.out.println("-------------------------------");
                    break;
                case 3:
                    System.out.println("-----Add Room-----");
                    facilityService.addNewRoom();
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    menuFacility();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }


    public static void menuFacility(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("-----Facility Manager-----");
            System.out.println("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu");
            System.out.print("input choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            }catch (NumberFormatException e){
                System.err.println("Wrong format input: "+e);
            }
            switch (choice){
                case 1:
                    System.out.println("-----Display List Facility-----");
                    facilityService.displayFacility();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    displayAddNewFacility();
                    break;
                case 3:
                    facilityService.displayFacilityMaintenance();
                    break;
                case 4:
                    FuramaController.displayMainMenu();
                    break;
                default:
                    System.out.println("no choice");
            }
        }
    }
}
