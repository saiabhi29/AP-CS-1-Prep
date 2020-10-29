
/*Purpose : a program that takes a string as an input and return the middle character or characters
@saiabhi29 Abhinav Penagalapati
Created on : 10/28/2020 */
import java.util.*;

public class Middle_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = input.nextLine();
        if (a.length() % 2 == 1) {
            int b = a.length() + 1;
            b = b / 2;
            System.out.println(a.charAt(b - 1));
        } else if (a.length() % 2 == 0) {
            int c = a.length();
            c = (c - 2) / 2;
            System.out.print(a.charAt(c));
            System.out.print(a.charAt(c + 1));
        }
    }
}
