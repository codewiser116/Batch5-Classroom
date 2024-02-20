package Classroom.Day34.person;

public class Person {
    String name;
    int age;
    String gender;
    String address;

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }


    public void sleep(){
        System.out.println("Sleeping");
    }

    public void eat(){
        System.out.println("Eating");
    }
}
