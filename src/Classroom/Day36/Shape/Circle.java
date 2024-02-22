package Classroom.Day36.Shape;

public class Circle extends Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void calculateArea() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }
}
