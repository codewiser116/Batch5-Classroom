package Classroom.Day44;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5 -> System.out.println("Spring");
            case 6,7,8 -> {System.out.println("Summer");}
            case 9,10,11 -> System.out.println("Fall");
            default -> System.out.println("Invalid month");
        }

        int age = 30;
        switch(age){
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19 ->
            {
                System.out.println("Teen");
            }
        }
    }
}
