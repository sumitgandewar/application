import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.next();
        sc.close();

        int i = 0;
        int j = s.length() - 1;
        char[] c = s.toCharArray();

        while (i < j) {
            char t = c[i];
            c[i] = c[j];
            c[j] = t;
            i++;
            j--;
        }

        System.out.println(String.valueOf(c));
    }
}
