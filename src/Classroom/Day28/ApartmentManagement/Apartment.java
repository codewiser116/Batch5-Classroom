package Classroom.Day28.ApartmentManagement;

import java.util.Arrays;

public class Apartment {
    int rooms;
    int apartmentNumber;
    int size;
    Person[] residents;

    public Apartment(int rooms, int apartmentNumber, int size){
        this.rooms = rooms;
        this.apartmentNumber = apartmentNumber;
        this.size = size;
        this.residents = new Person[rooms*2];
    }

    public void apartmentInfo(){
        System.out.println("Rooms: "+ rooms);
        System.out.println("Apt Number: " + apartmentNumber);
        System.out.println("Size: " + size);
        System.out.println("-------------------");
        for(int i = 0; i < residents.length; i++){
            System.out.println(residents[i].name);
            System.out.println(residents[i].age);
            System.out.println(residents[i].gender);
            System.out.println("-------------------");
        }
    }

}
