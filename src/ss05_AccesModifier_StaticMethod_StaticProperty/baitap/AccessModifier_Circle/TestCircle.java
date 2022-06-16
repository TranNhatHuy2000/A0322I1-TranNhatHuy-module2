package ss05_AccesModifier_StaticMethod_StaticProperty.baitap.AccessModifier_Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.getArea();
        double radiou = circle.getRadious();
        System.out.println("Diện tích hình tròn bán kính "+radiou +" là:"+area);
    }
}
