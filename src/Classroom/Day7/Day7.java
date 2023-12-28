package Classroom.Day7;


import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter byte number: ");
        byte byte1 = sc.nextByte();
        System.out.println("Enter short number: ");
        short short1 = sc.nextShort();
        System.out.println("Enter int number: ");
        int number = sc.nextInt();
        System.out.println("Enter long number: ");
        long long1 = sc.nextLong();
        System.out.println("Enter float number: ");
        float float1 = sc.nextFloat();
        System.out.println("Enter double number: ");
        double double1 = sc.nextDouble();
//        char char1 = ;
        System.out.println("Enter boolean value:");
        boolean b1 = sc.nextBoolean();

        System.out.println(byte1);
        System.out.println(short1);
        System.out.println(number);
        System.out.println(long1);
        System.out.println(float1);
        System.out.println(double1);
        System.out.println(b1);
    }
}
