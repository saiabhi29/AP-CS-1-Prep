
/*Purpose : Given 2 strings input, the program checks if they are equal or not
@saiabhi29 Abhinav Penagalapati
Created on : 11/24/2020 */
import java.util.*;

public class Anagram {
    public static String isAnagramSort(String a, String b) {
        if (a.length() != b.length()) {
            return "not a anagram";
        }
        char[] A = a.toCharArray();
        char[] B = b.toCharArray();

        Arrays.sort(A);
        Arrays.sort(B);
        boolean x = Arrays.equals(A, B);
        if (x) {
            return "is a anagram";
        }
        return "is not a anagram";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String a = input.nextLine();
        String b = input.nextLine();
        System.out.println(isAnagramSort(a, b));

    }
}
