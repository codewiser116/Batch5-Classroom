package Classroom.Day20;

import java.util.Scanner;

public class BooksManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int books = 5;
        String[] students = {"Mike", "Joe", "Ann", "Sara", "Albert"};
        int[] studentsBooks = {0,0,0,0,0};
        System.out.println("Welcome to the Library!");

        while(true){
            System.out.println("We have " + books + " books left!");
            System.out.println("Employee: What is your student id?");
            int id = scanner.nextInt();
            System.out.println("Employee: How many books do you wanna borrow?");
            int booksToBorrow = scanner.nextInt();

            if(booksToBorrow>books){
                System.out.println("We have only " + books + " books in the library!");
                break;
            }
            studentsBooks[id] += booksToBorrow;
            books -= booksToBorrow;
            System.out.print(students[0] + "-" +studentsBooks[0] + ", ");
            System.out.print(students[1] + "-" +studentsBooks[1] + ", ");
            System.out.print(students[2] + "-" +studentsBooks[2] + ", ");
            System.out.print(students[3] + "-" +studentsBooks[3] + ", ");
            System.out.println(students[4] + "-" +studentsBooks[4]);

            if(books<=0){
                System.out.println("Program is stopped, no book left.");
                break;
            }
            System.out.println("Do you wanna continue?");
            scanner.nextLine();
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("no")){
                break;
            }

        }

    }
}
