package Classroom.Day9;

import java.util.Scanner;

public class PracticeProblems {
    public static void main(String[] args) {
        // Task 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a String word: ");
//        String word = scanner.nextLine();
//
//        System.out.print("Enter old character: ");
//        String old = scanner.nextLine();
//
//        System.out.print("Enter new word: ");
//        String newWord = scanner.nextLine();
//
//        System.out.println("New word is: " + word.replace(old, newWord));
        // Task 2
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
//        System.out.println(word.substring(2));

        // Task 3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a String word: ");
//        String word = scanner.nextLine();
//        int length = word.length();
//        System.out.println("The length of the string is " + length + " characters" );
        // Task 4
//        String message = "This is just an example text!u";
//        int length = message.length();
//        System.out.println(message.charAt(length-1));
//        System.out.println(message.toLowerCase().charAt(0));
//        System.out.println(message.toUpperCase().charAt(length-1));
//        System.out.println(message.substring(length - 4));
//        System.out.println(message.substring(2,length-2));
//        System.out.println(message.substring(4,length-4));

        // Task 5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter str1: ");
//        String str1 = scanner.nextLine();
//        System.out.println("Enter str2: ");
//        String str2 = scanner.nextLine();
//
//        int length = str2.length();
//        String result = str1.substring(0,2) + str2.substring(length - 2);
//
//        System.out.println("Result is: " + result);

        // Task 6
//        String str = scanner.nextLine();
//        System.out.println(str.indexOf("o") + " and " + str.lastIndexOf("o"));

        // Task 7
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a String word: ");
//        String word = scanner.nextLine();
//
//        System.out.println("Q: Does the String word ends with ly?");
//        System.out.println("A: " + word.endsWith("ly"));

        // Task 8
//        Scanner scanner = new Scanner(System.in);
//        String word = scanner.nextLine();
        // MACBOOK
        // 0123456
        // n = 3
        // MAC - word.substring(0,3)
        // OOK - word.substring(2)
//        int n = scanner.nextInt();
//        System.out.println("Result: " + word.substring(0,n) +
//                word.substring(n+1));

        // vacation
        // remove letter 4 - 't'
        // int n = 4;
        // str.substring(0,n) - vaca
        // str.substring(n+1) - ion

        // Task 9
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int start = scanner.nextInt(); // 2
        int end = scanner.nextInt(); // 5
        String first = str.toUpperCase().substring(0,start);

        String second = str.toLowerCase().substring(start,end+1);
        String last = str.toUpperCase().substring(end+1);
        System.out.println(first + second + last);




    }
}
