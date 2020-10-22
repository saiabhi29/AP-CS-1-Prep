public class Delete {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 2) {
                b[i] = a[i];
                System.out.println(b[i]);
            }
        }
    }
}