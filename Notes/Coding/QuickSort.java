import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 12, 76, 34, 98, 34, 67, 23 };
        System.out.println("Before Sorting : " + Arrays.toString(arr));
        System.out.println();
        sort(arr, 0, arr.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    public static void sort(int[] arr, int left, int right) {
        if (left >= right)
            return;

        int pivot = arr[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i <= right && pivot >= arr[i])
                i++;

            while (j >= 0 && pivot < arr[j])
                j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[left];
        arr[left] = temp;

        sort(arr, left, j - 1);
        sort(arr, j + 1, right);

    }
}
