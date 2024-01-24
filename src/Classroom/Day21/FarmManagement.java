package Classroom.Day21;

import java.util.Scanner;

public class FarmManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] animals = {5, 10, 20};
        int[] price = {500, 200, 20};
        int day = 1;
        int totalIncome = 0;

        System.out.println("Welcome to the X Farm");
        System.out.println("Current animals counts: ");
        while(true){
            System.out.print("Cows-"+animals[0] + " ");
            System.out.print("Sheep-"+animals[1] + " ");
            System.out.print("Chickens-"+animals[2]);
            System.out.println("\nDay " + day);

            System.out.println("Do you wanna sell animals? yes/no");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Enter the number of cows to sell:");
                int cowsToSell = scanner.nextInt();
                if(cowsToSell>animals[0]){
                    System.out.println("Sorry, we sell you only " + animals[0]);
                    cowsToSell = animals[0];
                }
                System.out.println("Enter the number of sheep to sell:");
                int sheepToSell = scanner.nextInt();
                if(sheepToSell>animals[1]){
                    System.out.println("Sorry, we sell you only " + animals[1]);
                    sheepToSell = animals[1];
                }
                System.out.println("Enter the number of chickens to sell:");
                int chickensToSell = scanner.nextInt();
                if(chickensToSell>animals[2]){
                    System.out.println("Sorry, we sell you only " + animals[2]);
                    chickensToSell = animals[2];
                }
                animals[0]-=cowsToSell;
                animals[1]-=sheepToSell;
                animals[2]-=chickensToSell;
                int incomeToday = cowsToSell * price[0] + sheepToSell * price[1] + chickensToSell * price[2];
                totalIncome+=incomeToday;
                System.out.println("Total income for today: " + incomeToday + "$");
            }
            else{
                System.out.println("Total Income: " + totalIncome + "$");
                break;
            }
            day++;
            scanner.nextLine();
            animals[0] += 5;
            animals[1] += 10;
            animals[2] += 20;
        }

    }
}
