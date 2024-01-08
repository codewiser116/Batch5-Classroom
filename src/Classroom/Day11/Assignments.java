package Classroom.Day11;

import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a > b && a > c){
            System.out.println("A is the greatest: " + a);
        }
        else if(b > a && b >c){
            System.out.println("B is the greatest: " + b);
        }
        else if(c > a && c > b){
            System.out.println("C is the greatest: " + c);
        }
        else{
            System.out.println("They are all equal");
        }


    }
}
