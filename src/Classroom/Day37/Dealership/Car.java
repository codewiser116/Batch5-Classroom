package Classroom.Day37.Dealership;

public class Car extends Vehicle{
    int numOfDoors;
    boolean hasSunRoof;

    public Car(int year, int mileage, String registrationNumber, int price, boolean isNew, String modelName, int numOfDoors, boolean hasSunRoof) {
        super(year, mileage, registrationNumber, price, isNew, modelName);
        this.numOfDoors = numOfDoors;
        this.hasSunRoof = hasSunRoof;
    }

}
