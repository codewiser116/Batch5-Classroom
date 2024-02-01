package Classroom.Day25;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] array = {1,23,4,15,96};
//        changeArray(array);

    }

    public static void changeArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i]<10){
                array[i] = 0;
            }
        }
    }

    public static boolean only14(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=4 && nums[i]!=1){
                return false;
            }
        }
        return true;
    }

}
