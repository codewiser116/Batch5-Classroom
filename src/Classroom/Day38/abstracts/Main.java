package Classroom.Day38.abstracts;

public class Main {
    public static void main(String[] args) {
        Gmail gmailAccount = new Gmail("zhanarbek.a7@gmail.com", 15);
        gmailAccount.sendEmail("nurzada@gmail.com","Hope you are doing well, submit all your assignments!");
    }
}
