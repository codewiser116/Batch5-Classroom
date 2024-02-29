package Classroom.Day40.Encapsulation;

import java.util.ArrayList;

public class Animal {
    private String name;
    private int age;
    private ArrayList<Integer> numbers;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ArrayList<Integer> getNumbers(){
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers){
        this.numbers = numbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<100){
            System.out.println("Age wasn't updated");
        }
        else{
            this.age = age;
            System.out.println("Age was updated!");
        }
    }
}
