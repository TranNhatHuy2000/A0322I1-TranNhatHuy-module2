package CaseStudy.repository;

import CaseStudy.Models.*;
import CaseStudy.Ultils.BookingComparator;

import java.time.LocalDate;
import java.util.*;

public class BookingRepositoryImpl implements BookingRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static Set<Booking> bookingList = new TreeSet<>(new BookingComparator());
    private static List<Customer> customerList = new ArrayList<>();
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();


    static {
        customerList.add(new Customer(1 ,"Vip","Hue","Tran Nhat Huy","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        customerList.add(new Customer(2 ,"Normal","Da Nag","Ho Thanh Dot","01/01/1999",
                "Nam",191915126,123456789,"55abc@gmail.com"));
        facilityIntegerMap.put(new Room("1","Room",50,50,5,"day","drink"),5);
        facilityIntegerMap.put(new House("2","House",50,50,5,"day","5 sao",2),1);
    }

    public Set<Booking> sendBooking(){
        return bookingList;
    }

    @Override
    public void addNewBooking() {
        try {
            int id = 1;
            if (!bookingList.isEmpty()){
                id = bookingList.size();
            }
            Customer customer = chooseCustomer();
            Facility facility = chooseFacility();
            System.out.print("Input Start Date:");
            String startDate = scanner.nextLine();
            System.out.print("Input End Date:");
            String endDate = scanner.nextLine();
            Booking booking = new Booking(id,startDate,endDate,customer.getIdCustomer(),facility.getServiceName(),facility.getRentalType());
            FacilityRepositoryImpl.increaseUseCount(booking.getServiceName());
            bookingList.add(booking);
            System.out.println("Booking successful!");

        }catch (Exception e){
            System.out.println(e);
        }

    }


    @Override
    public void displayBooking() {
        for(Booking booking: bookingList){
            System.out.println(booking);
        }
    }

    public static Customer chooseCustomer(){
        for (Customer customer:customerList) {
            System.out.println(customer);
        }
        System.out.print("Choose id Customer:");
        int idCustomer = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        while (check){
            for (Customer customer:customerList) {
                if (customer.getIdCustomer()==idCustomer){
                    check = false;
                    return customer;
                }
            }
            if (check){
                System.out.print("Wrong id, choose again:");
                idCustomer = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        for (Map.Entry<Facility,Integer> entry:facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.print("Choose id Facility:");
        String idFacility = scanner.nextLine();
        boolean check = true;
        while (check){
            for (Map.Entry<Facility,Integer> entry:facilityIntegerMap.entrySet()) {
                if (entry.getKey().getIdFacility().equals(idFacility)){
                    check = false;
                    return entry.getKey();
                }
            }
            if (check){
                System.out.print("Wrong id, choose again:");
                idFacility = scanner.nextLine();
            }
        }
        return null;
    }
}
