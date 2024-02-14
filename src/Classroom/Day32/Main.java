package Classroom.Day32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Fashion store");



        System.out.println("1. Add an item");
        System.out.println("2. Update an item");
        System.out.println("3. Remove an item");
        System.out.println("4. Display items");
        System.out.println("5. Exit");
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Choose option: ");
            int option = scanner.nextInt();
            if(option == 1){
                System.out.println("Enter item ID: ");
                int id = scanner.nextInt();
                System.out.println("Enter item name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter item price:");
                double price = scanner.nextDouble();
                System.out.println("Enter quantity:");
                int quantity = scanner.nextInt();
                Item item = new Item(id, name, price, quantity);
                store.addItem(item);
            }
            else if(option == 2){
                System.out.println("Enter item ID to update: ");
                int id = scanner.nextInt();
                System.out.println("Enter new name:");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Enter new price:");
                double price = scanner.nextDouble();
                System.out.println("Enter new quantity:");
                int quantity = scanner.nextInt();
                store.updateItem(id,name,price,quantity);
            }
            else if(option == 3){
                System.out.println("Enter item ID to remove: ");
                int id = scanner.nextInt();
                store.removeItem(id);
            }
            else if(option == 4){
                store.displayInventory();
            }
            else if(option == 5){
                break;
            }
            else{
                System.out.println("Wrong option");
            }
        }


    }
}
