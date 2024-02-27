package Classroom.Day38.bike;

public class Honda extends Bike{
    int numOfDoors = 4;

    @Override
    public void run() {
        System.out.println("running safely...");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
        
    }
}
