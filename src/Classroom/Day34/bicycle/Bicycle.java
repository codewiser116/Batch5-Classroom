package Classroom.Day34.bicycle;

public class Bicycle {
    int cadence;
    int gear;
    int speed;

    // Generate code
    // Windows - ALT + INSERT
    // MAC - CMD + N

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void setCadence(int newValue){
        this.cadence = newValue;
    }

    public void setGear(int newGear){
        this.gear = newGear;
    }

    public void applyBrake(int decrement){
        speed-=decrement;
    }

    public void speedUp(int increment){
        speed+=increment;
    }
}
