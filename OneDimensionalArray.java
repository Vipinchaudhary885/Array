package Array;

// In arrays, list of items/element of the same type of data i.e., intger, long and so on. 
// Array declaration -->  type [] arrayname = new type [size].
// In 1D array, singal rows and  multiple  columns.

public class OneDimensionalArray {
    public static void main(String[] args) {

        // int[] marks = new int[3]; // create an array (method 1) .
        // marks[0] = 97;
        // marks[1] = 92;
        // marks[2] = 95;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }

        // if you know already, the size of array i.e. how much element can be stored
        // inside then we can create the array directly.

        int[] marks = { 97, 92, 95 }; // create an array (methhod 2) .
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }

       
    }
}
