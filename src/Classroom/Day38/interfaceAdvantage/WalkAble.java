package Classroom.Day38.interfaceAdvantage;

public interface WalkAble {
    default void walk(){
        System.out.println("Walking");
    }

}
