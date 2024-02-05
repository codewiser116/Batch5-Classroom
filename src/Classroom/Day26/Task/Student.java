package Classroom.Day26.Task;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    String name;
    int id;
    int age;
    int[] grades = new int[3];
    String car;

    public Student(String name, int id, int age, int[] grades, String car){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = grades;
        this.car = car;
    }

    public Student(String name, int id, int age, int[] grades){
        this.name = name;
        this.id = id;
        this.age = age;
        this.grades = grades;
        this.car = "no car";
    }

    public void studentDetails(){
        System.out.println(name + ", "  + id + ", " + age + ", " + Arrays.toString(grades) + " " + car );
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for student1:");
        System.out.print("Name: ");
        String student1Name = scanner.nextLine();
        System.out.print("ID: ");
        int student1ID = scanner.nextInt();
        System.out.print("Age: ");
        int student1Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student1Grades = new int[3];
        for(int i = 0; i < student1Grades.length; i++){
            student1Grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.print("Car brand: ");
        String student1Car = scanner.nextLine();
        Student student1 = new Student(student1Name, student1ID, student1Age,student1Grades,student1Car);

        System.out.println("Enter details for student2:");
        System.out.print("Name: ");
        String student2Name = scanner.nextLine();
        System.out.print("ID: ");
        int student2ID = scanner.nextInt();
        System.out.print("Age: ");
        int student2Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student2Grades = new int[3];
        for(int i = 0; i < student1Grades.length; i++){
            student2Grades[i] = scanner.nextInt();
        }
        Student student2 = new Student(student2Name, student2ID, student2Age,student2Grades);

        System.out.println("Enter details for student3:");
        System.out.print("Name: ");
        scanner.nextLine();
        String student3Name = scanner.nextLine();
        System.out.print("ID: ");
        int student3ID = scanner.nextInt();
        System.out.print("Age: ");
        int student3Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student3Grades = new int[3];
        for(int i = 0; i < student1Grades.length; i++){
            student3Grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.print("Car brand: ");
        String student3Car = scanner.nextLine();
        Student student3 = new Student(student3Name, student3ID, student3Age,student3Grades,student3Car);


        student1.studentDetails();
        student2.studentDetails();
        student3.studentDetails();
    }
}
