
/*Purpose : a program takes a integer as a input and returns the multiple triangle patterns
@saiabhi29 Abhinav Penagalapati
Created on : 11/3/2020 */
import java.util.*;

public class Irregular_Triangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        // pattern a
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("");
        // pattern d
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col >= a + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        // pattern b
        System.out.println("");
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col <= a + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        // pattern c
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // pattern triangle
        System.out.println("");
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= a; col++) {
                if (row + col >= a + 1) {
                    System.out.print(" #");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // pattern inverse triangle
        System.out.println("");
        for (int row = a - 1; row >= 0; row--) {
            for (int col = a - 1; col >= 0; col--) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
