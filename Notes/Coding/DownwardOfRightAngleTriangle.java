import java.util.Scanner;

public class DownwardOfRightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line no :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
