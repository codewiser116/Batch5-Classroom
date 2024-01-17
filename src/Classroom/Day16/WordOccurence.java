package Classroom.Day16;

import java.util.Scanner;

public class WordOccurence {

    public static void main(String[] args) {
        /*
        5. Write a program that takes from user to enter 2 string values, str1 and str2.
        Print the number of occurences of str2 in str1.

        your str2 every time must be only 3 letters

        Input: Codingisc odingbutnot code
        Input: cod
        Output: cod is repeated 3 times
        Explanation: cod is repeated in codingiscodingbutnotcode 3 times

        1. create scanner
        2. create str1 and get value from scanner
        3. create str2 and get value from scanner
        4. verify str2.length = 3, if != 3 => fail, or ask to enter again
        5. convert str1 and str2 to lowercase
        6. remove empty spaces, remove(" ", "")
        7. create int counter (to count occurence)
        8. create for loop (int i =0; i < st1.length() - str2.length()
        9. substring every possible combination of 3 letters by substring
        10. check if newly created word is equal to str2
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter word 1:");
        String str1 = scanner.nextLine();

        System.out.println("Enter word 2:");
        String str2 = scanner.nextLine();

        if (str2.length() != 3){
            System.out.println("FAIL: the word must contain 3 letters");
            System.exit(0);
        }

        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        int counter = 0;

        for (int i = 0; i <= str1.length() - str2.length(); i++){
            if (str1.substring(i, i + str2.length()).equals(str2)){
                counter++;
            }
        }

        System.out.println(str2 + " appeared " + counter + " times");





    }

}
