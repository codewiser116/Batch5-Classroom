package Classroom.Day43.userExceptions;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(String message){
        super(message);
    }
}
