public class CombineTwoArraysInZigzag {
    public static void main(String[] args) {
        int[] ar1 = { 12, 13, 23, 15, 11, 16 };
        int[] ar2 = { 53, 26, 23, 15, 18, 13, 23, 45 };
        int[] res = new int[ar1.length + ar2.length];
        int l = 0;
        int m = 0;

        for (int i = 0; i < res.length;) {
            if (l < ar1.length) {
                res[i] = ar1[l];
                l++;
                i++;
            }

            if (m < ar2.length) {
                res[i] = ar2[m];
                m++;
                i++;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
