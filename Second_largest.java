/*Purpose : a program finds the second largest integer in the array
@saiabhi29 Abhinav Penagalapati
Created on : 10/21/2020 */
public class Second_largest {
    public static void main(String[] args) {
        int[] arr = { 5, 12, -23, 7, 34, 22, 33, 54, 37, 89 };
        int max_index = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                max_index = i;
            }
        }
        int[] arr_new = new int[arr.length];
        for (int i = 0; i < arr_new.length; i++) {
            if (arr[i] != max) {
                arr_new[i] = arr[i];
            }
        }
        max = 0;
        for (int i = 1; i < arr_new.length; i++) {
            if (max < arr_new[i]) {
                max = arr_new[i];
                max_index = i;
            }
        }
        System.out.println(max);
    }
}
