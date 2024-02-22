package Classroom.Day36.Shape;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void calculateArea(){
        System.out.println("Area: " + length*width);
    }
}
