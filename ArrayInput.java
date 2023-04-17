
package PracticeOfProgram;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // for 2d array 
        // input from the user .

        System.out.println("Enter the numbers of rows"); 
        int rows = sc.nextInt();

        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // input 
        for (int i = 0; i < rows; i++) {
            // for columns .
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }

        // Output 
        System.out.println();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
