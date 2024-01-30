package Classroom.Day23;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 20;
//        assignNewValue(a);
//        System.out.println("Main - " + a);
        int[] arr = {1,2,3,4,5};
        int n = 44;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                found = true;
                System.out.println(true);
                break;
            }
        }

        if(!found){
            System.out.println("Number doesn't exist");
        }
    }

    public static void assignNewValue(int a){
        a = 50;
        System.out.println("Method - " + a);
    }


}

