package CaseStudy.repository;

import CaseStudy.Models.*;
import CaseStudy.Ultils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityRepositoryImpl implements  FacilityRepository {
    private static Map<Facility,Integer> facilityList;
    private static Scanner input = new Scanner(System.in);

    public static final String REGEX_NAME = "[A-Z][a-z]+";   //viet hoa chu cai dau
    public static final String REGEX_ID_SERVICE="^SV[VL|HO|RO].[-][\\d]{4}$"; // SVXX-YYYY
    public static final String REGEX_AREA="^([3-9]\\d|[1-9]\\d{2,})$";  // > 30
    public static final String REGEX_AMOUNT="^[1-9]|[1][0-9]|(20)$";  // > 0 ; <20
    public static final String REGEX_FLOOR="^[1-9]\\d*$";  // > 0

    private String inputId(){
        System.out.print("Facility Id : ");
        return RegexData.regexStr(input.nextLine(),REGEX_ID_SERVICE,"Wrong format input id:SVXX-YYYY");
    }
    private String inputName(){
        System.out.print("Service Name : ");
        return RegexData.regexStr(input.nextLine(),REGEX_NAME,"Wrong format input name");
    }
    private String inputArea(){
        System.out.print("Area Use: ");
        return RegexData.regexStr(input.nextLine(),REGEX_AREA,"Wrong format input area > 30");
    }
    private String inputAmount(){
        System.out.print("Number of People: ");
        return RegexData.regexStr(input.nextLine(),REGEX_AMOUNT,"Wrong format input amount < 20");
    }
    private String inputFloor(){
        System.out.print("Number of floor:");
        return RegexData.regexStr(input.nextLine(),REGEX_FLOOR,"Wrong format input florr > 0");
    }

    static {
        facilityList = new LinkedHashMap<>();
        facilityList.put(new Room("1","Room",50,50,5,"day","drink"),5);
        facilityList.put(new House("2","House",50,50,5,"day","5 sao",2),1);
        facilityList.put(new Villa("3","House",50,50,5,"day","4 sao",50,3),1);
        facilityList.put(new Villa("4","House",50,50,5,"day","4 sao",50,3),7);
    }

    public static Map<Facility,Integer> getFacilityList() {
        return facilityList;
    }
    @Override
    public void displayFacility() {
        for (Map.Entry<Facility,Integer> entry:facilityList.entrySet()) {
            System.out.println("Service:"+ entry.getKey()+" Used:"+entry.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        try {

            String facilityId = inputId();

            String serviceName = inputName();

            double areaUse = Double.parseDouble(inputArea());

            System.out.print("Rental Cost: ");
            double rentalCost = Double.parseDouble(input.nextLine());

            int numPeople = Integer.parseInt(inputAmount());

            System.out.print("Rental Type: ");
            String rentalType = input.nextLine();
            System.out.print("Room standard: ");
            String standard = input.nextLine();
            System.out.print("Pool area");
            double area = Double.parseDouble(input.nextLine());

            int floor = Integer.parseInt(inputFloor());

            System.out.println();
            facilityList.put(new Villa(facilityId,serviceName,areaUse,rentalCost, numPeople,rentalType,standard,area,floor),0);
            System.out.println("added success!!!");

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }

    @Override
    public void addNewHouse() {
        try {
            System.out.print("Facility Id: ");
            String facilityId = input.nextLine();
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
            System.out.print("Room standard: ");
            String standard = input.nextLine();
            System.out.print("Number of floor:");
            int floor = Integer.parseInt(input.nextLine());
            System.out.println();
            facilityList.put(new House(facilityId,serviceName,areaUse,rentalCost, numPeople,rentalType,standard,floor),0);
            System.out.println("added success!!!");

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }


    }

    @Override
    public void addNewRoom() {
        try {
            System.out.print("Facility id : ");
            String facilityId = input.nextLine();
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
            facilityList.put(new Room(facilityId,serviceName,areaUse,rentalCost, numPeople,rentalType,freeService),0);
            System.out.println("added success!!!");

        }catch (NumberFormatException e){
            System.err.println("Wrong format input");
        }

    }

    @Override
    public void displayFacilityMaintenance() {
        boolean check = false;
        for(Facility facility: facilityList.keySet()){
            if(facilityList.get(facility) > 4){
                check = true;
                break;
            }
        }
        if(check){
            for(Facility facility: facilityList.keySet()){
                if(facilityList.get(facility) > 4){
                    System.out.println(facility+", Used: "+facilityList.get(facility));
                }
            }
        }else{
            System.out.println("No Facility Maintenance");
        }
    }
    public static void increaseUseCount(String serviceName){
        for (Facility facility :facilityList.keySet()){
            if (facility.getServiceName().equals(serviceName)){
                facilityList.put(facility,(facilityList.get(facility)+1));
                break;
            }
        }
    }
}
