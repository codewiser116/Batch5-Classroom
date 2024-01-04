package Classroom.Day10;

import java.util.Scanner;

public class WeatherConditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = scanner.nextInt();
        if(degree>80){
            System.out.println("It is hot outside. You must wear t-shirt and shorts");
        }
        if(degree>60) {
            System.out.println("It is warm outside. Consider wearing jeans and t-shirt");
        }


    }
}
