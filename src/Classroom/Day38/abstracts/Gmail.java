package Classroom.Day38.abstracts;

public class Gmail extends Email {

    double gb;

    // 1. This constructor is used to initialize objects only
    // 2. This constructor is used to create objects
    public Gmail(String emailAccount, double gb) {
        super(emailAccount);
        this.gb = gb;
    }

    @Override
    public void sendEmail(String to, String text) {
        System.out.println("Email sent from " + emailAccount + " to " + to);
        System.out.println("Text is: " + text);
    }
}
