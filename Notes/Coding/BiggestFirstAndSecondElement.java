public class BiggestFirstAndSecondElement {
    public static void main(String[] args) {
        int[] arr = { 12, 54, 23, 78, 56, 90, 345, 67 };
        int FBig = arr[0];
        int SBig = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (FBig < arr[i]) {
                SBig = FBig;
                FBig = arr[i];
            } else if (SBig < arr[i]) {
                SBig = arr[i];
            }
        }

        System.out.println(" First Biggest :" + FBig);
        System.out.println("Second Biggest :" + SBig);
    }
}
