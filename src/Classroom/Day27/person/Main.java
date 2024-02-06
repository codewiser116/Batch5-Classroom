package Classroom.Day27.person;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person[] people = new Person[3];
        int j = 0;
        menuOptions();
        while (true){
            System.out.println("Choose option: ");
            int option = scanner.nextInt();
            if(option == 1){
                scanner.nextLine();
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Passport[] passports = new Passport[3];
                Car[] cars = new Car[3];
                System.out.println("Single citizenship (1), multiple (2)? ");
                int citizenshipOption = scanner.nextInt();
                if(citizenshipOption == 1){
                    scanner.nextLine();
                    System.out.println("Enter your full name");
                    String fullName = scanner.nextLine();
                    System.out.println("Enter your citizenship country");
                    String citizenshipCountry = scanner.nextLine();
                    Passport passport = new Passport(fullName, citizenshipCountry);
                    passports[0] = passport;
                }
                else{
                    System.out.println("Choose the number of citizenship you wanna have 2-3?");
                    int numberOfCitizenship = scanner.nextInt();
                    for(int i = 0; i< numberOfCitizenship; i++){
                        scanner.nextLine();
                        System.out.println("Enter your full name");
                        String fullName = scanner.nextLine();
                        System.out.println("Enter your citizenship country");
                        String citizenshipCountry = scanner.nextLine();
                        Passport passport = new Passport(fullName, citizenshipCountry);
                        passports[i] = passport;
                    }
                }

                System.out.println("Single car(1) or multiple cars(2)");
                int carOption = scanner.nextInt();
                if(carOption == 1){
                    scanner.nextLine();
                    System.out.println("Enter brand: ");
                    String brand = scanner.nextLine();
                    Car car = new Car(brand);
                    cars[0] = car;
                }
                else{
                    System.out.println("Choose the number of cars you wanna have 2-3?");
                    int numberOfCars = scanner.nextInt();
                    for(int i = 0; i < numberOfCars; i++){
                        System.out.println("Enter brand: ");
                        String brand = scanner.nextLine();
                        Car car = new Car(brand);
                        cars[i] = car;
                    }
                }

                Person person = new Person(name, passports, cars);
                people[j] = person;
                j++;
            }
            else if(option == 2){
                System.out.println(people[0].name);
                System.out.println(Arrays.toString(people[0].passports));
                System.out.println(Arrays.toString(people[0].cars));
            }
            else if(option == 3){
                System.out.println("Thanks for using the APP!");
                break;
            }
            else{
                System.out.println("Wrong option");
            }
        }
    }


    public static void menuOptions(){
        System.out.println("Option 1. Add person");
        System.out.println("Option 2. Display people");
        System.out.println("Option 3. Exit");
    }
}
