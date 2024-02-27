package Classroom.Day38.abstracts;

public abstract class Email {
    String emailAccount;

    // 1. This constructor is used to initialize objects only
    public Email(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public abstract void sendEmail(String to, String text);




    // instance variables
    // instance methods
    // static methods
    // constructors

    // abstract methods - OPTIONAL


}
