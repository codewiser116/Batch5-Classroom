package Classroom.Day27;

public class Student {
    static int giftBox;

    String name;
    int balance;

    public Student(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Zack", 500);
        Student student2 = new Student("Sara",300);

        student1.balance-=55;
        student1.giftBox+=55;


        student2.balance-=60;
        student2.giftBox+=60;

        Student.staticMethod();
    }

    public static void staticMethod(){
        System.out.println("Hello");
    }
}
