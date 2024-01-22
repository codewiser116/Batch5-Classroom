package Classroom.Day19;

import java.util.Arrays;

public class ArrayStrings {
    public static void main(String[] args) {
        String[] str = new String[5];
        System.out.println(Arrays.toString(str));
        str[0] = "Clear your mind";
        str[1] = "Apple";
        str[2] = "Car";
        str[3] = "Banana";
        str[4] = "Meal";
        System.out.println(Arrays.toString(str));
        str[2] = "Camp";
        System.out.println(Arrays.toString(str));
    }
}
