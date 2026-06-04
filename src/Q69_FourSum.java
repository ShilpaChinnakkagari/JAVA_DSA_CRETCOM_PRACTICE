import java.util.*;

public class Q69_FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> resultSet = new HashSet<>();
        int n = nums.length;

        // Sort the array (helps to avoid duplicates easily)
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Now we want two numbers such that nums[k] + nums[l] == target - nums[i] - nums[j]
                int twoSumTarget = target - nums[i] - nums[j];
                Set<Integer> seen = new HashSet<>();

                for (int k = j + 1; k < n; k++) {
                    int fourth = twoSumTarget - nums[k];
                    if (seen.contains(fourth)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], fourth);
                        Collections.sort(quad);
                        resultSet.add(quad);
                    }
                    seen.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        int target = 0;
        List<List<Integer>> res = fourSum(nums, target);
        System.out.println(res);
    }
}

