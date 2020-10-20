/*Purpose : a program that rolls 2 dice
@saiabhi29 Abhinav Penagalapati
Created on : 10/15/2020
*/
import java.util.*;
class Dice_Doubles {
    public static void main(String[] args) {
        Random rndm = new Random( );
        System.out.println("Here comes the dice!");
        int b = 1;
        int c = 2;
		while ( c != b )
		{
            c = rndm.nextInt(7);
            b = rndm.nextInt(7);
            System.out.println("Roll #1: "+b);
            System.out.println("Roll #2: "+c);
            System.out.println("The total is "+(b+c));
		}

    }
}
