package Classroom.Day14;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(password.length()<4){
            System.out.println("Your password is too short");
        }
        if(!password.contains("!")){
            System.out.println("Your password doesn't contain !");
        }

        if(password.contains("!") && password.length()>=4 && password.length() < 7){
            System.out.println("1st Level");
        }
        else if(password.contains("!") && password.length()>=7 && password.length()<10){
            System.out.println("2nd level");
        }
        else if(password.contains("!")){
            System.out.println("3rd level");
        }









    }
}
