package Classroom.Day15;

import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
        // Task 1
//        String str = "computer";
//        for(int i = str.length()-1; i>=0; i--){
//            System.out.print(str.charAt(i));
//        }

        // Task 2
//        String word = "comepteem";
//        int count = 0;
//        for(int i = 0; i<= word.length()-1; i++){
//            if(word.charAt(i) == 'e'){
//                count++;
//            }
//        }
//        System.out.println("e is repeated "+count+" times");
        // Task 3
        // vowels = a e o u i
//        String str = "programming";
//        int count = 0;
//        for(int i = 0; i <= str.length()-1; i++){
//            if(str.charAt(i)=='a' || str.charAt(i) == 'e' ||
//            str.charAt(i)=='o' || str.charAt(i)=='u'
//                    || str.charAt(i) == 'i'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // Task 4
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for(int i = 1; i<=5; i++){
//            int number = scanner.nextInt();
//            sum += number;
//            System.out.println(sum);
//        }
//        System.out.println("The sum of numbers is " + sum);
        // Task 5
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        for(int i = 1; i<=5; i++){
//            int number = scanner.nextInt();
//            if(number>20)
//                sum += number;
//        }
//        System.out.println("The sum of numbers is " + sum);


        // Task 6
        Scanner scanner = new Scanner(System.in);
        int odds = 0, evens = 0;

        for(int i = 1; i<=6; i++){
            int number = scanner.nextInt();
            if(number % 2 == 0){
                evens+=number;
            }
            else{
                odds+=number;
            }
        }
        System.out.println("The sum of odds: " + odds);
        System.out.println("The sum of evens: " + evens);


    }
}
