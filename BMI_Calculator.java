/*Purpose : a program to calculate your BMI
@saiabhi29 Abhinav Penagalapati
Created on : 10/20/2020
*/
import java.util.*;
class BMI_Calculator {
    public static void main(String []args){

    Scanner bmi = new Scanner(System.in);
    System.out.print("Your height (feet only) : ");
    double a = bmi.nextInt();
    System.out.print("Your height (inches) : ");
    double b = bmi.nextInt();
    System.out.print("Your weight in pounds : ");
    double c = bmi.nextInt();
    double height = a/3.281;
    height += b/39.37;
    c = c/2.205;
    double d = c/(height*height);
    System.out.println(d);
    }
}
