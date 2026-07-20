package helper;


@SuppressWarnings("unused")
public class Helper {

    public static void printArray(int[] nums) {
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < nums.length; ++i) {
            result.append(nums[i]);
            result.append((i < nums.length-1) ? ", " : "");
        }
        result.append("]");

        System.out.println(result);
    }
}
