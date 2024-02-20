package Classroom.Day34.bicycle;

public class MountainBike extends Bicycle{
    int seatHeight;

    public MountainBike(int cadence, int gear, int speed, int seatHeight){
        super(cadence, gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue){
        this.seatHeight = newValue;
    }

    public void display(){
        System.out.println(cadence);
        System.out.println(gear);
        System.out.println(speed);
        System.out.println(seatHeight);
    }
}
