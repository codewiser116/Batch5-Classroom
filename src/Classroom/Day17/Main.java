package Classroom.Day17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        for(int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }

//        for(int i = 1; i<= 100; i+=10){
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//        int evens = 0, odds = 0;
//        for(int i = 1; i<=5; i++){
//            int number = scanner.nextInt();
//            if(number%2 == 0){
//                evens++;
//            }
//            else{
//                odds++;
//            }
//            System.out.println("evens: " + evens + ", odds: " +  odds);
//        }

        Scanner scanner = new Scanner(System.in);
        int fact = 1;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        for(int i = 1; i <= number; i++ ){
            fact = fact * i;
        }
        System.out.println("The factorial of " + number + " is " + fact);


        // Output:
        // Enter a number:
        // 4
        // The factorial of 4 is 24






    }
}
