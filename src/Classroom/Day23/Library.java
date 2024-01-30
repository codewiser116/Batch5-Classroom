package Classroom.Day23;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bookTitles = {"Java Programming", "Python Basics", "Algorithms 101"};
        int[] availableCopies = {5,2,8};
    }

    public static void displayBooks(String[] bookTitles, int[] availableCopies){
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println(bookTitles[i] + " - Available copies: " + availableCopies[i]);
        }
    }

    public static void borrowBook(String[] bookTitles, int[] availableCopies){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which book do you wanna borrow: ");
        String book = scanner.nextLine();
        boolean bookFound = false;

        for (int i = 0; i < bookTitles.length; i++) {
            if(bookTitles[i].contains(book)){
                bookFound = true;
                availableCopies[i]--;
                System.out.println("You successfully took a book!");
                break;
            }
        }
        if(!bookFound){
            System.out.println("Book wasn't found");
        }
    }

    public static void displayMenu(){
        System.out.println("Display menu options");
        System.out.println("1. Display books");
        System.out.println("2. Borrow a book");
        System.out.println("3. Exit");
    }



}
