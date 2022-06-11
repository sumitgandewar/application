import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        sc.close();
        int t = num;
        int sum = 0;

        while (num > 0) {
            int d = num % 10;
            sum = sum + factorial(d);
            num = num / 10;
        }

        if (t == sum)
            System.out.println("Strong number");
        else
            System.out.println("Not Strong number");
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