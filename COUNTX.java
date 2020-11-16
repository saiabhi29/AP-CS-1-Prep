import java.util.*;

public class Xcount {
    public static int countX(String s) {
        int count = 0;
        if (s.charAt(0) == 'x') {
            count = 1;
        } else if (s.length() == 1) {
            return count;
        }
        count = count + countX(s.substring(1));
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(countX(s));

    }
}
