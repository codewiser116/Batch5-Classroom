package Classroom.Day34.person;

import java.util.ArrayList;

public class Library {
    ArrayList<Person> libraryMembers = new ArrayList<>();

    public void addMember(Person person){
        libraryMembers.add(person);
        System.out.println(person.name + " is a new member!!!");
    }

    public void displayMembers(){
        for(Person i: libraryMembers){
            System.out.println(i.name);
            System.out.println(i.age);
        }
    }

}
