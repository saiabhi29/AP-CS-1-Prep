/*Purpose : a program that inputs and checks the pin and compares it to a preset pincode
@saiabhi29 Abhinav Penagalapati
Created on : 10/15/2020
*/
import java.util.*;
class Pin_Lockout {
    public static void main(String[] args) {
		Scanner pin = new Scanner(System.in);
		int b = 127229;
        int lock = 0;
		System.out.println("Welcome to the bank of Abhinav.");
		System.out.print("Enter your pin: ");
		int a = pin.nextInt();

		while ( a != b )
		{   
			System.out.println("Incorrect. Please try again.");
			System.out.print("ENTER YOUR PIN: ");
            a = pin.nextInt();
            lock ++;
            if (lock==3){
                break;
            }
		}

		System.out.println("Pin is accepted. You now have access to your account.");
    }
}
