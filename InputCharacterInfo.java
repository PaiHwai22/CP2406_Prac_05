/*This program is a modified CharacterInfo class */
import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args) {
        char aChar;
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character... ");
        input = sc.nextLine();
        aChar = input.charAt(0);
        System.out.println("The character is " + aChar);
        if (Character.isUpperCase(aChar)) {
            System.out.println(aChar + " is uppercase");
        } else {
            System.out.println(aChar + " is not uppercase");
        }
        if (Character.isLowerCase(aChar)) {
            System.out.println(aChar + " is lowercase");
        } else {
            System.out.println(aChar + " is not lowercase");
            aChar = Character.toLowerCase(aChar);
            System.out.println("After toLowerCase(), aChar is " + aChar);
            aChar = Character.toUpperCase(aChar);
            System.out.println("After toUpperCase(), aChar is " + aChar);
        }
        if (Character.isLetterOrDigit(aChar)) {
            System.out.println(aChar + " is a letter or digit");
        } else {
            System.out.println(aChar +
                    " is neither a letter nor a digit");
        }
        if (Character.isWhitespace(aChar)) {
            System.out.println(aChar + " is whitespace");
        } else {
            System.out.println(aChar + " is not whitespace");
        }
    }
}




