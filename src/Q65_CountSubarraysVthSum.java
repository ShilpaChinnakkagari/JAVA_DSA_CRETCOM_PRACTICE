/*
Problem: Count Subarrays with Given Sum (Medium)

Given an array of integers nums and an integer k,
return the total number of subarrays whose sum equals k.

A subarray is a contiguous part of the array.

--------------------------------------------------
Example 1:
Input:
nums = [1, 1, 1], k = 2

Output:
2

Explanation:
There are two subarrays with sum = 2:
[1, 1] (from index 0 to 1)
[1, 1] (from index 1 to 2)

--------------------------------------------------
Example 2:
Input:
nums = [1, 2, 3], k = 3

Output:
2

Explanation:
Subarrays with sum = 3 are:
[1, 2]
[3]

--------------------------------------------------
Now your turn:
Input:
nums = [3, 1, 2, 4], k = 6

Possible subarrays:
[3, 1, 2] → sum = 6


--------------------------------------------------
Constraints:
1 <= nums.length <= 10^5
-1000 <= nums[i] <= 1000
-10^7 <= k <= 10^7

--------------------------------------------------
Note:
• Subarrays must be contiguous
• Negative numbers are allowed
• Optimal solution uses Prefix Sum + HashMap (O(n))
*/

// Optimal Approach
import java.util.HashMap;

class Q65_CountSubarraysVthSum {

    public static int countSubarrays(int[] nums, int k) {

        // HashMap to store prefixSum → frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Base case: prefix sum 0 occurs once

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];


            // If (prefixSum - k) exists, add its frequency to count
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update the frequency of current prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {3, -1, 2, -2, 4};
        int k = 2;

        System.out.println(countSubarrays(nums, k)); // Output: 4
    }
}



// MY Approach
//class Q65_CountSubarraysVthSum {
//
//    public static int func(int[] arr, int k, int start) {
//
//        if (start >= arr.length) return 0;
//
//        int sum = 0;
//        int count_k = 0;
//
//        for (int i = start; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum == k) {
//                count_k++;
//            }
//        }
//
//        return count_k + func(arr, k, start + 1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, -1, 2, -2, 4};
//        int k = 2;
//
//        System.out.println(func(arr, k, 0));
//    }
//}

