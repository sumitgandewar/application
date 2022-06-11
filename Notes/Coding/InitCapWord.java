import java.util.*;

public class InitCapWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        sc.close();
        // System.out.println(convertToUpper(s));
        ;
        char[] ch = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            while (i >= 0 && ch[i] != ' ') {
                i--;
            }

            int j = i + 1;
            // ch[j] = (char) (ch[j] - 32);

            if (j == 0) {
                ch[j] = ch[j];
            } else {
                ch[j] = (char) (ch[j] - 32);
            }
        }

        System.out.println(String.valueOf(ch));
    }

    // public static String convertToUpper(String s) {
    // char[] ch = s.toCharArray();

    // for (int i = s.length() - 1; i >= 0; i--) {
    // while (i >= 0 && ch[i] != ' ') {
    // i--;
    // }

    // int j = i + 1;
    // // ch[j] = (char) (ch[j] - 32);

    // if (j == 0) {
    // ch[j] = ch[j];
    // } else {
    // ch[j] = (char) (ch[j] - 32);
    // }
    // }

    // return String.valueOf(ch);
    // }
}
