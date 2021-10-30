import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[] { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2)
            return new int[] { 0, 1 };
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { i, map.get(target - nums[i]) };
            }
            map.put(nums[i], i);
        }
        return new int[] { 0, 1 };
    }
}
