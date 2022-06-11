import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print("Array Element --> ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " , ");
        }

        System.out.println("\nEnter element which you want to find : ");
        int num = sc.nextInt();
        sc.close();

        int pos = findRec(arr, num, 0, (arr.length - 1));

        if (pos >= 0)
            System.out.println(num + " is found at position :" + pos);
        else
            System.out.println(num + " is not found");
    }

    public static int findRec(int[] arr, int num, int left, int right) {
        if (left <= right) {
            int middle = (left + right) / 2;

            if (arr[middle] == num)
                return middle;
            else if (num > arr[middle])
                return findRec(arr, num, middle + 1, right);
            else
                return findRec(arr, num, left, middle - 1);
        }

        return -1;

    }

    public static int find(int[] arr, int num) {

        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int middle = (first + last) / 2;

            if (arr[middle] == num)
                return middle;
            else if (num > arr[middle])
                first = middle + 1;
            else if (num < arr[middle])
                last = middle - 1;
        }
        return -1;
    }
}