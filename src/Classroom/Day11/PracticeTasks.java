package Classroom.Day11;

import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
//         Task 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter purchase amount: ");
//        double amount = scanner.nextDouble(); // 500
//        double finalAmount = amount;
//        if(amount >= 100 && amount < 200){
//            finalAmount = amount - (amount * 0.1);
//        }
//        else if(amount >= 200){
//            finalAmount = amount - (amount * 0.2);
//        }
//
//        System.out.println("Total amount to pay: " + finalAmount);

        // Task 2

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter purchase amount: ");
//        double amount = scanner.nextDouble();
//        System.out.println("Enter age:");
//        int age = scanner.nextInt();
//
//        if(age < 15){
//            amount = amount - (amount * 0.35);
//        }
//        else if(age < 21){
//            amount = amount - (amount * 0.25);
//        }
//        else if(age > 60){
//            amount = amount - (amount * 0.5);
//        }
//        System.out.println("Total amount to pay: " + amount);

        // Task 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter word: ");
//        String word = scanner.nextLine();
//
//        // laptops
//        if(word.contains("a") && word.length() < 7){
//            System.out.println("Interesting word");
//        }
//        else if(word.contains("o") && word.length()>6){
//            System.out.println("Super Interesting word");
//        }
//        else {
//            System.out.println("Word");
//        }

        // Task 4
        int a = 66;
        int firstD = a / 10;
        int secondD = a % 10;
        if(firstD % 2 == 0 && secondD % 2 == 0){
            System.out.println("DOUBLE EVEN");
        }
        else{
            System.out.println("Regular");
        }







    }
}
