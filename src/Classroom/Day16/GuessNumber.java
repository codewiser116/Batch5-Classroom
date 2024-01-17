package Classroom.Day16;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    /*
    Create a program which guesses any number from 1 to 100
    and user should find the correct number.

    1. generate random number from 1 to 100 (random.nextInt(1, 100)
    2. ask user to enter random number
        if userNumber < randomNumber
            print "Bigger!"
        if userNumber > randomNumber
            print "Smaller!"
        if userNumber == randomNumber
            print "You got it!"
     */

    public static void main(String[] args) {

        int random = new Random().nextInt(1, 100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess any number from 1 to 100");

        boolean notFound = true;

        while (notFound){
            int number = scanner.nextInt();

            if (number < random){
                System.out.println("Too small!");
            }
            else if (number > random){
                System.out.println("Too big!");
            }
            else {
                System.out.println("You got it!");
                notFound = false;
            }
        }


    }





}
