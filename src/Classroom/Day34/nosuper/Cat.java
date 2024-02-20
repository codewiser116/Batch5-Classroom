package Classroom.Day34.nosuper;

public class Cat extends Animal{

    String catHasOnly;

    public Cat(String name, int age, String color){
        super(name, age, color);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Cat1",5, "black");
        System.out.println(cat.name);
    }
}
