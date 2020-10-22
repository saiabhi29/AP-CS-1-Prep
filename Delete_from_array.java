
/*Purpose : a program takes an input from 1 through 5 and deletes the input from the aray
@saiabhi29 Abhinav Penagalapati
Created on : 10/21/2020 */
import java.util.*;

public class Delete_from_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != c) {
                b[i] = a[i];
                System.out.println(b[i]);
            }
        }
    }
}
