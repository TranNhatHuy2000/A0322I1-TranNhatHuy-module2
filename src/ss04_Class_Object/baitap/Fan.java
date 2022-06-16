package ss04_Class_Object.baitap;

public class Fan {
    private final int SLOW=1, MEDIUM=2, FAST=3;
    private int speed = SLOW;
    private boolean on = false;
    private double radious = 5;
    private String color = "blue";
    public Fan(){
    }

    public String getSpeed() {
        switch (this.speed){
            case SLOW:
                return "slow";
            case MEDIUM:
                return "medium";
            case FAST:
                return "fast";
            default:
                return "quạt hư";
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()){
            return "Fan is on:" +"\n"+
                    "speed:" + getSpeed() +"\n"+
                    "radious:" + getRadious() +"\n"+
                    "color:"+getColor();
        }else {
            return "Fan is off:" +"\n"+
                    "radious:" + radious +"\n"+
                    "color:"+color;
        }
    }
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setRadious(10);
        fan1.setColor("yellow");
        fan1.setSpeed(3);
        fan2.setSpeed(2);
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

