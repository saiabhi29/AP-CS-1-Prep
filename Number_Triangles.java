
/*Purpose : a program takes a integer as a input and returns the integer triangle patterns
@saiabhi29 Abhinav Penagalapati
Created on : 11/3/2020 */
import java.util.*;

public class Number_Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        // pattern a
        int b = 1;
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row >= col) {
                    System.out.print(b + " ");
                    b++;
                }
            }
            System.out.println();
            b = 1;
        }
        System.out.println("");
        // pattern d
        b = 1;
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col >= a + 1) {
                    System.out.print(b + " ");
                    b++;
                } else {
                    System.out.print("  ");
                }
            }
            b = 1;
            System.out.println("");
        }
        // pattern b
        b = a;
        int c = 0;
        System.out.println("");
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col <= a + 1) {
                    System.out.print(b + " ");
                    b--;
                }
            }
            System.out.println();
            b = a;
            c++;
            b = b - c;
        }
        // pattern c
        b = 1;
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row <= col) {
                    System.out.print(b + " ");
                    b++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            b = 1;
        }
        // pattern triangle
        System.out.println("");
        b = 1;
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col >= a + 1) {
                    System.out.print(b + " ");
                    b++;
                } else {
                    System.out.print(" ");
                }
            }
            b = 1;
            System.out.println();
        }
        // pattern inverse triangle
        b = a;
        c = 0;
        System.out.println("");
        for (int row = a - 1; row >= 0; row--) {
            for (int col = a - 1; col >= 0; col--) {
                if (row >= col) {
                    System.out.print(b + " ");
                    b--;

                } else {
                    System.out.print(" ");
                }
            }
            b = a;
            c++;
            b = b - c;
            System.out.println();
        }
    }
}
