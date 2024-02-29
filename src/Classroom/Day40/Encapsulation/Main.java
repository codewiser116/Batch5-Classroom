package Classroom.Day40.Encapsulation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog",1);

        // Update properties
        animal.setName("Lion");
        animal.setAge(120);

        // Access values
        System.out.println(animal.getName());
        System.out.println(animal.getAge());


        LocalDate today = LocalDate.now();
        LocalDate someDate = LocalDate.of(2020,1,15);


    }
}
