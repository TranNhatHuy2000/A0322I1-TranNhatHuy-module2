package CaseStudy.Models;

public class Villa extends Facility {
    private String roomStandard;    /*tieu chuan phong*/
    private double poolArea;        /*dien tich ho boi*/
    private int numFlor;            /*so tang*/

    public Villa() {
    }

    public Villa(String roomStandard, double poolArea, int numFlor) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numFlor = numFlor;
    }

    public Villa(String serviceName, double areaUse, double rentalCost, int maxNumPeople, String rentalType, String roomStandard, double poolArea, int numFlor) {
        super(serviceName, areaUse, rentalCost, maxNumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numFlor = numFlor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumFlor() {
        return numFlor;
    }

    public void setNumFlor(int numFlor) {
        this.numFlor = numFlor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString()+", "+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numFlor=" + numFlor +
                '}';
    }
}
