/*Purpose : a program to calculate the area of four different geometric shapes: 
            triangles, squares, rectangles, and circles
@saiabhi29 Abhinav Penagalapati
Created on : 10/15/2020
*/
import java.util.*;
public class Area_Calculator {
    public static double area_circle( double radius ){
        double area = Math.pow(radius, 2);
        area += area*3.14;
        return area;
    }
    public static int area_rectangle( int length, int width){
        int area = length*width;
        return area;
    }
    public static int area_square( int side ) {
        int area = side*side;
        return area;
    }
    public static double area_triangle( double base, double height ){
        double area = 0.5*base*height;
        return area;
    }
        public static void main(String []args){
        Scanner calculator = new Scanner(System.in);
        int shape = 1;
        while (shape!=5){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n"+"\n1) Triangle"+ "\n2) Rectangle"+"\n3) Square"+"\n4) Circle"+"\n5) Quit");
        System.out.println("Which Shape: ");
        shape = calculator.nextInt();
        if (shape == 1){
            System.out.println("Base: ");
            double base = calculator.nextDouble( );
            System.out.println("Height: ");
            double height = calculator.nextDouble( );
            double result = area_triangle(base, height);
            System.out.println("\n"+"The area is "+result);
        }
        else if (shape == 2){
            System.out.println("Length: ");
            int length = calculator.nextInt( );
            System.out.println("Width : ");
            int width = calculator.nextInt( );
            int result = area_rectangle(length, width);
            System.out.println("\n"+"The area is "+result);
        }
        else if (shape == 3){
            System.out.println("Side Length: ");
            int side_length = calculator.nextInt( );
            int result = area_square(side_length);
            System.out.println("\n"+"The area is "+result);
        }
        else if (shape == 4){
            System.out.println("Radius: ");
            double radius = calculator.nextInt( );
            double result = area_circle(radius);
            System.out.println("\n"+"The area is "+result);
        }
    }

    }
}
