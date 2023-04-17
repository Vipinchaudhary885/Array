public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        // Buffer overrun and ArrayIndexOutOfBoundsException .
        // In java when we create an array, array index starts from 0 index.

        // Example -

        // int[] a = { 1, 2, 3, 4, 5, };
        // In the zero index we have 1, similarly in the first index we have 2, second
        // index we have 3, third
        // index we have 4 and in fourth index we have 5.

        int[] a = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < 4; i++) {
            System.out.println(a[6]); // a[6] and it is not present or If we try to access the index which is not in
                                      // the array range then it would result in an Exception called
                                      // “ArrayIndexOutOfBoundsException” .
        }
        // System.out.println(a[6]);
    }
}
