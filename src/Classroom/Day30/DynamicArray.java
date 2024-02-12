package Classroom.Day30;

import Classroom.Day25.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
    public static void main(String[] args) {
        // Part 1.
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Car> cars = new ArrayList<>();
//
//        int[] array = new int[5];
//        Car[] carsArray = new Car[50];
//
//        System.out.println(list.size());
//        System.out.println(cars.size());
//
//        System.out.println(array.length);
//        System.out.println(carsArray.length);

        // Part 2.
//        ArrayList<Integer> list = new ArrayList<>(List.of(1,25,30,42,5));
//        System.out.println(list.size());
//
//        int[] array = {1,2,3,4,5};
//        System.out.println(array.length);

        // Part 3.
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        Car car1 = new Car();
//        Car car2 = new Car();
//        ArrayList<Car> cars = new ArrayList<>();
//        cars.add(car1);
//        cars.add(car2);
//
//        int[] array = new int[5];
//        array[0] = 1;
//        array[1] = 2;
//        Car car3 = new Car();
//        Car car4 = new Car();
//        Car[] cars2 = new Car[5];
//        cars2[0] = car3;
//        cars2[1] = car4;

        // Part 4
//        ArrayList<Integer> integers = new ArrayList<>(10);
//        // Size - means the number of elements inside the array
//        // Initial capacity arraylist is 10
//        System.out.println(integers.size());

        // Part 5
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);

        // Part 6
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.get(cars.size()-1));

        // Part 7
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        cars.remove(2);
//        System.out.println(cars);

        // Part 8
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);

        // Part 9
//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Ford");
//        cars.add("Mazda");
//        System.out.println(cars.contains("Mercedes"));

        // Part 10
//        ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//        Integer[] array = new Integer[list.size()];
//        array = list.toArray(array);
//
//        System.out.println(sumOfArrayList(list));

        // Part 9
    }



    public static int sumOfArrayList(ArrayList<Integer> integers){
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(0);
        }
        return sum;
    }
}
