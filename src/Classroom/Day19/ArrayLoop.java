package Classroom.Day19;

import java.util.Arrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] array = new int[]{90, 23, 5, 109,99,12,123,54,3,34};

//        // PRINTS ALL ELEMENTS
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        // PRINT ALL ELEMENTS, except 1st and last
        for(int i = 1; i < array.length-1; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        // PRINT FIRST 5 numbers
        for(int i = 0; i<5; i++){
            System.out.print(array[i] + " ");
        }


    }
}
