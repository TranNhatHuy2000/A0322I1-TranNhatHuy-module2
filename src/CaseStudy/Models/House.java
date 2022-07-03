package CaseStudy.Models;

public class House extends Facility {
    private String roomStandard;    /*tieu chuan phong*/
    private byte numFloors;         /*so tang*/

    public House(){

    }

    public House(String roomStandard, byte numFloors) {
        this.roomStandard = roomStandard;
        this.numFloors = numFloors;
    }

    public House(String serviceName, double areaUse, double rentalCost, int maxNumPeople, String rentalType, String roomStandard, byte numFloors) {
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

    public byte getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(byte numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numFloors=" + numFloors +
                '}';
    }
}
