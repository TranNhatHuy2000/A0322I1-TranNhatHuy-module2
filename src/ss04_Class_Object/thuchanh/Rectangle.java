package ss04_Class_Object.thuchanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
    double width,height;

    public Rectangle(){
    }

    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return (int)this.height*(int)this.width;
    }

    public double getPerimeter(){
        return  (this.height + this.width) *2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}


