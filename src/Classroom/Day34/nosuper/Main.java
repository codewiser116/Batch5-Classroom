package Classroom.Day34.nosuper;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 5, "black", "dogHasOnly");
        Cat cat = new Cat("Cat",10,"white");


        System.out.println(dog.dogHasOnly);
        System.out.println(cat.catHasOnly);
    }
}
