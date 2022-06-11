public class Practice {
    public static void main(String[] args) {
        int[] arr = { 1, 7, 8, 5, 4, 6, 0, 2, 3 };
        arr = arrRotate(9, arr, 3);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] arrRotate(int n, int[] arr, int shift) {
        int[] a = new int[shift];
        for (int i = 0; i < shift; i++) {
            a[i] = arr[i];
        }

        int[] result = new int[arr.length];
        int j = 0;
        for (int i = shift; i < arr.length; i++, j++) {
            result[j] = arr[i];
        }

        int k = 0;
        for (int i = j; i < result.length; i++, k++) {
            result[i] = a[k];
        }

        return result;

    }
}