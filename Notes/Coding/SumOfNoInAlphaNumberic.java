import java.util.*;

public class SumOfNoInAlphaNumberic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.next();
        sc.close();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                sum += s.charAt(i) - 48;
        }

        System.out.println("Sum : " + sum);
    }
}
