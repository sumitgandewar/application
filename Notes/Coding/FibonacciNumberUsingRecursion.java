import java.util.Scanner;

public class FibonacciNumberUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 0; i < num; i++) {
            System.out.print(fab(i) + " ");
        }
    }

    public static int fab(int num) {
        if (num == 0)
            return 0;

        if (num == 1 || num == 2)
            return 1;

        return fab(num - 1) + fab(num - 2);
    }
}
