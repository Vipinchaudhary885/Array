
class calc {
    public int add(int[] nums) {
        int result = 0;

        // for enhanced loop .
        for (int n : nums) {
            result = result + n;
        }
        return result;
    }
}

public class AnonymousArray {
    public static void main(String[] args) {

        calc obj = new calc(); // object of a calc class .
        // int[] nums = { 5, 4, 3, 2, 1 };
        int result = obj.add(new int[] { 5, 4, 3, 2, 1 }); // it is called anonymous array . b/c an array without a name
                                                           // is called anonymous array . and it is created for just
                                                           // instance use .
        System.out.println(result);

    }
}
