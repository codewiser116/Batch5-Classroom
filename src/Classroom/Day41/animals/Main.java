package Classroom.Day41.animals;

public class Main {
    public static void main(String[] args) {
        AnimalsRescueCenter center = new AnimalsRescueCenter();
        Dog dog1 = new Dog("Dog1",5);
        Dog dog2 = new Dog("Dog2",4);
        Cat cat1 = new Cat("Cat1",4);
        Cat cat2 = new Cat("Cat2", 1);
        Bird bird1 = new Bird("Bird1",3);

        center.addAnimal(dog1);
        center.addAnimal(dog2);
        center.addAnimal(cat1);
        center.addAnimal(cat2);
        center.addAnimal(bird1);

        center.adoptAnimal("Bird1");
        center.listAdoptedAnimal();
    }
}
