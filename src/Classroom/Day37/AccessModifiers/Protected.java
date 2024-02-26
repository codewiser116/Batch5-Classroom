package Classroom.Day37.AccessModifiers;

public class Protected {
    protected String name;
    private int age;
    final int SUM = 10;

    public static void main(String[] args) {
        Protected protectedObj = new Protected();
        System.out.println(protectedObj.SUM);
    }

    final public void method(){
        System.out.println("Superclass method");
    }

}
