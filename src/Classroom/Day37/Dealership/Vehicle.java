package Classroom.Day37.Dealership;

public class Vehicle {
    int year;
    int mileage;
    String registrationNumber;
    int price;
    boolean isNew;
    String modelName;

    public Vehicle(int year, int mileage, String registrationNumber, int price, boolean isNew, String modelName) {
        this.year = year;
        this.mileage = mileage;
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.isNew = isNew;
        this.modelName = modelName;
    }


    public void calculatePrice(){
        if(isNew){
            System.out.println(price*0.9);
        }
        else{
            System.out.println(price*0.8);
        }

    }
}
