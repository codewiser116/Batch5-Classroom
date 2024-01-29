package Classroom.Day22;

import java.util.Arrays;

public class PracticeTasks {
    public static void main(String[] args) {
//        greeting();
//        task2();
//        task3("Mike");
//        System.out.println(sum(5, 9));
//        System.out.println(largerN(10, 15));
//        System.out.println(upperCaseStr("hi batch5"));
//        System.out.println(evenOdd(5));
//        System.out.println(lengthStr("Hello"));
        int[] array = {100,2,3000,44,500};
//        System.out.println(largestNArray(array));
        method(array);
    }

    public static void greeting(){
        System.out.println("Hello, World!");
    }

    public static void task2(){
        for(int i = 1; i<=10; i++){
            System.out.println("Hello, World!");
        }
    }

    public static void task3(String str){
        for(int i = 1; i <= 10; i++){
            System.out.println(str);
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }

    // Write a method that takes two integers as parameters
    // and returns the larger one, print the larger one in the main method.

    public static int largerN(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    public static String upperCaseStr(String str){
        return str.toUpperCase();
    }

    public static String evenOdd(int n){
        if(n % 2 == 0){
            return "even";
        }
        else{
            return "odd";
        }
    }

    public static int lengthStr(String str){
        return str.length();
    }

    public static int largestNArray(int[] array){
        Arrays.sort(array);
        int greatest = array[array.length-1];
        return greatest;
    }

    public static void method(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " Hi");
        }
    }
}
