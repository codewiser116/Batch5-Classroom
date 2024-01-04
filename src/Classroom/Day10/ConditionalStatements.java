package Classroom.Day10;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("Minor");
        }
        else{
            System.out.println("Adult");
        }





    }
}
