
/*Purpose : a program takes a string as a input and returns the number of vowels, consonants, and words in it
@saiabhi29 Abhinav Penagalapati
Created on : 10/25/2020 */
import java.util.*;

public class Check_vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        int words = 1;
        for (int i = 0; i < a.length(); i++) {
            char myChar = a.charAt(i);
            String b = Character.toString(myChar);
            if (b.equals("a") || b.equals("e") || b.equals("i") || b.equals("o") || b.equals("u")) {
                vowels++;
            } else if (b.equals(" ")) {
                words++;
            } else {
                consonants++;
            }
        }
        System.out.println("Your string has " + vowels + " vowels in it.");
        System.out.println("Your string has " + consonants + " consonants in it.");
        System.out.println("Your string has " + words + " words in it.");
    }
}
