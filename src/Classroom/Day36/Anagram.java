package Classroom.Day36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "hello hello hello b eat eat";
        String[] array = str1.split(" ");
//        [hello, hello, hello, b, eat, eat]
        // [hello:1]
        HashMap<String, Integer> map = new HashMap<>();
        for(String i: array){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                map.replace(i, map.get(i) + 1);
            }
        }

        System.out.println(map);
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        else{
            char[] ch1 = str1.toCharArray(); // [b,o,r,e,d]
            char[] ch2 = str2.toCharArray(); // [r,o,b,e,d]
            Arrays.sort(ch1); // [b,d,e,o,r]
            Arrays.sort(ch2); // [b,d,e,o,r]
            return Arrays.equals(ch1,ch2);
        }
    }
}
