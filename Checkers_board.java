
/*Purpose : a program takes a integer as a input and returns a checkerboard with the dimensions input*input
@saiabhi29 Abhinav Penagalapati
Created on : 11/3/2020 */
import java.util.*;

public class Checkers_board {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= a; c++) {
                if ((b % 2) == 0) {
                    System.out.print("# ");
                } else {
                    System.out.print(" #");
                }
            }
            System.out.println("");
        }
    }
}
