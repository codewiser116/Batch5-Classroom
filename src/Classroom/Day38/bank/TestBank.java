package Classroom.Day38.bank;

public class TestBank {
    public static void main(String[] args) {
        Bank b;
        b = new SPI();
        System.out.println(b.getRateOfInterest());

        b = new PNB();
        System.out.println(b.getRateOfInterest());
    }
}
