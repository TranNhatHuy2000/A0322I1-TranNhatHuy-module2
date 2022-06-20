package ss06_Inheritance.baitap.Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z ;

    public Point3D(){}

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr={getX(),getY(),getZ()};
        return arr;
    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z =z;

    }

    @Override
    public String toString() {
        return "Point3D{" +
                ", x=" + super.getX() +
                ", y=" + super.getY() +
                ", z=" + z +
                " ,XYZ"+ Arrays.toString(getXYZ())+
                '}';
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(4,5,9);
        System.out.println(point3D);

        point3D.setXYZ(1,2,3);
        System.out.println(point3D);
    }
}
