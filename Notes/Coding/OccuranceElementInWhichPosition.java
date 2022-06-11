public class OccuranceElementInWhichPosition {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 12, 56, 87, 45, 90, 87, 12, 34 };
        display(arr);
        int occ = occurance(arr, 34, 2);

        if (occ >= 0)
            System.out.println("Element 12 last occurance at :" + occ);
        else
            System.out.println("invalid");
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th position element :" + arr[i]);
        }
    }

    public static int occurance(int[] arr, int ele, int occ) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                count++;

            if (count == occ)
                return i;
        }

        return -1;
    }
}
