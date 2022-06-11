import java.util.Scanner;

public class BiggestElementOfRowAndColumnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n*m :");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            int biggest = arr[0][0];
            for (int j = 0; j < n; j++) {
                if (biggest < arr[i][j])
                    biggest = arr[i][j];
            }
            System.out.println((i) + " row biggest element :" + biggest);
        }

        for (int i = 0; i < n; i++) {
            int biggest = arr[0][0];
            for (int j = 0; j < m; j++) {
                if (biggest < arr[j][i])
                    biggest = arr[j][i];
            }
            System.out.println((i + 1) + " column biggest element :" + biggest);
        }

        sc.close();
    }
}