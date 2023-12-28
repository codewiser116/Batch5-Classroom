package Classroom.Day7;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        System.out.println("Enter name:");
        sc.nextLine(); // solves bad scenario
        String name = sc.nextLine();

        System.out.println("Enter salary:");
        double salary = sc.nextDouble();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);
    }
}
