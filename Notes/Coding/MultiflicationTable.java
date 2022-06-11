import java.util.Scanner;

public class MultiflicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.printf("%d * %d = %d \t", j, i, (i * j));
            }
            System.out.println();
        }
    }
}
