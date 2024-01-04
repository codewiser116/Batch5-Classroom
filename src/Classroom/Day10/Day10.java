package Classroom.Day10;

import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt(); // age = 25
        // if age is smaller than 18 -> false
        // then print following line
        System.out.println("Minor");

        // otherwise print Adult      -> true
        System.out.println("Adult");

    }
}
