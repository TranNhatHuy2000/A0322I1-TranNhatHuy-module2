package CaseStudy.Controller;


import CaseStudy.Models.Customer;
import CaseStudy.Models.Facility;
import CaseStudy.Models.House;
import CaseStudy.Models.Room;
import CaseStudy.Services.FacilityService;
import CaseStudy.Services.FacilityServiceImpl;
import CaseStudy.repository.FacilityRepositoryImpl;

import java.util.Map;
import java.util.Scanner;

public class FacilityController {
    /*---------------------------------------------Facility---------------------------------------------*/
    private static FacilityService facilityService = new FacilityServiceImpl();
    private static Map<Facility,Integer> facilityMap = FacilityRepositoryImpl.getFacilityList();


    public static void displayFacilityList(){
        for (Facility facility :facilityService.displayFacility().keySet()){
            System.out.println(facility);
        }
    }

    public static void addNewFacility(Facility facility){
        facilityService.addFacility(facility);
    }

    public static void addRoom(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----Add Room-----");
        System.out.print("Service Name : ");
        String serviceName = input.nextLine();
        System.out.print("Area Use: ");
        double areaUse = Double.parseDouble(input.nextLine());
        System.out.print("Rental Cost: ");
        double rentalCost = Double.parseDouble(input.nextLine());
        System.out.print("Number of People: ");
        int numPeople = Integer.parseInt(input.nextLine());
        System.out.print("Rental Type: ");
        String rentalType = input.nextLine();
        System.out.print("Free Service: ");
        String freeService = input.nextLine();
        System.out.println();
        addNewFacility(new Room(serviceName,areaUse,rentalCost, numPeople,rentalType,freeService) {
        });
        System.out.println("added success!!!");
        System.out.println("-------------------------------");

    }


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
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 3:
                    addRoom();
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
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    System.out.println("-----Display List Facility-----");
                    displayFacilityList();
                    System.out.println("-------------------------------");
                    break;
                case 2:
                    displayAddNewFacility();
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
