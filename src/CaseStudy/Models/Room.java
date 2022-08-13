package CaseStudy.Models;

public class Room extends Facility {
    private String freeService;     /*dich vu free*/

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String serviceName, double areaUse, double rentalCost, int maxNumPeople, String rentalType, String freeService) {
        super(idFacility, serviceName, areaUse, rentalCost, maxNumPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString()+", "+
                "freeService='" + freeService + '\'' +
                '}';
    }


}
