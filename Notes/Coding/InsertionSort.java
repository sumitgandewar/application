public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 12, 76, 34, 98, 34, 67, 23 };
        System.out.println("Before Sorting : ");
        display(arr);
        System.out.println();
        sortRec(arr, arr.length);
        System.out.println("After Sorting : ");
        display(arr);
    }

    public static void sortRec(int[] arr, int n) {
        if (n <= 1)
            return;

        sortRec(arr, n - 1);

        int key = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
