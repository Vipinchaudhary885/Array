public class Length {
    public static void main(String[] args) {

        // length vs length() -
        // In length, it is a property of an array type class .
        // In length(), it is a method of string type class .

        // for 1d array/single dimensional array/one dimensional array/one rows and
        // multiple no. of columns .
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(nums); // [I@3fee733d
        System.out.println(nums[0]); // 1
        System.out.println(nums[1]); // 2
        System.out.println(nums[2]); // 3
        System.out.println(nums[3]); // 4
        System.out.println(nums[4]); // 5
        // System.out.println(nums[5]); // Buffer overrun or
        // ArrayIndexOutOfBoundsException because we can access the
        // index value at 5 and it is not available inside the parentheses .
        // OR , If we try to access the index which is not in the array range then it
        // would result in an Exception called “ArrayIndexOutOfBoundsException”

        System.out.println("the size of an array  " + nums.length); // size of an array is 5 i.e. no. of element/size of
                                                                    // an array in 1D array or single dimensional array
                                                                    // .
        // for string .
        String[] names = { "vipin", "vinit", "deepak" };
        System.out.println(names); // garbage value/ jargon i.e., [Ljava.lang.String;@5acf9800
        System.out.println(names[2]); // deepak .
        System.out.println(names.length); // the size of an array/element is 3 .
        System.out.println(names[0].length()); // the no. of character inside "vipin" is 5 .

        // for 2d array/multi-dimensional array/two-dimensional array/ multiple no. of
        // rows and columns .

        int[][] numbers = { { 1, 2, 3 }, { 3, 5 }, { 5, 6, 7, 8 } };
        System.out.println(numbers); // [[I@4617c264
        System.out.println(numbers[0][0]); // 1
        System.out.println(numbers[2][2]); // 7
        System.out.println(numbers[0]); // [I@36baf30c
        System.out.println(numbers[2].length); // 4
        System.out.println(numbers.length); // 3 
    }
}
