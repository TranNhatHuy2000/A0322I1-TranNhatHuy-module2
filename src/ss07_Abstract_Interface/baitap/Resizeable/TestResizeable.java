package ss07_Abstract_Interface.baitap.Resizeable;


public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4,"red",true);
        shapes[1] = new Rectangle(4,3,"blue",false);
        shapes[2] = new Rectangle();
        shapes[3] = new Circle();

        double rand = (double)Math.floor(Math.random()*100)+1;

        System.out.println("before resize");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }

        System.out.println("after resize");
        for (Shape shape: shapes) {
            shape.resize(rand);
            System.out.println(shape);
        }
    }
}
