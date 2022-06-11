import java.util.Scanner;

public class SequenceOfNoInTraingleFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line no :");
        int num = sc.nextInt();
        sc.close();
        int k = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                k++;
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
