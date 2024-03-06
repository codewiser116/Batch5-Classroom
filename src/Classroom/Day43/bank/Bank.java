package Classroom.Day43.bank;

import Classroom.Day43.userExceptions.AccountNotFoundException;
import Classroom.Day43.userExceptions.InsufficientFundsException;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount){
        this.bankAccounts.add(bankAccount);
        String message = bankAccount.getFullName() + ", " +
                bankAccount.getAccountNumber() + " was registered";

        bankLogger(message, "SUCCESS: ");
    }

    public void transfer(String fromAccount, String toAccount, double amount){
        BankAccount from = findBankAccount(fromAccount);
        BankAccount to = findBankAccount(toAccount);
        String message = "";
        try{
            if(from == null || to == null){
                message = fromAccount + " or " + toAccount + " doesn't exist!";
                throw new AccountNotFoundException(message);
            }
            else if(from.getBalance()>=amount){
                from.setBalance(from.getBalance() - amount);
                to.setBalance(to.getBalance() + amount);
                message = fromAccount + " to " + toAccount + " transferred " + amount;
                bankLogger(message, "SUCCESS: ");
            }
            else{
                message = fromAccount + " has less than " + amount;
                throw new InsufficientFundsException(message);
            }
        }catch (AccountNotFoundException e){
            bankLogger(message, "ERROR: ");
        }
        catch (InsufficientFundsException e){
            bankLogger(message, "TRANSFER ERROR: ");
        }
    }

    public BankAccount findBankAccount(String accountNumber){
        for (BankAccount b : bankAccounts) {
            if(b.getAccountNumber().equals(accountNumber)){
                return b;
            }
        }
        return null;
    }

    public void displayAccounts(){
        for (BankAccount bankAccount : bankAccounts) {
            System.out.println(bankAccount);
        }
    }

    // displayBankAccounts
    // transfer

    public static void bankLogger(String message, String status){
        String path = "/Users/codewiseacademy/Desktop/Batch5/Classroom1/src/Classroom/Day43/bank/BankLogger.txt";
        try(FileWriter fw = new FileWriter(path, true)){
            String logMessage = status + LocalDateTime.now() + " " + message + "\n";
            fw.write(logMessage);
        }
        catch(IOException e){
            System.out.println("File wasn't found!");
        }
    }

}
