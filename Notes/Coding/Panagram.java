import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        sc.close();

        if (isPanagram(s.toLowerCase()))
            System.out.println("Panagram");
        else
            System.out.println("Not Panagram ");

    }

    public static boolean isPanagram(String s) {
        int index = 0;
        boolean[] b = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                index = (int) s.charAt(i) - 65;
                b[index] = true;
            } else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                index = (int) s.charAt(i) - 97;
                b[index] = true;
            } else
                continue;
        }

        for (int i = 0; i < 26; i++) {
            if (b[i] == false)
                return false;
        }

        return true;
    }
}