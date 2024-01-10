package Classroom.Day13;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("Choose math operator: ");
        scanner.nextLine();
        String mo = scanner.nextLine();

        if(mo.equals("+"))
            System.out.println(num1 + mo + num2 + "=" + (num1+num2));
        else if(mo.equals("-"))
            System.out.println(num1 + mo + num2 + "=" + (num1-num2));
        else if(mo.equals("*"))
            System.out.println(num1 + mo + num2 + "=" + (num1*num2));
        else if(mo.equals("/"))
            System.out.println(num1 + mo + num2 + "=" + (num1/num2));
        else if(mo.equals("%"))
            System.out.println(num1 + mo + num2 + "=" + (num1%num2));
        else
            System.out.println("Wrong math operator");




    }
}
