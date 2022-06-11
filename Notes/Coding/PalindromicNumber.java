import java.util.*;

public class PalindromicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        sc.close();
        int n = 0;
        int t = num;

        while (num != 0) {
            int a = num % 10;
            n = n * 10 + a;
            num = num / 10;
        }

        if (t == n)
            System.out.println("palindromic number ");
        else
            System.out.println(" not palindromic number ");

    }
}
