package Classroom.Day43.bank;

import Classroom.Day41.animals.Animal;
import Classroom.Day41.animals.Cat;
import Classroom.Day43.userExceptions.InsufficientFundsException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        Scanner scanner = new Scanner(System.in);

        // option 1 - register bankAccount
        // option 2 - make a transfer
        // option 3 - display registered accounts
        // option 4 - exit

        while(true){
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                scanner.nextLine();
                System.out.print("Enter full name:");
                String fullName = scanner.nextLine();
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter routing number: ");
                String routingNumber = scanner.nextLine();
                System.out.print("Enter initial balance: ");
                double balance = scanner.nextDouble();
                BankAccount ba = new BankAccount(fullName, accountNumber, routingNumber, balance);
                bank.addBankAccount(ba);
            }
            else if(choice == 2){
                scanner.nextLine();
                System.out.println("Enter account number to transfer from: ");
                String fromAccount = scanner.nextLine();
                System.out.println("Enter account number to transfer to: ");
                String toAccount = scanner.nextLine();
                System.out.println("Enter amount to transfer: ");
                double amount = scanner.nextDouble();
                bank.transfer(fromAccount, toAccount, amount);
            }
            else if(choice == 3){
                bank.displayAccounts();
            }
            else if(choice == 4){
                break;
            }
            else{
                System.out.println("Wrong option");
            }
        }

    }
}
