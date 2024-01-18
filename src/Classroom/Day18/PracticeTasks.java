package Classroom.Day18;

import java.util.Random;
import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
        // Task 1
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int letters = 0, chars = 0, digits = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (Character.isDigit(ch)) {
//                System.out.println(ch + " a digit");
//                digits++;
//            } else if (Character.isLetter(ch)) {
//                System.out.println(ch + " letter");
//                letters++;
//            } else {
//                System.out.println(ch + " special character");
//                chars++;
//            }
//        }
//        System.out.println("Letters: " + letters + ", Digits: " + digits + " Special Chars: " + chars);

        // Task 2
//        Random random = new Random();
//        int sum = 0;
//        for(int i = 1; i <= 10; i++){
//            int randomN = random.nextInt(50,101);
//            System.out.print(randomN+" ");
//            sum++;
//        }
//        int average = sum/10;
//        System.out.println("\nAverage: " + average);
//        if(average>70){
//            System.out.println("camp free");
//        }
//        else{
//            System.out.println("camp paid");
//        }

        // Task 3
//        Scanner scanner = new Scanner(System.in);
//        int greatest = Integer.MIN_VALUE;
//        for(int i = 1; i<=5; i++){
//            int number = scanner.nextInt();
//            if(greatest<number){
//                greatest = number;
//            }
//        }
//        System.out.println("The greatest number is " + greatest);
        // Task 4
//        Random random = new Random();
//        int heads = 0, tails = 0;
//        for(int i = 1; i<=3; i++){
//            int coinSide = random.nextInt(1,3);
//            if(coinSide==1){
//                System.out.println("HEADS");
//                heads++;
//            }
//            else{
//                System.out.println("TAILS");
//                tails++;
//            }
//        }
//        if(heads==3 || tails==3){
//            System.out.println("You won a jackpot!");
//        }
//        else{
//            System.out.println("You lose");
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BANK ATM");
        System.out.println("INSERT your CARD");
        System.out.println("Enter initial balance:");
        int balance = scanner.nextInt();

        while(true){
            System.out.println("Do you wanna deposit(1), cash out(2), or exit(3)");
            int choice = scanner.nextInt();

            if(choice==1){
                System.out.println("How much would you like to deposit: ");
                int deposit = scanner.nextInt();
                balance+=deposit;
                System.out.println("Successfully deposited " + deposit + "$");
                System.out.println("Balance: " + balance + "$");
            }
            else if(choice==2){
                System.out.println("How much would you like to withdraw: ");
                int withdraw = scanner.nextInt();
                balance-=withdraw;
                System.out.println("Successfully cashed out " + withdraw + "$");
                System.out.println("Balance: " + balance + "$");
            }
            else if(choice==3){
                System.out.println("Take your card, Thank you!");
                break;
            }

        }


    }
}
