package Classroom.Day10;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task 1
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        if(a==b){
//            System.out.println("a==b");
//        }
//        else if(a > b){
//            System.out.println("a>b");
//        }
//        else{
//            System.out.println("a<b");
//        }
        // Task 2
        int savings = scanner.nextInt();

        if(savings >= 20000){
            System.out.println("Congratulations, you bought car A");
        }
        else if(savings >= 10000){
            System.out.println("Congratulations, you bought car B");
        }
        else if(savings >= 5000){
            System.out.println("Congratulations, you bought car C");
        }
        else{
            System.out.println("Maybe next time!");
        }


    }
}
