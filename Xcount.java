
/*Purpose : a program takes a string as a input and returns the number of X's in that string using recursion
@saiabhi29 Abhinav Penagalapati
Created on : 11/15/2020 */
import java.util.*;

public class Xcount {
    public static int countX(String s) {
        int count = 0;
        if (s.charAt(0) == 'x') {
            count = 1;
        }
        if (s.length() == 1) {
            return count;
        }
        count = count + countX(s.substring(1));
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(countX(s));

    }
}
