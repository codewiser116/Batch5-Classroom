package Classroom.Day26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,5,7,34,4};
        pre4(array);
    }


    public static boolean doubleX(String str) {
        return str.contains("xx");
    }

    public static boolean arrayFront9(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(i==4){
                return false;
            }
            else if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    public static int[] pre4(int[] nums) {
        int sizeOfNewArray = 0;
        // To find out the size for the new array
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==4){
                sizeOfNewArray = i;
                break;
            }
        }
        int[] copy = new int[sizeOfNewArray];
        // Copying elements
        for(int i = 0; i < copy.length; i++){
            copy[i] = nums[i];
        }

        return copy;
    }



}
