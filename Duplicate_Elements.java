public class Duplicate_Elements {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] b = { 2, 4, 6, 8, 10 };
        int[] c = new int[10];
        int e = 0;

        for (int i = 0; i < a.length; i++) {
            for (int d = 0; d < b.length; d++) {
                if (a[i] == b[d]) {
                    c[e] = a[i];
                    System.out.println(c[e]);
                    e++;
                    d = 5;
                }
            }
        }
    }
}
