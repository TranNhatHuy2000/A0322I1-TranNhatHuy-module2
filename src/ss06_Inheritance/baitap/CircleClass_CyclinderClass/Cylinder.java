package ss06_Inheritance.baitap.CircleClass_CyclinderClass;

public class Cylinder extends Circle {
    double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height*super.getArea();
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius="+ getRadius()+
                ", volume=" + getVolume()+
                ", color="+super.getColor()+
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,"yellow",8);
        System.out.println(cylinder);
    }
}
