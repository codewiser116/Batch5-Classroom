package Classroom.Day25;

public class Car {
    String make;
    double price;
    int year;
    String color;

    public void run(){
        System.out.println(make + " is running");
    }

    public void carInfo(){
        System.out.println(make);
        System.out.println(price);
        System.out.println(year);
        System.out.println(color);
        System.out.println();
    }

    public static void main(String[] args) {
        Car mercedes = new Car();
        mercedes.make = "Mercedes";
        mercedes.price = 50000;
        mercedes.year = 2020;
        mercedes.color = "white";
        mercedes.run();
        mercedes.carInfo();

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price = 35000;
        toyota.year = 2022;
        toyota.color = "black";
        toyota.run();
        toyota.carInfo();

        Car lexus = new Car();
        lexus.make = "Lexus";
        lexus.price = 45000;
        lexus.year = 2023;
        lexus.color = "blue";
        lexus.run();
        lexus.carInfo();
    }
}
