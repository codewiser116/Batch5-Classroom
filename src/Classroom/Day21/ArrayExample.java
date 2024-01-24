package Classroom.Day21;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = new String[4];
        int[] prices = new int[4];
        int count = 0;
        System.out.println(" Option 1 - list all products");
        System.out.println(" Option 2 - add a new product");
        System.out.println(" Option 3 - Exit");
        while(true){
            System.out.print("Choose: ");
            int option = scanner.nextInt();
            if(option==1){
                System.out.println(Arrays.toString(products));
                System.out.println(Arrays.toString(prices));
            }
            else if(option==2){
                if(count==products.length){
                    System.out.println("Array is full!");
                }
                else{
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String productName = scanner.nextLine();
                    products[count] = productName;
                    System.out.println("Enter product price: ");
                    int price = scanner.nextInt();
                    prices[count] = price;
                    count++;
                }
            }
            else{
                break;
            }
        }
    }
}
