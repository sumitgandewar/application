import java.util.Scanner;

public class RangeOfArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            if (isArmStrong(i))
                System.out.println(i);
        }
    }

    public static boolean isArmStrong(int num) {
        int t = num;
        int sum = 0;
        int count = count(num);

        while (num > 0) {
            int r = num % 10;
            sum = sum + power(r, count);
            num = num / 10;
        }

        if (t == sum)
            return true;
        return false;
    }

    public static int count(int num) {
        int c = 0;
        while (num > 0) {
            c++;
            num = num / 10;
        }

        return c;
    }

    public static int power(int num, int p) {
        int sum = 1;

        while (p > 0) {
            sum = sum * num;
            p--;
        }

        return sum;
    }
}