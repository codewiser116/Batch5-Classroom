package Classroom.Day28.ApartmentManagement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Apartment apartment = new Apartment(3,105, 600);
        Person person1 = new Person("Mike",20, "MALE");
        Person person2 = new Person("Sara",13, "FEMALE");
        Person person3 = new Person("John",42, "MALE");
        Person person4 = new Person("Ann",39, "FEMALE");

        apartment.residents[0] = person1;
        apartment.residents[1] = person2;
        apartment.residents[2] = person3;
        apartment.residents[3] = person4;

        apartment.apartmentInfo();
    }
}
