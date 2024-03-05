package Classroom.Day42;

import Classroom.Day41.animals.Animal;
import Classroom.Day41.animals.Cat;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctLetters {
    String str;

    public static void main(String[] args) {
        DistinctLetters distinctLetters = new DistinctLetters();








    }

    public static void distinctLetters(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char charToPut = str.charAt(i);
            if(!map.containsKey(str.charAt(i))){
                map.put(charToPut, 1);
            }
            else{
                int previousValue = map.get(charToPut);
                map.replace(charToPut, previousValue+1);
            }
        }
        System.out.println(map);
    }
}
