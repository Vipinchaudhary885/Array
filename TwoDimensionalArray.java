package Array;

// In 2D array or multi-dimensional array or two dimensional array, try to understand these concept we can create 2x3 matrices but in programming these concept are called as 2D array .
// example matrices(2*3) .

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // in 2d array declaration --> type [][] arrayName = new type [rows][columns];

        // int[][] nums = new int[3][2]; // create an array (method 1)
        // nums[0][0] = 1;
        // nums[0][1] = 2;
        // nums[1][0] = 3;
        // nums[1][1] = 4;
        // nums[2][0] = 5;
        // nums[2][1] = 7;


        // no need to use new operator or keyword .
        // create an array (method 2), if we know the size of array or elements of the
        // array then we can create an big array and inside create an small array .
        // 2d array .
        // int nums[][] = { { 1, 2 },
        // { 3, 4 },
        // { 5, 7 } };


        // In jagged array, no.of rows fixed but no. of column are unfixed and it is
        // known as jagged array.
        // int nums[][] = { { 1, 2, 3, 4 },
        // { 3, 4 },
        // { 5, 7, 1 } };

        // with the help of loop concept i.e., nested loop to solve jagged array .
        // for (int i = 0; i < 3; i++) { // i loop for rows i.e. outer loop
        // for (int j = 0; j < nums[i].length; j++) { // j loop for columns i.e. inner
        // loop
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println(" ");
        // }


        // individually define the size of element in terms of column .
        int nums[][] = new int[3][];
        nums[0] = new int[4]; // we can define the array individually in terms of 1D array .
        nums[1] = new int[2];
        nums[2] = new int[3];

        nums[0][0] = 1;
        nums[0][1] = 2;
        nums[1][0] = 3;
        nums[1][1] = 4;
        nums[2][0] = 5;
        nums[2][1] = 7;
        nums[0][2] = 5;
        nums[0][3] = 6;
        nums[2][2] = 9;

        for (int i = 0; i < 3; i++) { // i loop for rows i.e. outer loop
            for (int j = 0; j < nums[i].length; j++) { // j loop for columns i.e. inner loop
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }


        // for practice .
        // int [] nums = new int [-5];
        // System.out.println(nums[-1]);

        // this is a example for mcq practice not involved in these area of code 2d array .
        // int [] arr = new int[5];
        // arr[0] = 1;
        // System.out.print(arr[0]);
        // System.out.print(arr[1]);
        // System.out.print(arr[2]);
        // System.out.print(arr[3]);
        // System.out.print(arr[4]);



        // System.out.println(nums[0][0]);
        // System.out.println(nums[0][1]);
        // System.out.println(nums[1][0]);
        // System.out.println(nums[1][1]);
        // System.out.println(nums[2][0]);
        // System.out.println(nums[2][1]);

        // if we can print this statement multiple time i.e., 100 times it's things
        // weired to print multiple statement so we can use the nested for loop concept.

        // repeat task solve with the help of for loop i.e. nested loop (loop inside
        // loop) i refer to outer loop and j refer to inner loop .

        // for (int i = 0; i < 3; i++) { // i loop for rows i.e. outer loop
        // for (int j = 0; j < 2; j++) { // j loop for columns i.e. inner loop
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

    }
}
