package Classroom.Day19;

import java.util.Arrays;
import java.util.Random;

public class ArrayFill {
    public static void main(String[] args) {
        // Fill array with random numbers
        Random random = new Random();
        // create array with 5 zeros
        int[] number = new int[5];
        System.out.println(Arrays.toString(number));
        // Fills array with 5 random numbers
        for(int i = 0; i < number.length; i++){
            number[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(number));


    }
}
