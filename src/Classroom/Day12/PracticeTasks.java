package Classroom.Day12;

import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String word2 = scanner.nextLine();
        String word3 = scanner.nextLine();
        String word4 = scanner.nextLine();
        String word5 = scanner.nextLine();
        String word6 = scanner.nextLine();
        String word7 = scanner.nextLine();
        if(word.startsWith("x") && word.endsWith("x")){
            System.out.println(word.substring(1,word.length()-1));
        }
        else if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }
        else if(word.endsWith("x")){
            System.out.println(word.substring(0, word.length()-1));
        }
        else{
            System.out.println(word);
        }

        if(word.startsWith("x") && word.endsWith("x")){
            System.out.println(word.substring(1,word.length()-1));
        }
        else if(word.startsWith("x")){
            System.out.println(word.substring(1));
        }
        else if(word.endsWith("x")){
            System.out.println(word.substring(0, word.length()-1));
        }
        else{
            System.out.println(word);
        }



        // 3 scenarios
        // 1) xhix -> hi
        // 2) xhxi -> hxi
        // 3) ixhx -> ixh

    }
}
