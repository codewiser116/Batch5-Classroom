package Classroom.Day7;

import java.util.Scanner;

public class ScannerTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Task 1
//        System.out.println("Enter first name:");
//        String firstName = sc.nextLine();
//        System.out.println("Hello " + firstName +
//                ", have a good day!");

        // Task 2
//        System.out.println("Enter 1st number:");
//        int n1 = sc.nextInt();
//        System.out.println("Enter 2nd number:");
//        int n2 = sc.nextInt();
//        System.out.printf("Result: %d + %d = %d", n1,n2,n1+n2);

        // Task 3
//        System.out.println("Enter 1st number:");
//        int number1 = sc.nextInt();
//        System.out.println("Enter 2nd number:");
//        int number2 = sc.nextInt();
//        // %d numbers, %s strings
//        //     Addition: 50 + 50 = 100
//        System.out.printf("Addition: %d + %d = %d", number1, number2, (number1+number2));
//        System.out.printf("\nSubtraction: %d - %d = %d", number1, number2, (number1-number2));
//        System.out.printf("\nMultiplication: %d * %d = %d", number1, number2, (number1*number2));
//        System.out.printf("\nDivision: %d / %d = %d", number1, number2, (number1/number2));


        // Task 4
        System.out.println("Q1: What is your name?:");
        String name = sc.nextLine();
        System.out.println("Q2: How old are you?:");
        int age = sc.nextInt();
        System.out.println("Q3: What is your favorite number?:");
        int number = sc.nextInt();

        System.out.printf("My name is %s.", name);
        System.out.printf("\nI am %d yo.", age);
        System.out.printf("\nMy favorite number is %d", number);






    }
}
