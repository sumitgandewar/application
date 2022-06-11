import java.util.*;

public class ReverseWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        String word = "";
        sc.close();

        for (int i = 0; i < ch.length; i++) {
            int j = i;

            while (i < ch.length && ch[i] != ' ') {
                i++;
            }

            int k = i - 1;

            while (k >= j) {
                word += ch[k];
                k--;
            }

            word += ' ';
        }

        System.out.println(word);
    }
}
