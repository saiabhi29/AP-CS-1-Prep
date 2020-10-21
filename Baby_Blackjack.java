/*Purpose : a program that allows a human user to play a single hand of "blackjack" against a dealer.
@saiabhi29 Abhinav Penagalapati
Created on : 10/20/2020
*/
import java.util.*;
public class Baby_Blackjack {
    public static void main(String []args){
        Random x = new Random();
        System.out.println("Baby Blackjack!");
        int a = x.nextInt(11);
        int b = x.nextInt(11);
        System.out.println("You drew "+a+" and "+b+".");
        System.out.println("Your total is "+(a+b));
        int c = x.nextInt(11);
        int d = x.nextInt(11);
        System.out.println("The dealer drew "+c+" and "+d+".");
        System.out.println("Dealer's total is "+(c+d));
        if (a+b<c+d){
            System.out.println("You Lost! Try again.");
        }
        else {
            System.out.println("You Won!");
        }
    }
}
