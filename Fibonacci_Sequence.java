
/*Purpose : a program takes a integer as a input and returns the input's digits of the fibonacci sequence
@saiabhi29 Abhinav Penagalapati
Created on : 10/29/2020 */
import java.util.*;
public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        int b[] = new int[1000];
        b[0] = 0;
        b[1] = 1;
        for (int i = 2; i < b.length; i++) {
            b[i] = b[i - 1] + b[i - 2];
        }
        for (int i =0;i<a;i++){
            System.out.println(b[i]);
        }
    }
}
