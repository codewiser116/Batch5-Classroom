package Classroom.Day12;

import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        // Assignment 1 Last tak
//        Scanner scanner = new Scanner(System.in);
//        String email = scanner.nextLine();
//        if(email.length()>=10 && email.contains("@")){
//            if(email.endsWith(".com")
//                    || email.endsWith(".org")
//                    || email.endsWith(".net")){
//                System.out.println("valid email address");
//            }
//        }
//        else{
//            System.out.println("invalid email address");
//        }

        // Assignment 2 Last task
        int a = 100, b = 100, c = 100;

        if(a > b && a>c && b > c){
            // a, b, c
            System.out.println(c + " " + b + " " + a);
            System.out.println(a + " " + b + " " + c);
        }
        // a, c, b
//        98 89 78
        else if(a > b && a>c && c > b){
            System.out.println(b + " " + c + " " + a);
            System.out.println(a + " " + c + " " + b);
        }
        // b, a, c
        else if(b > a && b > c && a > c){
            System.out.println(c+ " " + a + " " + b);
            System.out.println(b + " " + a + " " + c);
        }
        // b, c, a
        else if(b > a && b > c && c > a){
            System.out.println(a+ " " + c + " " + b);
            System.out.println(b + " " + c + " " + a);
        }
        // c, a, b
        else if(c > a && c > b && a > b){
            System.out.println(b + " " + a + " " + c);
            System.out.println(c + " " + a + " " + b);
        }
        // c, b, a
        else if(c > a && c > b && b > a){
            System.out.println(a + " " + b + " " + c);
            System.out.println(c + " " + b + " " + a) ;
        }
        else{
            System.out.println("All numbers are equal");
        }

    }
}
