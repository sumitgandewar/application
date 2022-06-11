public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 12, 76, 34, 98, 34, 67, 23 };
        System.out.println("Before Sorting : ");
        display(arr);
        System.out.println();
        sort(arr);
        System.out.println("After Sorting : ");
        display(arr);
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
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
