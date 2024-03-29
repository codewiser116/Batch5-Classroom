package Classroom.Day32;

public class Item {
    int id;
    String name;
    double price;
    int quantity;

    public Item(int id, String name, double price,
                int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayItem(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------");
    }
}
