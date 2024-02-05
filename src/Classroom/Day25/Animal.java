package Classroom.Day25;

public class Animal {

    String name;
    int age;
    String color;

    public Animal(String name, int age, String color){
        this.name = name; // assigns
        this.age = age;
        this.color = color;
    }

    public void animalInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public void eat(){
        System.out.println(name + " is eating!");
    }

    public void sleep(){
        System.out.println(name + " is sleeping!");
        System.out.println();
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion",5, "black");
        Animal animal2 = new Animal("Python", 10, "green");
        Animal animal3 = new Animal("Dog", 4, "white");
        Animal animal4 = new Animal("horse", 7, "black");

        animal1.animalInfo();
        animal1.eat();
        animal1.sleep();

        animal2.animalInfo();
        animal2.eat();
        animal2.eat();
        animal2.sleep();

        animal3.animalInfo();
        animal3.eat();
        animal3.sleep();

        animal4.animalInfo();
        animal4.eat();
        animal4.sleep();

    }
}
