/*Purpose : a program that does a simple,dumb calculation
@saiabhi29 Abhinav Penagalapati
Created on : 10/20/2020
*/
import java.util.*;
class Dumb_Calculator {
    public static void main(String []args) {
        Scanner dumb = new Scanner(System.in);
        System.out.print("What is your first number? ");
        double a = dumb.nextDouble();
        System.out.print("What is your second number? ");
        double b = dumb.nextDouble();
        System.out.print("What is your third number? ");
        double c = dumb.nextDouble();
        double d = (a+b+c)/2;
        System.out.println("( "+a+" + "+b+" + "+c+" ) / 2 is... "+d);
        
    }
}
