package Classroom.Day17;

import java.util.Scanner;

public class Whiles {
    public static void main(String[] args) {
//        int i = 1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

//        int i = 1;
//        while(i<= 100){
//            System.out.println(i);
//            i+=10;
//        }

//        Scanner scanner = new Scanner(System.in);
//        int evens = 0, odds = 0;
//        int i = 1;
//        while(i<=5){
//            int number = scanner.nextInt();
//            if(number%2 == 0){
//                evens++;
//            }
//            else{
//                odds++;
//            }
//            i++;
//        }
//        System.out.println("evens: " + evens + ", odds: " +  odds);



        Scanner scanner = new Scanner(System.in);
        int fact = 1;

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // 5
        int i = 1;
        while(i<=number){
            fact*=i;
            i++;
        }
        System.out.println("The factorial of " + number + " is " + fact);












    }
}
