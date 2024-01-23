package Classroom.Day20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
//        // Task 1
//        String[] str = new String[10];
//        Arrays.fill(str, "Hi");
//        System.out.println(Arrays.toString(str));


        // Task 2
        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] array = new int[size];
//        Random random = new Random();
//        int sum = 0;
//        // filling array with random number
//        for(int i = 0; i< array.length; i+=2){
//            array[i] = random.nextInt(11);
//            sum+= array[i];
//        }
//        // to print all array elements
//        System.out.println(Arrays.toString(array));
//        // to print sum
//        System.out.println("Sum: " + sum);

        // Task 3
//        int[] array1 = {1,2,3,4,5};
//        int[] array2 = array1.clone();
//
//        System.out.println("BEFORE");
//        System.out.println("ARRAY 1 " + Arrays.toString(array1));
//        System.out.println("ARRAY 2 " + Arrays.toString(array2));
//        array2[0] = 10;
//        System.out.println("AFTER");
//        System.out.println("ARRAY 1 " + Arrays.toString(array1));
//        System.out.println("ARRAY 2 " + Arrays.toString(array2));

        // Task 4
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            if(array[i]>=50){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]<50){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            if(array[i]%2==1){
                System.out.print(array[i] + " ");
            }
        }

    }
}