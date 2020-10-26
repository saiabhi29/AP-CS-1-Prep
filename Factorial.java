
/*Purpose : a program takes a integer as an input and return the factorial value of that number
@saiabhi29 Abhinav Penagalapati
Created on : 10/25/2020 */
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            b = b * i;
        }
        System.out.println(b);
    }
}
