/*Purpose : a program that takes an integer as an input and counts to that number
Created on : 10/15/2020
*/
import java.util.*;
class Counting {
    public static void main(String []args){
        Scanner count = new Scanner(System.in);
        System.out.print("Count to : ");
        int a = count.nextInt();
        for (int i =0;i<=a;i++){
            System.out.print(i + " ");
        }
    }
}
