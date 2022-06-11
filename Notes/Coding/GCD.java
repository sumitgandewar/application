import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int gcdNo = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcdNo = i;
                continue;
            }
        }
        System.out.println(gcdNo);

    }
}
