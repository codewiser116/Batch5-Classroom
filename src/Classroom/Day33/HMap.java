package Classroom.Day33;

import Classroom.Day27.person.Car;
import Classroom.Day27.person.Person;

import java.util.*;

public class HMap {
    public static void main(String[] args) {
//        ArrayList<Car> cars1 = new ArrayList<>();
//        // car1:name,year, color;  car2:name, year, color; car3
//        ArrayList<String> cars2 = new ArrayList<>();
//        // "car1", "car2", "car3"
//
//        HashSet<String> names = new HashSet<>();
//
//
//        HashMap<String, String> map2 = new HashMap<>();
//        HashMap<Integer, Integer> map3 = new HashMap<>();
//        HashMap<String, Car> map4 = new HashMap<>();
//
//        HashMap<String, Integer> users = new HashMap<>();
//        users.put("Jack",22);
//        users.put("Rose",20);
//        users.put("Melanie",35);
//        System.out.println(users);
//
//        HashMap<String, String> capitals= new HashMap<>();
//        capitals.put("England","London");
//        capitals.put("Italy","Milan");
//        capitals.put("Canada","Ottawa");
//        capitals.put("Canada","London");
//        capitals.put("Canada","New York");
//        System.out.println(capitals);

//        HashMap<String, String> phoneBook = new HashMap<>(Map.of(
//                "John","555-1234",
//                "Sara","555-4321",
//                "Bob","555-1298"
//        ));
//        phoneBook.put("John","1");
//        System.out.println(phoneBook.get("John"));
//        System.out.println(phoneBook.get("Sara"));
//        System.out.println(phoneBook.containsKey("Sara"));
//        System.out.println(phoneBook.containsValue("12"));
//        System.out.println(phoneBook.size());

//        for(Map.Entry<String, String> entry: phoneBook.entrySet()){
//                System.out.println("Name: " + entry.getKey());
//                System.out.println("Number: " + entry.getValue());
//        }

        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "Sara");
        employees.put(2, "John");
        employees.put(3, "Bob");
        employees.put(4, "Bob");

        // Set can be called a HashSet
        Set<Integer> employeeIds = employees.keySet();
        System.out.println(employeeIds);

        // Collection can be called an ArrayList
        Collection<String> names = employees.values();
    }
}
