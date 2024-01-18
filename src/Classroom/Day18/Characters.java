package Classroom.Day18;

public class Characters {
    public static void main(String[] args) {
        String str = "computer123!";
        char letter = str.charAt(0); // 'c'
        char digit = str.charAt(9); // '2'
        char sChar = str.charAt(str.length()-1); // '!'
        System.out.println(Character.isDigit(letter));
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isLetterOrDigit(letter));
        System.out.println();
        System.out.println(Character.isDigit(digit));
        System.out.println(Character.isLetter(digit));
        System.out.println(Character.isLetterOrDigit(digit));
        System.out.println();
        System.out.println(Character.isDigit(sChar));
        System.out.println(Character.isLetter(sChar));
        System.out.println(Character.isLetterOrDigit(sChar));
    }
}
