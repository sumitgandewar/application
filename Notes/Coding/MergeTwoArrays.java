public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] ar1 = { 12, 13, 23, 15, 11, 16 };
        int[] ar2 = { 53, 26, 23, 15, 18, 13 };

        int[] arr = new int[ar1.length + ar2.length];
        int j = 0;

        for (int i = 0; i < ar1.length; i++, j++) {
            arr[j] = ar1[i];
        }

        for (int i = 0; i < ar2.length; i++, j++) {
            arr[j] = ar2[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
