/*Purpose : a program that shows all the indexs and the characters that go along with them
@saiabhi29 Abhinav Penagalapati
Created on : 10/20/2020
*/
import java.util.*;
public class Letter_at_a_time {
    public static void main(String []args){
        Scanner line = new Scanner(System.in);
        System.out.print("What is your message?");
        String message = line.nextLine( );
        int a = message.length( );
        System.out.println("Your message is "+a+" characters long.");
        System.out.println("The first character is at position 0 and is '"+message.charAt(0)+"'.");
        System.out.println("The first character is at position "+a+" and is '"+message.charAt(a-1)+"'.");
        System.out.println("Here are all the characters, one at a time: ");
        for (int i =0;i<a;i++){
            System.out.println("              "+i+" - '"+message.charAt(i)+"'");
        }
        int b = 0;
        for (int i =0;i<a;i++){
            Character f = message.charAt(i);
            if (f.equals('a')){
                b++;
            }
        }
        System.out.println("Your message contains the letter a "+b+" times. Isn't that cool?");
    }
}
