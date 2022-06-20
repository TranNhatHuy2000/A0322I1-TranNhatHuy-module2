package ss06_Inheritance.baitap.Point2D_Point3D;

import java.util.Arrays;

public class Point2D {
    private float x =0.0f;
    private float y =0.0f;

    public Point2D() {}

    public Point2D(float x, float y) {
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
      this.x =x;
      this.y =y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", XY="+ Arrays.toString(getXY()) +
                '}';
    }

    public static void main(String[] args) {
        Point2D point2D = new Point2D(5,6);
        System.out.println(point2D);

        point2D.setXY(8,9);
        System.out.println(point2D);
    }
}
