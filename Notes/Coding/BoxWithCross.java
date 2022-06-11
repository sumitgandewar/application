import java.util.*;

public class BoxWithCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of line :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num || i == j || i + j == (num + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
