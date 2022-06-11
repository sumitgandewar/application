
public class MShape {
    public static void main(String[] args) {
        int space = 8;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
            space -= 2;
        }
    }
}
