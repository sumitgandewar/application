import java.util.HashMap;

public class TimeOfElementOccurance {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 12, 56, 87, 45, 90, 87, 12, 34 };
        display(arr);
        occurance(arr);
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "th position element :" + arr[i]);
        }
    }

    public static void occurance(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]);
                map.put(arr[i], ++count);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(map);

    }
}
