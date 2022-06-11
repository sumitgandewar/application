public class ExchangeFirstPartToSecond {
    public static void main(String[] args) {
        int[] arr = { 21, 12, 15, 32, 16, 17, 22 };
        System.out.println("Before exchange :");
        display(arr);

        int n = 0;

        if (arr.length % 2 == 0)
            n = arr.length / 2;
        else
            n = arr.length / 2 + 1;

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n++;
        }

        System.out.println("After Exchange :");
        display(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}