package Classroom.Day33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {
//        // Task 1
//        double max = 0;
//        String companyName = "";
//        HashMap<String, Double> stockPrice = new HashMap<>();
//        stockPrice.put("apple",400.90);
//        stockPrice.put("tesla",1200.32);
//        stockPrice.put("meta",300.43);
//        stockPrice.put("bofa",5.5);
//        stockPrice.put("slack",123.54);
//        stockPrice.put("macdonalds",98.12);
//
//
//        for(Map.Entry<String, Double> entry: stockPrice.entrySet()){
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                companyName = entry.getKey();
//            }
//        }
//
//        System.out.println(companyName+"="+max);
//
//         Task 2
//        HashMap<String, Double> stockPrice = new HashMap<>();
//        stockPrice.put("apple",400.90);
//        stockPrice.put("tesla",1200.32);
//        stockPrice.put("meta",300.43);
//        stockPrice.put("bofa",5.5);
//        stockPrice.put("slack",123.54);
//        stockPrice.put("macdonalds",98.12);
//
//        double sum = 0;
//        for(Map.Entry<String, Double> e: stockPrice.entrySet()){
//            sum+= e.getValue();
//        }
//        System.out.println("Average stock price is " + sum/stockPrice.size());

        // Task 3
//        HashMap<String, Double> stockPrice = new HashMap<>();
//        stockPrice.put("apple",400.90);
//        stockPrice.put("tesla",1200.32);
//        stockPrice.put("meta",300.43);
//        stockPrice.put("bofa",5.5);
//        stockPrice.put("slack",123.54);
//        stockPrice.put("macdonalds",98.12);
//
//        HashMap<String, Double> updatedStocks = new HashMap<>();
//
//        for(Map.Entry<String, Double> e: stockPrice.entrySet()){
//            if(e.getValue() < 200){
//                updatedStocks.put(e.getKey(), e.getValue());
//            }
//        }
//        System.out.println(updatedStocks);

        // Task 4
        HashMap<String, Double> fruitPrices =  new HashMap<>();
        fruitPrices.put("apple",2.5);
        fruitPrices.put("banana",2.0);
        fruitPrices.put("orange",1.5);
        fruitPrices.put("mango",3.0);
        fruitPrices.put("grapes",3.0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fruit name: ");
        String answer = scanner.nextLine();

        if(fruitPrices.containsKey(answer)){
            System.out.println(answer + "=" + fruitPrices.get(answer));
        }
        else{
            System.out.println("Failed");
        }

    }

}
