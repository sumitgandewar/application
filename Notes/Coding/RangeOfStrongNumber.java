import java.util.Scanner;

public class RangeOfStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            int t = i;
            int r = t;
            int sum = 0;
            while (t > 0) {
                int d = t % 10;
                sum = sum + factorial(d);
                t = t / 10;
            }

            if (r == sum)
                System.out.println("Strong number : " + r);
        }
    }

    public static int factorial(int num) {
        int fact = 1;

        while (num > 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }
}