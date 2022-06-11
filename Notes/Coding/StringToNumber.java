import java.util.*;

public class StringToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        sc.close();
        char[] ch = s.toCharArray();
        int num = 0;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 48 && ch[i] <= 57) {
                num = num * 10 + (int) (ch[i] - 48);
            }
        }

        System.out.println(String.valueOf(ch));
    }
}
