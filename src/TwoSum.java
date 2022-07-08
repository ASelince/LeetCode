import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 两数之和
 */
public class TwoSum {

    public static int[] twoSumWithFor(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int k = i + 1; k < nums.length; k++) {

                int temp = nums[i] + nums[k];
                if (temp == target) {

                    return new int[]{i, k};
                }
            }
        }
        return null;
    }

    public static int[] twoSumWithMap(int[] nums, int target) {

        Map<Integer, Integer> dataMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            Integer value = dataMap.get(nums[i]);

            if (value != null) {

                return new int[]{value, i};
            } else {

                dataMap.put(target - nums[i], i);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int target = 3;

        System.out.println(Arrays.stream(Objects.requireNonNull(twoSumWithMap(nums, target))).boxed()
                .collect(Collectors.toList()));
    }
}
