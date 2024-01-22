package Classroom.Day19;

import java.util.Arrays;

public class PracticeTasks {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,99};
        int[] arr2 = {1,2,3,1,5};
        int[] arr3 = {1,2,3,1,2};

        System.out.println(arr1[0] + " " + arr1[3]);
        System.out.println(arr2[0]+" " + arr2[arr2.length-1]);
        System.out.println(arr3[0] +" " + arr3[arr3.length-1]);

        System.out.println(Arrays.toString(arr1));

    }
}
