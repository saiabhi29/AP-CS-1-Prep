
/*Purpose : a program takes a string as a input and returns the number of words in it
@saiabhi29 Abhinav Penagalapati
Created on : 10/25/2020 */
import java.util.*;

public class Check_words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a list of words: ");
        String a = input.nextLine();
        int words = 1;
        int d = 0;
        for (int i = 0; i < a.length(); i++) {
            char myChar = a.charAt(i);
            String x = Character.toString(myChar);
            if (x.equals(" ")) {
                words++;
            } else {
                d++;
            }
        }
        System.out.println("The number of words are " + words);
    }
}
