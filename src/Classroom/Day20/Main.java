package Classroom.Day20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] history = new String[5];
        int gamerWin = 0;
        int computerWin = 0;
        System.out.println("Welcome to the Rock, Paper, Scissors game!");
        System.out.println("Game Start:");

        for(int i = 0; i <= 4; i++){
            System.out.println("Choose : 1 (Rock) , 2 (Scissors) , 3 (Paper)");
            int user = scanner.nextInt();
            int computer= random.nextInt(1,4);
            System.out.println("Computer chose: " + computer);
            if (user <= 0 || user >3){
                System.out.println("According the game enter numbers 1, 2 or 3");
            }
            if (user == computer){
                history[i] = "DRAW";
                System.out.println("It's Draw!");
            } else if (user == 1 && computer == 2) {
                history[i] = "USER";
                System.out.println("You win");
            } else if (user == 1 && computer == 3) {
                history[i] = "COMPUTER";
                System.out.println("You lose!");
            } else if (user == 2 && computer == 1) {
                history[i] = "COMPUTER";
                System.out.println("You lose!");
            } else if (user == 2 && computer == 3) {
                history[i] = "USER";
                System.out.println("You win");
            } else if (user == 3 & computer == 1) {
                history[i] = "USER";
                System.out.println("You win");
            } else if (user == 3 && computer == 2) {
                history[i] = "COMPUTER";
                System.out.println("You lose");
            }
        }
        System.out.println("Game over!");
        System.out.println(Arrays.toString(history));
    }
}
