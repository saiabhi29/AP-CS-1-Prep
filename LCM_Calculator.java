
/*Purpose : a program takes a two integers as a input and returns the least common multiple of the two
@saiabhi29 Abhinav Penagalapati
Created on : 10/27/2020 */
import java.util.*;

public class LCM_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int[] c = new int[1000];
        int[] d = new int[1000];
        int[] e = new int[1000];
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                c[i] = i;
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                d[i] = i;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 0) {
                int x = 0;
            } else if (d[i] == 0) {
                int y = 0;
            } else if (c[i] == d[i]) {
                e[i] = d[i];
            }
        }
        int gcf = 1;
        int greatest_index = 0;
        for (int i = 1; i < e.length; i++) {
            if (e[greatest_index] < e[i]) {
                greatest_index = i;
                gcf = e[i];
            }
        }
        int lcm = a * b;
        lcm = lcm / gcf;
        System.out.println(lcm);
    }
}
