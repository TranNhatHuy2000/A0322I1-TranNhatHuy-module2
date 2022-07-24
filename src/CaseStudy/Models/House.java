package CaseStudy.Models;

public class House extends Facility {
    private String roomStandard;    /*tieu chuan phong*/
    private int numFloors;         /*so tang*/

    public House(){

    }

    public House(String roomStandard, byte numFloors) {
        this.roomStandard = roomStandard;
        this.numFloors = numFloors;
    }

    public House(String serviceName, double areaUse, double rentalCost, int maxNumPeople, String rentalType, String roomStandard, int numFloors) {
        super(serviceName, areaUse, rentalCost, maxNumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numFloors = numFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(byte numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+", "+
                "roomStandard='" + roomStandard + '\'' +
                ", numFloors=" + numFloors +
                '}';
    }
}
