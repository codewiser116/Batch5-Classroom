package Classroom.Day27.person;

public class Person {
    String name;
    Passport[] passports = new Passport[3];
    Car[] cars = new Car[3];

    public Person(String name, Passport[] passports, Car[] cars){
        this.name = name;
        this.passports = passports;
        this.cars = cars;
    }
}
