package CaseStudy.repository;

import CaseStudy.Models.Booking;
import CaseStudy.Models.Contract;
import CaseStudy.Models.Customer;

import java.util.*;

public class ContractRepositoryImpl implements ContractRepository {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Contract> contractList = new ArrayList<>();


    @Override
    public void createNewContract() {
        try {
            Queue<Booking> bookingQueue = new LinkedList<>();
            Set<Booking> bookingSet = new BookingRepositoryImpl().sendBooking();
            for (Booking booking:bookingSet) {
                bookingQueue.add(booking);
            }
            while (!bookingQueue.isEmpty()){
                Booking booking = bookingQueue.poll();
                int idCustomer = booking.getIdCustomer();
                System.out.println("Creating contract for booking infor: "+booking);
                System.out.println("Creating contract for customer id: "+idCustomer);
                System.out.print("Input contract number:");
                int contractNumber =Integer.parseInt(scanner.nextLine());
                System.out.print("Input advance deposit:");
                double advanceDeposit = Double.parseDouble(scanner.nextLine());
                System.out.print("Input total payment:");
                double totalPayment = Double.parseDouble(scanner.nextLine());

                Contract contract = new Contract(contractNumber, booking.getBookingCode(),advanceDeposit,totalPayment,idCustomer);
                contractList.add(contract);
                System.out.println("Create contract successful! :"+contract);
            }
        }catch (Exception e){
            System.err.println("wrong:" +e);
        }
    }

    @Override
    public void displayListContracts() {
        for (Contract contract:contractList) {
            System.out.println(contract);
        }
    }

   private int indexContract(int id)
   {
       int index=-1;
       for (int i=0; i<contractList.size(); i++)
       {
           if (id==contractList.get(i).getContractNumber())
           {
               index=i;
               break;
           }
       }
       return index;
   }

    @Override
    public void editContracts() {
        System.out.print("Edit contract number:");
        try {
            int edit = Integer.parseInt(scanner.nextLine());
            int index = indexContract(edit);
            if(index !=-1){
                while (true){
                    if (contractList.get(index).getContractNumber() == edit){
                        System.out.print("edit contract number:");
                        int contractNumber =Integer.parseInt(scanner.nextLine()) ;
                        System.out.print("edit booking code:");
                        int bookingCode = Integer.parseInt(scanner.nextLine());
                        System.out.print("edit advance deposit:");
                        double advanceDeposit = Double.parseDouble(scanner.nextLine());
                        System.out.print("edit total payment:");
                        double totalPayment = Double.parseDouble(scanner.nextLine());
                        contractList.set(index,new Contract());
                        System.out.print("edit customer id:");
                        int customerId = Integer.parseInt(scanner.nextLine());
                        contractList.set(index,new Contract(contractNumber,bookingCode,advanceDeposit,totalPayment,customerId));
                        System.out.println("added success!!!");
                        break;
                    }
                }
            }else {
                System.out.println("Not found contract to edit???");
            }
        }catch (NumberFormatException e){
            System.err.println("wrong format input");
        }

    }
}
