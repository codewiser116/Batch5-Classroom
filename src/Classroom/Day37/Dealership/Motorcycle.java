package Classroom.Day37.Dealership;

public class Motorcycle extends Vehicle{
    boolean isSportBike;

    public Motorcycle(int year, int mileage, String registrationNumber, int price, boolean isNew, String modelName, boolean isSportBike) {
        super(year, mileage, registrationNumber, price, isNew, modelName);
        this.isSportBike = isSportBike;
    }
}
