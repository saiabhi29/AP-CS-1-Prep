
/*Purpose : a program takes a array of numbers as a input and aks for a number that it needs to find it in the array
The program uses binary search to find the position
@saiabhi29 Abhinav Penagalapati
Created on : 11/26/2020 */
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int length = scan.nextInt();
        int[] a = new int[length];
        System.out.println("Enter an array of numbers: ");
        for (int i = 0; i < length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("What number would you like to find? ");
        int target = scan.nextInt();
        int left = 0;
        int right = length - 1;
        int pos = 0;
        while (left < right) {
            int middle = (left + right) / 2;
            if (a[middle] == target) {
                pos = middle;
                break;
            } else if (a[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (pos == 0) {
            System.out.print("Not found");
        } else {
            System.out.println("Your number is at position " + (pos + 1));
        }
    }
}
