
/*Purpose : a program takes a string as an input and tells if the string is a palindrome or not
@saiabhi29 Abhinav Penagalapati
Created on : 10/29/2020 */
import java.util.*;

public class Palindrome_string {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = test.nextLine();
        if (input.length() % 2 == 1) {
            char[] try2 = input.toCharArray();
            int aa = (input.length() + 1) / 2;
            int bb = (input.length() - 1) / 2;
            char[] dd = new char[100];
            int yy = 0;
            for (int i = aa - 1; i >= 0; i--) {
                dd[yy] = try2[i];
                yy++;
            }
            int xx = 0;
            char[] cc = new char[100];
            for (int i = bb; i < input.length(); i++) {
                cc[xx] = try2[i];
                xx++;
            }
            String ff = String.copyValueOf(cc);
            String gg = String.copyValueOf(dd);
            if (ff.equalsIgnoreCase(gg)) {
                System.out.println("PALINDROME!");
            } else {
                System.out.println("NOT A PALINDROME!");
            }
        } else {
            char[] try1 = input.toCharArray();
            int a = (input.length() / 2);
            int b = (input.length() / 2);
            char[] d = new char[100];
            int y = 0;
            for (int i = a - 1; i >= 0; i--) {
                d[y] = try1[i];
                y++;
            }
            int x = 0;
            char[] c = new char[100];
            for (int i = b; i < input.length(); i++) {
                c[x] = try1[i];
                x++;
            }
            String f = String.copyValueOf(c);
            String g = String.copyValueOf(d);
            if (f.equalsIgnoreCase(g)) {
                System.out.println("PALINDROME!");
            } else {
                System.out.println("NOT A PALINDROME!");
            }
        }
    }
}
