
/*Purpose : a program takes a letter as a input and return the type of letter it is
@saiabhi29 Abhinav Penagalapati
Created on : 10/25/2020 */
import java.util.*;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String a = input.nextLine();
        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
            System.out.println("Your letter is a vowel.");
        } else {
            System.out.println("Your letter is a consonant.");
        }

    }
}
