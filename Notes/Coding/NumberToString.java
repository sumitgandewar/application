import java.util.Scanner;

public class NumberToString {
    static String one[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",

            "eleven", "tweleve", "thirteen", "fourteen", "fifteeen", "sixteeen", "seventeen", "eighteen", "nineteen" };
    static String two[] = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eigty", "ninety" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        int num = sc.nextInt();
        sc.close();

        pw(num / 10000000, "Crores");
        pw((num / 100000) % 100, "Lakhs");
        pw((num / 1000) % 100, "Thausand");
        pw((num / 100) % 10, "Hundred");
        pw(num % 100, "");

    }

    public static void pw(int n, String w) {
        if (n <= 19)
            System.out.print(one[n] + " ");
        else
            System.out.print(two[n / 10] + one[n % 10] + " ");

        if (n != 0)
            System.out.print(w + " ");
    }
}