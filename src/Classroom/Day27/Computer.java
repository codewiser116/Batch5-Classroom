package Classroom.Day27;

public class Computer {
    static int number = 0;
    String name;



    public static void main(String[] args) {
        Computer computer1 =  new Computer();
        computer1.name = "C1";
        computer1.number = 5;

        Computer computer2 =  new Computer();
        computer2.name = "C2";
        computer2.number = 10;


        System.out.println(computer1.name);
        System.out.println(computer2.name);
        System.out.println(computer1.number);
        System.out.println(computer2.number);

    }
}
