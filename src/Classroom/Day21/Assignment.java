package Classroom.Day21;

import java.util.Arrays;
import java.util.Random;

public class Assignment {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        System.out.println(Arrays.toString(array));
        for(int i = 1; i < 10; i+=2){
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
    }
}
