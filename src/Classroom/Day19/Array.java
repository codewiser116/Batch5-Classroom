package Classroom.Day19;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        numbers[4] = 12;
        System.out.println(Arrays.toString(numbers));
        numbers[3] = 15;
        System.out.println(Arrays.toString(numbers));
        numbers[0] = 13;
        System.out.println(Arrays.toString(numbers));
    }
}
