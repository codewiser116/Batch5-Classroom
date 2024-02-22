package Classroom.Day36;

public class Overloading {
    public static void main(String[] args) {
        sum(5,6);
        sum(5.0,6.0);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
        System.out.println("Sum of 2 numbers");
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(double a, double b){
        System.out.println(a+b);
    }

    public static void sum(double a, double b, String str){
        System.out.println(a+b+ str);
    }

}
