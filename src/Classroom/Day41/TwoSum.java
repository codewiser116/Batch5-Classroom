package Classroom.Day41;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = {1,3,5,9};
        int target = 7;
        System.out.println(Arrays.toString(twoSum(array, target)));
    }

    public static int[] twoSum(int[] array, int target){
        int[] result = {-1,-1};
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] + array[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
