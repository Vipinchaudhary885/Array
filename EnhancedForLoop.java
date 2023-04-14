package Array;

public class EnhancedForLoop {
    public static void main(String[] args) {

        // for 1D array
        // int[] nums = { 1, 2, 3, 4 };
        // for (int n : nums) {
        // System.out.println(n);
        // }

        // for 2D array or basically jagged array .
        int[][] nums = { { 1, 2, 3 }, // means iss array ka element ye pura array i.e., { 1, 2, 3 } na ki 1 .
                { 4, 5 }, // means iss array ka element ye pura array i.e., {4,5} na ki 4 .
                { 4, 5, 6 } // means iss array ka element ye pura array i.e.,{4,5,6} na ki 4 .
        };

        for (int a[] : nums) {
            for (int b : a) {
                System.out.print(b + " ");
            }

            System.out.println(" ");
        }

    }
}
