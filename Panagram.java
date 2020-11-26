
/*Purpose : Given a string input, the program checks if it is a pangram or not. A pangram is a sentence/word that has all 26 letters in it
 Ex : the lazy dog jumped over a quick brown fox
@saiabhi29 Abhinav Penagalapati
Created on : 11/23/2020 */
import java.util.*;

public class Panagram {
    public static String checkPanagram(String input) {
        if (input.length() <= 26) {
            return "Not pangram";
        }
        int[] b = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String input2 = input.toUpperCase().replace(" ", "");
        char[] a = input2.toCharArray();
        int c = 0;
        int size = a.length;
        while (c != size) {
            int index = (int) a[c] - 65;
            b[index] = 1;
            c++;
        }
        int i = 0;
        while (i != 26) {
            if (b[i] == 1) {
                i++;
            } else {
                return "Not a panagram";
            }
        }
        return "pangram";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String x = scan.nextLine();
        System.out.println(checkPanagram(x));
    }
}
