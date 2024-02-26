package Classroom.Day37.AccessModifiers;

public class Public {
    public static void main(String[] args) {
        Private.publicMethod();
        Private privateObject = new Private();

        Protected protectedObj = new Protected();
        System.out.println(protectedObj.name);
    }

    public void publicMethod(){

    }
}
