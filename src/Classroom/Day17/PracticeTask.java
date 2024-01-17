package Classroom.Day17;

import java.util.Random;
import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        // Task 1
        // 1st way
//        int number = 1;
//        while(number%2!=0){
//            System.out.println("Enter even number");
//            number = scanner.nextInt();
//        }
//        System.out.println("Thank you!");

        // 2nd way
//        while(true){
//            System.out.println("Enter even number: ");
//            int number = scanner.nextInt();
//            if(number%2==0){
//                System.out.println("Thank you!");
//                break;
//            }
//        }

        // Task 2
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.println("Enter a number divisible by 3 and 5");
//            int number = scanner.nextInt();
//            if(number%3==0 && number%5==0){
//                System.out.println("Thank you!");
//                break;
//            }
//        }
        // Task 3
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int randomNumber = random.nextInt(1,11);
//        System.out.println(randomNumber);
//        System.out.println("Random number is generated!");
//        int attempts = 0;
//        int jackpot = 10000;
//        while(true){
//            System.out.println("Guess a random number");
//            int number = scanner.nextInt();
//            attempts++;
//            if(attempts==11){
//                System.out.println("You lose!");
//                break;
//            }
//            if(number==randomNumber){
//                System.out.println("Congratulations! " + attempts + " attempts.");
//                System.out.println("You earned " + jackpot);
//                break;
//            }
//            jackpot-=1000;
//        }


//         Task 4
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int i = 0;
        while(i<str.length()){
            System.out.print(str.charAt(i));
            i++;
        }

//        Random random = new Random();
//        int n = random.nextInt(1,4);
//        if(n==1){
//            System.out.println("ROCK");
//        }
//        else if(n==2){
//            System.out.println("PAPER");
//        }
//        else{
//            System.out.println("SCISSORS");
//        }

    }
}
