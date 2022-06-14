package ss04_Class_Object.baitap;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;

    private QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant(){
        return (this.b*this.b)-4*this.a*this.c;
    }
    public double getRoot1() {
            return (-this.b + Math.pow(this.getDiscriminant(),0.5))/2*this.a;
    }
    public double getRoot2() {
            return (-this.b - Math.pow(this.getDiscriminant(),0.5))/2*this.a;
    }
    public String display() {
        if (getDiscriminant() > 0) {
            return "Phương trình có 2 nghiệm: " + getRoot1() + ", " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "Phương trình có nghiệm kép:" + getRoot1();
        }else {
            return "Phương trình vô nghiệm";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập a:");
        double a = input.nextDouble();
        System.out.print("Nhập b:");
        double b = input.nextDouble();
        System.out.print("Nhập c:");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.display());
    }
}
