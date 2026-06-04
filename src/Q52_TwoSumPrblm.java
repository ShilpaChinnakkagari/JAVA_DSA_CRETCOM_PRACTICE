import java.util.*;
/*
    PROBLEM:
    --------
    Given an integer array 'nums' and an integer 'target',
    return the indices (0-indexed) of the two elements that add up to target.

    Constraints:
    - Exactly one solution exists
    - Same element cannot be used twice
    - Array may contain negative numbers
    - Length up to 1e5 → need optimal O(n) solution

    APPROACH:
    --------
    Use a HashMap to store numbers seen so far and their indices.
    For each element nums[i]:
        1. Compute complement = target - nums[i]
        2. Check if complement exists in the map
           → If yes, return [map.get(complement), i]
        3. Otherwise, store nums[i] in the map with its index
    This ensures O(n) time and O(n) space.
    */

class Q52_TwoSumPrblm {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        // Should never reach here because a solution is guaranteed
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 6, 2, 10, 3};
        int target1 = 7;
        System.out.println(Arrays.toString(twoSum(nums1, target1))); // Output: [0, 1]

    }
}
