
import java.util.LinkedHashSet;
import java.util.Set;

public class DistinctElementFromTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 12, 13, 23, 15, 11, 16 };
        int[] arr2 = { 53, 26, 23, 15, 18, 13 };

        Set<Integer> set = new LinkedHashSet<>();

        System.out.println("Distinct elemnts :");

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println(set);
    }
}
