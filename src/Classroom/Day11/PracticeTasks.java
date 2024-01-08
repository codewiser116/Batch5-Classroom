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




// Recap Conditional statements
//
//Conditional statements generally in programming, are essential for making
//decisions in the code based on certain conditions.
//
//Conditonal statements Scenarios:
//
//1. if
//else if
//else if
//else
//
//2.
//if
//else
//
//3.
//if
//else if
//else if
//
//4.
//if
//
//Task 1.
//if(number>0){
//    number is positive
//}
//else if(number<0){
//    number is negative
//}
//else{
//    number is zero
//}
//
//
//
//Task 2.
//if(temperature <= 32){
//    freezing
//}
//else if(temperature >= 212){
//    boiling
//}
//else{
//    between
//}
//
//Task 3.
//
//a = 25, b = 78, c = 87   ---- c
//a = 25, b = 100, c = 87  ---- b
//a = 200, b = 87, c = 88  ---- a
//a = 200, b = 200, c = 200 ---- all equal
//
//if(a > b && a > c){
//    a is greatest
//}
//else if(b>c )
//
//
//
//1) What can we create inside Conditonal statements blocks:
//// 1. variables
//// 2. conditional statements
//// 3. non primitives
//
//int a = 5, b = 10, c = 13;
//
//Practice tasks
//1) You are building an online shop cart app
//Write a program that takes takes from user the total
//double purchaseAmount as input and calculates the final price
//after discount applied and print it
//
//* If the purchase amount entered is at least 100.0$, then apply 10%
//* If the purchase amount entered is at least 200.0$, then apply 20%
//* If the purchase amount is less than 100%, then no discount applied
//Output:
//Enter purchase amount:
//150
//Total amount to pay: 135$
//
//
//2) You are building an online shop cart app
//Write a program that takes takes from user the total
//double purchaseAmount and int age as input and calculates the final price
//after discount applied and print it
//
//* If age is less than 15, then apply 35% discount
//* If age is greater than 14 and less than 21 and , then apply 25% discount
//* If age is greater than 60, then apply 50% discount
//Output:
//
//Enter purchase amount:
//200
//Enter your age:
//10
//Total amount to pay: 130$
//
//3)
//Write a program that takes from user a String word
//* if letter "a" is present in the word then print: "Interesting word"
//* if letter "o" is present and the length is greater than 6
//print: "Super Interesting word"
//* otherwise print: "word"
//
//Output:
//Enter your word:
//laptop
//Super Interesting word
//
//
//4)
//Write a program that takes from user 2 digit int number
//and checks if this number is "double even"
//
//* if number is double even then print: "DOUBLE EVEN"
//* otherwise print: "REGULAR NUMBER"
//
//Output:
//86
//DOUBLE EVEN
//
//99
//REGULAR NUMBER


    }
}
