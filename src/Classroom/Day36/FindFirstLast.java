package Classroom.Day36;

import Classroom.Day37.AccessModifiers.Public;

import java.util.Arrays;

public class FindFirstLast {
    public static void main(String[] args) {
        int[] array = {1,2,4,5,5,5,6,7,9,9,9,9,10,23,56,100,125,125};
        int target = 5;
        System.out.println(Arrays.toString(findFirstLast(array, target)));

    }

    public static int[] findFirstLast(int[] array, int target){
        int first = -1, last = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i]!=target){
                continue;
            }
            if(first==-1){
                first=i;
            }
            last=i;
        }
        return new int[]{first,last};
    }
}

