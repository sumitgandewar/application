import java.util.*;

public class ReverseNoUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int num = sc.nextInt();
        sc.close();
        rev(num);
    }

    public static void rev(int num) {
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            rev(num / 10);
        }
    }
}
