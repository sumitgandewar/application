import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        String word = "";
        sc.close();

        for (int i = ch.length - 1; i >= 0; i--) {
            int j = i;

            while (i >= 0 && ch[i] != ' ') {
                i--;
            }

            int k = i + 1;
            while (k <= j) {
                word += ch[k];
                k++;
            }
            word += ' ';
        }

        System.out.println(word);
    }
}
