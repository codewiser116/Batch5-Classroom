package Classroom.Day32.cart;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Product> productArrayList = new ArrayList<>();

    public void add(Product product){
        this.productArrayList.add(product);
    }

    public void displayProducts(){
        for(Product i: productArrayList){
            System.out.println(i.name);
            System.out.println(i.price);
            System.out.println(i.quantity);
        }
    }

    public void calculateTotalPrice(){
        double amount = 0;
        for (Product i: productArrayList){
            double price = i.price * i.quantity;
            amount+= price;
        }
        System.out.println(amount);
    }

}
