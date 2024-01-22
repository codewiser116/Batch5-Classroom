package Classroom.Day19;

import java.util.Arrays;

public class NoArrays {
    public static void main(String[] args) {
        String fruit1 = "apple";
        String fruit2 = "banana";
        String fruit3 = "orange";
        String fruit4 = "peach";

        String[] fruits = {"apple","banana","orange","peach"};
        String[] groceryList;
        String[] todoList;
        String[] contactList;
        char[] alphabet = {'a','b','c','d'};

        String[] colors = {"RED","ORANGE","BLUE","WHITE","BLACK"};
        String[] natureElements = {"water","air","fire","sunlight"};
        double[] lastWeekTemperature = {75.5,67, 70.8, 74, 69,65,60};




        String[] famousLandmarks = {"Grand Canyon", "Eiffel Tower", "Great Wall of China"};
        int[] numbers = new int[10];

        System.out.println(famousLandmarks[0] + ", " + famousLandmarks[1] + ", " + famousLandmarks[2]);
        System.out.println(Arrays.toString(famousLandmarks));


        System.out.println(Arrays.toString(numbers));



    }
}
