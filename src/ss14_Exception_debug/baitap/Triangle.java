package ss14_Exception_debug.baitap;

public class Triangle {
    public Triangle(double a, double b, double c) throws IllegalTriangleException{
        if( a+b<c || a+c<b ||b+c<a  ){
            if (a<=0 || b<=0 || c<=0){
                throw new IllegalTriangleException("side triagle not < 0");
            }
            throw new IllegalTriangleException("Not triangle");
        }
        System.out.println("That is Triangle!");
    }
}
