package ss07_Abstract_Interface.baitap.Colorable;

public class Square extends Shape implements Colorable {
    private double size = 1;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double size,String color, boolean filled) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "A Square with size="
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides..");
    }
}
