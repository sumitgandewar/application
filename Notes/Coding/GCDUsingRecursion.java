import java.util.*;

public class GCDUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(gcdNo(num1, num2));

    }

    public static int gcdNo(int a, int b) {
        if (a == 0)
            return b;

        if (b == 0)
            return a;

        if (a == b)
            return b;

        if (a > b)
            return gcdNo(a - b, b);
        return gcdNo(a, b - a);
    }
}
