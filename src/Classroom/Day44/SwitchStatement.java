package Classroom.Day44;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        while(number!=4){
            number = scanner.nextInt();;
            switch (number){
                case 1->
                    System.out.println("Create bank account");
                case 2->
                    System.out.println("Display all bank accounts");
                case 3->
                    System.out.println("Cashout bank account");
                case 4->
                    System.out.println("exiting");
                default->
                    System.out.println("not in 10, 20, 30");
            }
        }
    }
}
