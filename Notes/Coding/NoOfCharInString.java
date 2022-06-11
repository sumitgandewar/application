import java.util.*;

public class NoOfCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.next();
        sc.close();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 || s.charAt(i) >= 65 && s.charAt(i) <= 90
                    || s.charAt(i) >= 97 && s.charAt(i) <= 122)
                count++;
        }

        System.out.println("Count : " + count);
    }
}
