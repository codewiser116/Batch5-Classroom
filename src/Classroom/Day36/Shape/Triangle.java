package Classroom.Day36.Shape;

public class Triangle extends Shape{
    double height;
    double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public void calculateArea(){
        System.out.println("Area: "+ (base*height)/2);
    }
}
