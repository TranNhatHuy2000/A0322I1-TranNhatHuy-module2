package ss06_Inheritance.thuchanh.SystemOfGeometric;

public class Circle extends Shape {
    private double radius=1;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean fillded) {
        super(color, fillded);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        Circle circle1 = new Circle();
        circle1 = circle;
        System.out.println(circle1);
    }
}
