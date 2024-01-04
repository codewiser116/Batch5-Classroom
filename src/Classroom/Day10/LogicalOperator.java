package Classroom.Day10;

public class LogicalOperator {
    public static void main(String[] args) {
        int weekday = 5;
        int t = 1;
        if(weekday == 5 && t == 1){
            System.out.println("You are eligibile for 30% discount");
        }
        else if(weekday == 7 && t == 2){
            System.out.println("You are eligible for 50% discount");
        }
        else if(weekday == 5 || weekday == 6 || weekday == 7){
            System.out.println("You are eligible for 10% discount");
        }
        else{
            System.out.println("You pay full amount");
        }
    }
}
