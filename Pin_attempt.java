/*Purpose : a program to check the pin of a bank account
@saiabhi29 Abhinav Penagalapati
Created on : 10/15/2020
*/
import java.util.*;
public class Pin_attempt {
    public static void main(String[] args) {
		Scanner pin = new Scanner(System.in);
		int b = 127229;

		System.out.println("Welcome to the bank of Abhinav.");
		System.out.print("Enter your pin: ");
		int a = pin.nextInt();

		while ( a != b )
		{
			System.out.println("Incorrect. Please try again.");
			System.out.print("ENTER YOUR PIN: ");
			a = pin.nextInt();
		}

		System.out.println("Pin is accepted. You now have access to your account.");
    }
}
