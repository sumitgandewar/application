import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number :");
        int num = sc.nextInt();
        sc.close();

        int prev1 = 0;
        int prev2 = 1;
        int sum = 0;
        System.out.print(prev1 + " ");

        for (int i = 1; i <= num; i++) {
            System.out.print(prev2 + " ");
            sum = prev1 + prev2;
            prev1 = prev2;
            prev2 = sum;

        }
    }
}
