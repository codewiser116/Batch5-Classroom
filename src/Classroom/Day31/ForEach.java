package Classroom.Day31;

import java.util.ArrayList;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // input 5 arrayList names
        for(int i = 1; i <= 5; i++){
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            names.add(name);
        }
        // prints names
        System.out.println(names);
        int whichSara = 0;
        // remove 2nd Mike
        for(int i = 0; i < names.size(); i++){
            if(names.get(i).equals("Sara")){
                whichSara++;
            }
            if(whichSara==3){
                names.remove(i);
                break;
            }
        }
        // print names
        System.out.println(names);


    }
}
