//refer Q51 LongestSubArray with given sum, make given sum as 0 at k place

import java.util.*;

class Q70_LongestSubArrayVthSum0 {

    public static int longestSubarray(int[] nums) {

        int k = 0; // We want sum = 0

        // HashMap to store prefixSum → first index
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;   // cumulative sum
        int maxLength = 0;   // final answer

        // Base case: sum = 0 at index -1
        map.put(0, -1);

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Add current element to prefix sum
            prefixSum += nums[i];

            // Check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {

                // Subarray found with sum = k (here k=0)
                int length = i - map.get(prefixSum - k);

                // Update maximum length
                maxLength = Math.max(maxLength, length);
            }

            // Store prefixSum only if it is NOT already present
            // (We want the earliest index for longest length)
            map.putIfAbsent(prefixSum, i);
        }

        // Return the length of the longest subarray
        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println(longestSubarray(arr));
    }
}
