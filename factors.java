
/*Purpose : a program takes a integer as a input and returns the factors of the integer
@saiabhi29 Abhinav Penagalapati
Created on : 10/25/2020 */
import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int[] c = new int[100];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c[i] = i;
                System.out.println(c[i]);
            }
        }
    }
}
