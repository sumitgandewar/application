import java.util.*;

public class InvertedEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of pattern lines :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = i; j <= num; j++) {
                System.out.print(" *");
            }

            System.out.println("");
        }
    }
}
