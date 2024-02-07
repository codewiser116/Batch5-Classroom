package Classroom.Day28.ApartmentManagement;

public class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayPerson(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}
