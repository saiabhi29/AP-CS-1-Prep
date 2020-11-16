
/*Purpose : a program takes a string as a input and returns the number of times "hi" occurs in the string using recursion
@saiabhi29 Abhinav Penagalapati
Created on : 11/15/2020 */
import java.util.*;

public class HiCount {

    public static int countHi(String s) {
        int count = 0;
        if (s.substring(0, 2).equals("hi")) {
            count = 1;
        }
        if (s.length() == 2) {
            return count;
        }
        count = count + countHi(s.substring(1));
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(countHi(str));

    }
}