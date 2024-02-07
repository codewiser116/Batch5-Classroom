package Classroom.Day28.ApartmentManagement;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        // (1) do you wanna add person?
        // (2) display all people
        // (3) exit
        System.out.println("(1) Do you wanna add person?");
        System.out.println("(2) Display all people");
        System.out.println("(3) Exit");
        while(true){
            System.out.println("Choose option: ");
            int choice = scanner.nextInt();
            if(choice==1){
                scanner.nextLine();
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter gender: ");
                String gender = scanner.nextLine();
                Person person = new Person(name, age, gender);
                people[counter] = person;
                counter++;
            }
            else if(choice==2){
                for(int i = 0; i < counter; i++){
                    System.out.println(people[i].name + " " + people[i].age + " " + people[i].gender);
                }
            }
            else{
                break;
            }
        }
    }
}

// Welcome!
// (1) do you wanna add person?
// (2) display all people
// (3) exit
// Choose option: 1
// Name: Zack
// Age: 32
// Gender: MALE
// Choose option: 2
// Zack, 32, MALE
// Choose option: