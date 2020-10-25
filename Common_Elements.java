public class Common_Elements {
    public static void main(String[] args) {
        String[] a = { "hi", "sigh", "goodbye", "nanna", "thanks" };
        String[] b = { "sai", "nanna", "hi", "thanks", "bye" };
        String[] c = new String[5];
        int e = 0;

        for (int i = 0; i < a.length; i++) {
            for (int d = 0; d < b.length; d++) {
                if (a[i].equals(b[d])) {
                    c[e] = a[i];
                    System.out.println(c[e]);
                    e++;
                    d = 5;
                }
            }
        }
    }
}
