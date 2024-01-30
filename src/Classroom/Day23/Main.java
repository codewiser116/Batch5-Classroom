package Classroom.Day23;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 20;
//        assignNewValue(a);
//        System.out.println("Main - " + a);
        String[] bookTitles = {"Java Programming", "Python Basics", "Algorithms 101"};
        int[] availableCopies = {5,2,8};
        String book = "Javascript";
        for (int i = 0; i < bookTitles.length; i++) {
            if (bookTitles[i].contains(book)) {
                availableCopies[i]-=1;
                System.out.println("successfully borrowed a book");
            }
        }
        System.out.println(Arrays.toString(bookTitles));
        System.out.println(Arrays.toString(availableCopies));
        //
    }

    public static void assignNewValue(int a){
        a = 50;
        System.out.println("Method - " + a);
    }


}

