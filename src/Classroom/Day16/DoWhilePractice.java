package Classroom.Day16;

import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        /*
        using do while loop
        write a program that will keep asking user to enter
        any number until user enters negative number (< 0)

        Pseudocode:
        1. create Scanner
        2. create do while
        4. inside do
                    print "Enter negative number"
                    int number = get from scanner
        while (number >= 0)
         */

        Scanner scanner = new Scanner(System.in);


        int number;
        do {
            System.out.println("Enter negative number: ");
             number = scanner.nextInt();
        }while(number >= 0);

        //do the same thing using while loop

        while(true){
            System.out.println("enter a number");
            int entry = scanner.nextInt();

            if ( entry < 0){
                System.out.println("number is negative good job");
                break;

            } else System.out.println("number is too big");
        }



    }
}
