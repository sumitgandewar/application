import java.util.*;

public class InsertElementIntoExistingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("insert " + (i + 1) + "th element :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Before :");
        display(arr);

        System.out.println("insert position");
        int index = sc.nextInt();
        System.out.println("insert element");
        int ele = sc.nextInt();
        arr = insert(arr, index, ele);
        display(arr);
        sc.close();
    }

    public static int[] insert(int[] arr, int index, int ele) {
        if (index > arr.length || index < 0) {
            System.out.println("invalid index");
            return arr;
        } else {
            int[] na = new int[arr.length + 1];

            for (int i = 0; i < index; i++) {
                na[i] = arr[i];
            }

            na[index] = ele;

            for (int i = index; i < arr.length; i++) {
                na[i + 1] = arr[i];
            }

            return na;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th element :" + arr[i]);
        }
    }
}
