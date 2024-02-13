package Classroom.Day31;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
        // Task 1
//        ArrayList<String> animalNames = new ArrayList<>();
//        HashSet<String> setAnimals = new HashSet<>(animalNames);
//        for(int i = 1; i <=5; i++){
//            Scanner scanner = new Scanner(System.in);
//            String name = scanner.nextLine();
//            animalNames.add(name);
//        }
//        System.out.println("Unique values: " + setAnimals);

        // Task 2
//        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
//        for(int i = 0; i < list.size(); i++){
//            if (list.get(i)%2==0){
//                list.add(i,10);
//                i++;
//            }
//        }
//        System.out.println(list);
        // Task 3
//        ArrayList<String> colors = new ArrayList<>(List.of(
//                "white","pink","purple","black","yellow","green"
//        ));
//        for(int i = 0; i < colors.size(); i++){
//            if(colors.get(i).length()<6){
//                colors.set(i,"black");
//            }
//        }
//        System.out.println(colors);
        // Task 4
        ArrayList<String> contactList = new ArrayList<>();
        System.out.println("Interactive Menu Options: ");
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. display");
        System.out.println("4. exit");
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose option:");
            int choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("Enter name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                contactList.add(name);
            }
            else if(choice==2){
                System.out.println("Enter name to be removed: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                contactList.remove(name);
            }
            else if(choice == 3){
                System.out.println(contactList);
            }
            else if(choice == 4){
                System.out.println("Exit!");
                break;
            }
            else {
                System.out.println("wrong");
            }
        }


    }
}
