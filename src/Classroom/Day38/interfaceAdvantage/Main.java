package Classroom.Day38.interfaceAdvantage;


public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Eagle eagle = new Eagle();
        Lion lion = new Lion();
        Shark shark = new Shark();

        parrot.fly();
        parrot.walk();

        eagle.fly();
        eagle.walk();

        lion.walk();
        lion.run();

        shark.dive();

    }
}
