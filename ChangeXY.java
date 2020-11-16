
/*Purpose : a program takes a string as a input and returns a string that replaces x with y using recursion
@saiabhi29 Abhinav Penagalapati
Created on : 11/16/2020 */
import java.util.*;

public class ChangeXY {
    public static String changeXY(String s) {
        String a = "";
        if (s.charAt(0) == 'x') {
            a += "y";
        } else {
            a += s.charAt(0);
        }
        if (s.length() == 1) {
            return a;
        }
        a = a + changeXY(s.substring(1));
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(changeXY(str));

    }
}