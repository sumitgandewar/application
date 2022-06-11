import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.next();
        sc.close();

        if (isPalindrome(s.toLowerCase()))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean isPalindrome(String s) {
        int i = s.length() - 1;
        int k = 0;

        while (k < i) {
            if (s.charAt(i) != s.charAt(k))
                return false;

            i--;
            k++;
        }

        return true;
    }
}
