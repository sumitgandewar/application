import java.util.*;

public class ReverseArrayElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("enter " + (i + 1) + "th element");
            arr[i] = sc.nextInt();
        }

        System.out.println("Before :");
        display(arr);

        int j = size - 1;
        for (int i = 0; i <= size / 2; i++) {
            int k = arr[i];
            arr[i] = arr[j];
            arr[j] = k;
            j--;
        }

        System.out.println("After :");
        display(arr);
        sc.close();
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th element --> " + arr[i]);
        }
    }
}