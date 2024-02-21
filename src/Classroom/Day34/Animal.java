package Classroom.Day34;


public class Animal{
    String name;
    int age;
    public Animal(String name, int age){

    }


}

class Lion extends Animal{
    boolean isHungry;

    public Lion(String name, int age, boolean isHungry){
        super(name, age);
        this.isHungry =  isHungry;
    }

}