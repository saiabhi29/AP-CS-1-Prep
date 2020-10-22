/*Purpose : a program that takes an array and reverses it, which puts the reverse in a different array
Created on : 10/21/2020
*/
public class Reverse_Array {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = new int[10];
        int c = 0;
        for (int i = a.length - 1; i > -1; i--) {
            b[c] = a[i];
            c++;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
