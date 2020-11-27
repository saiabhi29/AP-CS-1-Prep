
/*Purpose : a program takes a perfect square as a input and returns the square root of the number
The program uses binary search to find the position
@saiabhi29 Abhinav Penagalapati
Created on : 11/26/2020 */
import java.util.*;

public class Sqaure_root {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a perfect square: ");
        int number = scan.nextInt();
        int end = number;
        int mid;
        int start = 0;
        double ans = 0.0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == number) {
                ans = mid;
                System.out.println("The square root of " + number + " is " + ans);
                break;
            } else if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }

        }
    }
}
