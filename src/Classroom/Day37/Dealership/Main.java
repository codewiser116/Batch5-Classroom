package Classroom.Day37.Dealership;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership();
        Car car1 = new Car(2008, 160000, "R1",
                6000, false, "Honda Civic", 2, true);

        Car car2 = new Car(2024, 8, "R2",45000, true,
                "Toyota Camry", 4,true);

        Motorcycle motorcycle1 = new Motorcycle(2015, 50000, "M1",
                7000, false, "BMW", true);


        dealership.addVehicle(car1);
        dealership.addVehicle(car2);
        dealership.addVehicle(motorcycle1);

//        dealership.displayVehicles();
//        dealership.findByBudget(60000);
        dealership.findByRNumber("M1");
    }
}
