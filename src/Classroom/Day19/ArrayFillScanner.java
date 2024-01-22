package Classroom.Day19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayFillScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++){
            System.out.println("enter element value for index " + i);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Assigned numbers are: " + Arrays.toString(numbers));

        // Output:
        // Enter element value for index 0:
        // 25
        // Enter element value for index 1:
        // 99
        // Enter element value for index 2:
        // 1
        // Enter element value for index 3:
        // 34
        // Enter element value for index 4
        // 78
        // [25, 99, 1, 34, 78]
    }
}
