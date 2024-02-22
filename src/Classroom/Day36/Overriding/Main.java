package Classroom.Day36.Overriding;

import Classroom.Day35.library.LibraryItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Dog dog = new Dog();

        cow.animalSound();
        dog.animalSound();

        // Polymorphic behavior - Reference Type Polymorphism
        Animal dog1 = new Dog(); // reference type polymorphism

        ArrayList<Animal> list = new ArrayList<>(); // reference type polymorphism

    }
}
