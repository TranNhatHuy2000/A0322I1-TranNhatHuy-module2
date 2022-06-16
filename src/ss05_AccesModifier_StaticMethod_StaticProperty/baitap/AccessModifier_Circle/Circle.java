package ss05_AccesModifier_StaticMethod_StaticProperty.baitap.AccessModifier_Circle;

public class Circle {
    private double radious=1;
    private String color = "red";

    public Circle(){
    }
    public Circle(double newradious){
        this.radious = newradious;
    }
    public double getRadious(){
        return radious;
    }
    public double getArea(){
        return radious*radious*3.14 ;
    }

}
