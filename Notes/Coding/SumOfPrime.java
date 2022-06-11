import java.util.Scanner;

public class SumOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int sum = 0;
        sc.close();

        for (int i = 2; i <= num; i++) {
            if (check(i))
                sum += i;
        }
        System.out.println("Sum :" + sum);
    }

    public static boolean check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
