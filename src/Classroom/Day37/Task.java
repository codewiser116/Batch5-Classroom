package Classroom.Day37;

import Classroom.Day37.AccessModifiers.Private;

import java.util.HashSet;

public class Task {
    public static void main(String[] args) {

        int[] array = {1,2,3,3,4,5,5};
        System.out.println(noDuplicates(array)); // true
    }


    public static boolean noDuplicates(int[] array){
        HashSet<Integer> set = new HashSet<>();
        for(int i: array){
            boolean b = set.add(i);
            if(!b){
               return false;
            }
        }
        return true;
    }
}
