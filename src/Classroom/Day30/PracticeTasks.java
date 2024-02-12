package Classroom.Day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PracticeTasks {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(List.of(1,2,3,4,5,6));
        // [1,2,3,4,5,6]
        // [1,2,10,3,4,10,5,6]
        System.out.println(add10(integerArrayList));
    }

    public static ArrayList<Integer> fillRandom(ArrayList<Integer> list){
        Random random = new Random();
        for(int i = 1; i <= 10; i++){
            int r = random.nextInt(10,50);
            list.add(r);
        }
        return list;
    }

    public static ArrayList<Integer> add10(ArrayList<Integer> list){
        int size = list.size(); // 6
        for(int i = 0; i < size; i++){
            if(list.get(i) % 2 == 0){
                list.add(i+1,10);
                System.out.println(list);
            }
        }
        return list;
    }




}
