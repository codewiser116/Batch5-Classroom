package Classroom.Day32;

import java.util.ArrayList;

public class Store {
    String name;
    ArrayList<Item> inventory = new ArrayList<>();

    public Store(String name){
        this.name = name;
    }

    public void addItem(Item item){
        inventory.add(item);
        System.out.println(item.name + " was added!");
    }

    public void removeItem(int id){
        //  Shirt, Pants, Cap
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).id == id){
                System.out.println(inventory.get(i).name + " was removed!");
                inventory.remove(i);
                break;
            }
        }
    }

    public void displayInventory(){
        for (Item i: inventory) {
            i.displayItem();
        }
    }

    public void updateItem(int id, String name, double price, int quantity){
        for (int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).id == id){
                inventory.get(i).name = name;
                inventory.get(i).price = price;
                inventory.get(i).quantity = quantity;
                System.out.println("Item was updated!");
                break;
            }
        }
    }
}
