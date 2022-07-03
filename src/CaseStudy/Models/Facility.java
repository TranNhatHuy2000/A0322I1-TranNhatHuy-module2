package CaseStudy.Models;

public abstract class Facility {
    private String serviceName; /*ten dich vu*/
    private double areaUse;     /*dien tich su dung*/
    private double rentalCost;  /*chi phi thue*/
    private int maxNumPeople;   /*so luong nguoi toi da*/
    private String rentalType;  /*kieu thue (năm, tháng, ngày, giờ)*/

    public Facility() {
    }

    public Facility(String serviceName, double areaUse, double rentalCost, int maxNumPeople, String rentalType) {
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalCost = rentalCost;
        this.maxNumPeople = maxNumPeople;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxNumPeople() {
        return maxNumPeople;
    }

    public void setMaxNumPeople(int maxNumPeople) {
        this.maxNumPeople = maxNumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", rentalCost=" + rentalCost +
                ", maxNumPeople=" + maxNumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
