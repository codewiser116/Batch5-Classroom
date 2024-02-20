package Classroom.Day34.nosuper;

public class Dog extends Animal{

    String dogHasOnly;

    public Dog(String name, int age, String color, String dogHasOnly){
        super(name, age, color);
        this.dogHasOnly = dogHasOnly;
    }


}
