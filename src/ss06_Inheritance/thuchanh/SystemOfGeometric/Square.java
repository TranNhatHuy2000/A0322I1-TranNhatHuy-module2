package ss06_Inheritance.thuchanh.SystemOfGeometric;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean fillded, double side) {
        super(color, fillded, side,side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow",true,5.8);
        System.out.println(square);
    }
}
