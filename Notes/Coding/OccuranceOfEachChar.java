import java.util.*;

public class OccuranceOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        sc.close();

        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                int count = m.get(s.charAt(i));
                m.put(s.charAt(i), ++count);
            } else
                m.put(s.charAt(i), 1);
        }

        System.out.println(m);
    }
}
