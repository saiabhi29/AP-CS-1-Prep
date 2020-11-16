
/*Purpose : Given a non-negative input, the program recursively calculates and returns the area of a triangle
Ex: []
    [][]
    [][][]
    The area of the above triangle of width 3 is 6, assuming that each [] square has area 1.
@saiabhi29 Abhinav Penagalapati
Created on : 11/15/2020 */
import java.util.*;

class Triangle {
    public static int area(int input) {
        if (input == 0) {
            return 0;
        }
        int result = input;
        if (result == 1) {
            return result;
        }
        result = result + area(input - 1);
        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        System.out.println(area(k));
    }
}