
/*Purpose : a program takes a integer as a input and returns if it is an armstrong number or not 
An armstrong number is a number that the sum of the cubes of the digits must equal the number
For example: 153 is an armstrong number because 1^3 + 5^3+ 3^3 = 153 as 1 + 125 + 27 = 153
@saiabhi29 Abhinav Penagalapati
Created on : 10/28/2020 */
import java.util.*;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = input.nextInt();
        String number = Integer.toString(a);
        double[] b = new double[1000];
        for (int i = 0; i < number.length(); i++) {
            String number2 = Character.toString(number.charAt(i));
            double newnumber = Double.parseDouble(number2);
            b[i] = newnumber;
        }
        double[] c = new double[1000];
        for (int i = 0; i < b.length; i++) {
            double x = b[i];
            x = Math.pow(x, 3);
            c[i] = x;
        }
        double end = 0;
        for (int i = 0; i < c.length; i++) {
            end += c[i];
        }
        if (end == a) {
            System.out.println("Your number is a Armstrong number!");
        } else {
            System.out.println("Your number is not a Armstrong number!");
        }
    }
}
