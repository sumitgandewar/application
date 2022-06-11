import java.util.*;

public class NoOfCharInEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println("Word : " + word + " , Count : " + count);
                word = "";
                count = 0;
            } else {
                word += s.charAt(i);
                count++;
            }
        }
        System.out.println("Word : " + word + " , Count : " + count);
    }
}
