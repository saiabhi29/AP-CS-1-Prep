
/*Purpose : a program takes a file name as an input (3 choices) and returns the sum
of the three numbers that are in each file
@saiabhi29 Abhinav Penagalapati
Created on : 10/21/2020 */
import java.util.*;
import java.io.*;

public class Summing_3nums_fromfile {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Which file would you like to open? ");
        String a = input.nextLine();
        if (a.equals("3nums1")) {
            Scanner file1 = new Scanner(new File("3nums1.txt"));
            int b = file1.nextInt();
            int c = file1.nextInt();
            int d = file1.nextInt();
            System.out.println(b + " + " + c + " + " + d + " = " + (b + c + d));
        }
        if (a.equals("3nums2")) {
            Scanner file1 = new Scanner(new File("3nums2.txt"));
            int b = file1.nextInt();
            int c = file1.nextInt();
            int d = file1.nextInt();
            System.out.println(b + " + " + c + " + " + d + " = " + (b + c + d));
        }
        if (a.equals("3nums3")) {
            Scanner file1 = new Scanner(new File("3nums3.txt"));
            int b = file1.nextInt();
            int c = file1.nextInt();
            int d = file1.nextInt();
            System.out.println(b + " + " + c + " + " + d + " = " + (b + c + d));
        }
    }
}
