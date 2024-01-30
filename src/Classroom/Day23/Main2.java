package Classroom.Day23;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        assignNewValue(array);
        System.out.println(Arrays.toString(array));
    }

    public static void assignNewValue(int[] array){
        array[0] = 0;
    }


}
