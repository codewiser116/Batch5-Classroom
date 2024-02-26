package Classroom.Day37.Dealership;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicle> vehicles = new ArrayList<>();


    public void addVehicle(Vehicle vehicle){
        if(vehicle.year>2009 && vehicle.mileage<250000){
            vehicles.add(vehicle);
            System.out.println(vehicle.modelName + " was added");
        }
        else{
            System.out.println(vehicle.modelName + " is failed to be added");
        }
    }

    public void displayVehicles(){
        for (Vehicle i: vehicles) {
            System.out.println(i.modelName);
            System.out.println(i.price);
            System.out.println(i.mileage);
            System.out.println(i.year);
            System.out.println("-----------");
        }
    }

    public void findByBudget(int budget){
        for (Vehicle i: vehicles) {
            if(i.price<=budget){
                System.out.println(i.modelName);
                System.out.println(i.price);
                System.out.println(i.mileage);
                System.out.println(i.year);
                System.out.println("-----------");
            }
        }
    }

    public void findByRNumber(String rNumber){
        for (Vehicle i: vehicles) {
            if(i.registrationNumber.equals(rNumber)){
                System.out.println(i.modelName);
                System.out.println(i.price);
                System.out.println(i.mileage);
                System.out.println(i.year);
                System.out.println("-----------");
            }
        }
    }
}
