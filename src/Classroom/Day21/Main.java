package Classroom.Day21;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Enter first digit:");
        int first = in.nextInt();
        System.out.println("Enter second digit:");
        int second = in.nextInt();
        boolean containsNumbers = false;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num == first && num == second) {
                containsNumbers = true;
                break;
            } else if (num == first || num == second) {
                containsNumbers = true;
                break;
            }
        }
        System.out.println(containsNumbers);
    }
    }
