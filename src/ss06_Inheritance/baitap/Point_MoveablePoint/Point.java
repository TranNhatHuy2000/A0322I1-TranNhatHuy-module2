package ss06_Inheritance.baitap.Point_MoveablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f, y =0.0f;
    public Point(){}

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = {getX(),getY()};
        return arr;
    }

    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", XY="+ Arrays.toString(getXY()) +
                '}';
    }

    public static void main(String[] args) {
        Point point = new Point(8,9);
        System.out.println(point);

        point.setXY(1,7);
        System.out.println(point);
    }
}
