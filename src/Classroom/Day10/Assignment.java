package Classroom.Day10;

public class Assignment {
    public static void main(String[] args) {
        // Day 9, Assignment 2 Task 6
//        String str = "  This is a random string for testing purposes  ";
//        int index = str.lastIndexOf("random"); //
//
//        String result = str.substring(index, index + 6);

        // Day 9, Assignment 2 Task 7
//        int length = result.length();
//
//        System.out.print(result.toUpperCase().charAt(length-1));
//        System.out.print(result.toUpperCase().charAt(length-2));
//        System.out.print(result.toUpperCase().charAt(length-3));
//        System.out.print(result.toUpperCase().charAt(length-4));
//        System.out.print(result.toUpperCase().charAt(length-5));
//        System.out.print(result.toUpperCase().charAt(0));

        // Day 9, Assignment 3, Task 8

        String word = "programming";
        int start = 3, end = 6;
        String part = word.substring(start, end);
        String str = "" + part.charAt(2) + part.charAt(1) + part.charAt(0);
        String result = word.substring(0,start) + str + word.substring(end);
        System.out.print(word.substring(0,start));
        System.out.print(str);
        System.out.print(word.substring(end));
        // arg
        // pro + arg + mming


    }
}
