package Classroom.Day35;

public class Test {

    public static void main(String[] args) {
    }

}
class One {
    public One(String name) {
        System.out.print("One,");
    }
}

class Two extends One{
    public Two(String name){
        super(name);
        System.out.print("Three");
    }
}
