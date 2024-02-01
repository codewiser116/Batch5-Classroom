package Classroom.Day25;

public class Student {
    // properties, fields, instance variables
    String studentId;
    String name;
    int age;
    String gradeLevel;
    double gpa;
    String major;

    public static void main(String[] args) {
        Student mike = new Student();
        mike.name = "Mike";
        System.out.println(mike.name);
        mike.study();

        Student sara = new Student();
        sara.name = "Sara";
        System.out.println(sara.name);
        sara.study();

        Student john = new Student();
        john.name = "John";
        System.out.println(john.name);
        john.study();

    }

    // instance method
    public void study(){
        System.out.println(name + " is Studying");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
