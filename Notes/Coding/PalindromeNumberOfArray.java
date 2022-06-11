public class PalindromeNumberOfArray {
    public static void main(String[] args) {
        int arr[] = { 232, 12, 78, 898, 34543, 45 };
        display(arr);
        System.out.println();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (palindrome(num))
                count++;
        }

        System.out.println(count);
    }

    public static boolean palindrome(int num) {
        int n = num;
        int sum = 0;

        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            sum = sum * 10 + i;
        }

        if (num == sum)
            return true;
        else
            return false;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
