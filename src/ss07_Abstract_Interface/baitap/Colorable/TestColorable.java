package ss07_Abstract_Interface.baitap.Colorable;

public class TestColorable {

    public static void main(String[] args) {
        Square square = new Square(4,"yellow",true);
        System.out.println(square);
        square.howToColor();
    }
}
