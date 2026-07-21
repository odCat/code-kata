package helper;


@SuppressWarnings("unused")
public class Helper {

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void arithmeticSwap(int[] nums, int first, int second) {
        nums[first] = nums[first] + nums[second];
        nums[second] = nums[first] - nums[second];
        nums[first] = nums[first] - nums[second];
    }

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
