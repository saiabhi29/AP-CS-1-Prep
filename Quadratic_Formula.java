
/*Purpose : a program that gives the solutions for a quadratic equation
the program takes the input for a,b,c in the equation ax^2+bx+c
Created on : 10/25/2020 */
import java.util.*;
import java.io.*;

public class Quadratic_Formula {
    public static double root1(double a, double b, double c) {
        double result = 0;
        double d = b * b;
        d -= 4 * a * c;
        result = -b - Math.sqrt(d);
        result /= 2;
        return result;
    }

    public static double root2(double a, double b, double c) {
        double result2 = 0;
        double e = b * b;
        e -= 4 * a * c;
        result2 = -b + Math.sqrt(e);
        result2 /= 2;
        return result2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ax^2+bx+c = 0");
        System.out.print("Please enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Please enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Please enter the value of c: ");
        double c = input.nextDouble();
        double result = root1(a, b, c);
        double result2 = root2(a, b, c);
        System.out.println(result);
        System.out.println(result2);
    }
}
