package Classroom.Day16;

import java.util.Random;
import java.util.Scanner;

public class WarmUpTasks {
    public static void main(String[] args) {
        /*
        CREATE 10 BOOLEAN VARIABLES WITH VALUES
         */

        boolean b1 = 5 > 10;
        boolean b2 = "word".length() != 9;
        boolean b3 = (5 + 5) <= 15;
        boolean b4 = "hi".equals("HELLO");

        String str1 = "Google";
        String str2 = "google";

        boolean b5 = str1.equals(str2);
        boolean b6 = str1.equalsIgnoreCase(str2);

        boolean b7 = "word".contains("e");

        boolean b8 = "word".startsWith("W");

        boolean b9 = true == false;

        boolean b10 = !false;

        /*
        4. Write a Java program that prompts the user to enter two integers, start and end.
        The program should then generate 5 random numbers within the range specified
        by start (inclusive) and end (inclusive). Finally, display these 5 random numbers.
            Output:
            Enter start: 1
            Enter end: 99
            Random numbers:
            5
            87
            92
            34
            23
         */

        /*
        1. Create Scanner object
        2. ask user to enter number and assign it to int start
        3. ask user to enter number and assign it to int end
        4. Create Random object
        5. create for loop which loops 5 times
        5. inside loop, sout(generate number)

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int start = sc.nextInt();

        System.out.println("Please enter second number:");
        int end = sc.nextInt();

        Random random = new Random();

        for (int i = 1; i <= 5; i++){
            System.out.println(random.nextInt(start, end));
        }

        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt());

        /*
        1. Write a program that prints multiplications table.
            Ask user starting and ending numbers.
            Also ask user for which number is multiplication table.
            Enter The Starting Number :1
            Enter The Ending Number :5
            Enter The Tables Number :3

            Output:
            3 * 1 = 3
            3 * 2 = 6
            3 * 3 = 9
            3 * 4 = 12
            3 * 5 = 15
         */

        System.out.println("Enter starting number : ");
        int star = sc.nextInt();
        System.out.println("Enter ending number : ");
        int end1 = sc.nextInt();
        System.out.println("Enter tables number : ");
        int table = sc.nextInt();

        for(int i = star ; i <= end1; i++ ){
            System.out.println(table + " * " + i + " = " + (table *i));

        }




    }
}
