package Classroom.Day24;

import java.util.Arrays;

public class PracticeTasks {
    public static void main(String[] args) {


    }



    public static boolean hasTeen(int a, int b, int c){
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19);
    }

    public static boolean mixStart(String str){
        return str.substring(1).startsWith("ix");
    }

    public static String checkNumber(int n){
        if(n>0){
            return "positive";
        }
        else if(n<0){
            return "negative";
        }
        else{
            return "zero";
        }
    }

    public static int sumDouble(int a, int b){
        if(a==b){
            return (a+b) * 2;
        }
        else{
            return a + b;
        }
    }

    public static boolean array123(int[] array){
        for(int i = 0; i < array.length-2; i++){
            if(array[i]==1 && array[i+1] == 2 && array[i+2] == 3){
                return true;
            }
        }

        return false;

    }


}
