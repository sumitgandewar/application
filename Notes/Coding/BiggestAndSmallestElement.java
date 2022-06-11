import java.util.*;

public class BiggestAndSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 25, 54, 23, 78, 56, 90, 345, 67 };
        sc.close();

        int biggest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (biggest < arr[i])
                biggest = arr[i];

            if (smallest > arr[i])
                smallest = arr[i];
        }

        System.out.println("Biggest :" + biggest);
        System.out.println("Smallest :" + smallest);
    }
}