package Classroom.Day30;

import java.util.Arrays;

public class ArrayListBehindtheScene {
    public static void main(String[] args) {
        // 0,1,2,3, 4,  5,  6,  7,   8,  9
        // 1,2,7,54,234,543,234,6432,7
        int[] arr = {1,2,7,54,234,543,234,6432,234,7};
        int number = 5;
        int[] arr1 = new int[arr.length+1]; // 0,0,0
        // To add numbers from the original array to new array
        // 1,2,0
        for(int i = 0; i<arr1.length-1; i++){
            arr1[i] = arr[i];
        }
        arr1[arr.length] = number; // 1,2,5
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }
}
