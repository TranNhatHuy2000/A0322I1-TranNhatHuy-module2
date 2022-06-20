package ss06_Inheritance.baitap.Point_MoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f, ySpeed =0.0f;

    public MovablePoint(){}

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {getXSpeed(),getYSpeed()};
        return arr;
    }

    public void setSpeed(float x,float y){
        setXSpeed(x);
        setYSpeed(y);
    }

    public void  move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint{(" +
                getX()+", "+getY()+"), " +
                "speed =(" +
                getXSpeed()+", "+getYSpeed()+")}";
    }

    public static void main(String[] args) {
        MovablePoint movablePoint =new  MovablePoint(4,5,1,2);
        System.out.println(movablePoint);

        movablePoint.move();
        System.out.println(movablePoint);

    }
}
