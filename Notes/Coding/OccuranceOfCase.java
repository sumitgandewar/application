import java.util.*;

public class OccuranceOfCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        sc.close();

        int LC = 0;
        int UC = 0;
        int SP = 0;
        int DG = 0;
        int SC = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
                LC++;
            else if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
                UC++;
            else if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
                DG++;
            else if (s.charAt(i) == ' ')
                SP++;
            else
                SC++;
        }

        System.out.println("LC :" + LC);
        System.out.println("UC :" + UC);
        System.out.println("DG :" + DG);
        System.out.println("SP :" + SP);
        System.out.println("SC :" + SC);
    }
}
