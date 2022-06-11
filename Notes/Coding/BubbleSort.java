public class BubbleSort {
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
        if (n == 1)
            return;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        sortRec(arr, n - 1);
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
