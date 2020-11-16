
/*Purpose : Given a non-negative input, the program recursively counts and returns the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so that 8818 yields 4. 
@saiabhi29 Abhinav Penagalapati
Created on : 11/15/2020 */
import java.util.*;

class Count8 {
    public static int count8(int n) {
        int count = 0;
        if (n == 0) {
            return count;
        }
        if (n % 10 == 8) {
            count = 1;
            if ((n / 10) % 10 == 8) {
                count = 2;
            }
        }
        count = count + count8(n / 10);
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(count8(num));

    }
}