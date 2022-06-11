import java.util.Scanner;

public class ReverseRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line no :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
