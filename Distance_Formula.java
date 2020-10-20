/*Purpose :a function to compute the distance between two points.
Given two points (x1, y1) and (x2, y2), the distance between these points is given by the formula
@saiabhi29 Abhinav Penagalapati
Created on : 10/14/2020
*/
import java.util.*;
public class Distance_Formula
{
    public static double distance( double x1, double y1, double x2, double y2 )
    {
            double a = x2-x1;
            double b = y2-y1;
            double d = Math.pow(a,2);
            d += Math.pow(b,2);
            d = Math.sqrt(d);
            return d;
    }
	public static void main( String[] args )
    {
        Scanner f = new Scanner(System.in);
        System.out.print("Put in 2 coordinates ");
        double x1 = f.nextDouble();
        double y1 = f.nextDouble();
        double x2 = f.nextDouble();
        double y2 = f.nextDouble();
        double dist = distance(x1, y1, x2, y2);
        System.out.println(dist);
    }
}