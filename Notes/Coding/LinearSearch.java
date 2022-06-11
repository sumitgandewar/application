import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 3, 1, 7, 5, 89, 56, 23, 89, 60 };
        System.out.print("Array Element --> ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }

        System.out.println("\nEnter element which you want to find : ");
        int num = sc.nextInt();

        if (find(arr, num))
            System.out.println(num + " is found");
        else
            System.out.println(num + " is not found");
    }

    public static boolean find(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }

        return false;
    }
}