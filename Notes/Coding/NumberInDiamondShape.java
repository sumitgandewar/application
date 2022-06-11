import java.util.Scanner;

public class NumberInDiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter line no :");
        int num = sc.nextInt();
        sc.close();
        int space = num / 2;
        int star = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= star; k++) {
                System.out.print(k);
            }

            System.out.println("");

            if (i <= num / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
        }
    }
}
