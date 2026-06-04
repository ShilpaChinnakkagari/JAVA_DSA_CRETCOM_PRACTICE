import java.util.*;

/*
PROBLEM:
--------
Given an integer array nums and an integer k,
find the length of the LONGEST CONTIGUOUS subarray
whose sum is exactly equal to k.
Return 0 if no such subarray exists.

IMPORTANT NOTE:
---------------
• Array may contain NEGATIVE numbers
• Sliding window will NOT work
• Optimal solution uses Prefix Sum + HashMap

------------------------------------------------
TIME & SPACE COMPLEXITY:
------------------------------------------------
Time Complexity  : O(n)
Space Complexity : O(n)

------------------------------------------------
EXAMPLE:
------------------------------------------------
nums = [10, 5, 2, 7, 1, 9]
k = 15

Longest subarray = [5, 2, 7, 1]
Answer = 4
------------------------------------------------
*/

class Q51_LongestSubArray {

    public static int longestSubarray(int[] nums, int k) {

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

                // Subarray found with sum = k
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

        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(longestSubarray(nums, k)); // Output: 4
    }
}



/*
NOTE:
-----
The below solution uses BRUTE FORCE to find the longest subarray
with sum = k.

• It works for BOTH positive and negative numbers
• It checks ALL possible subarrays
• Time Complexity: O(n^2)
• Space Complexity: O(1)

Logic:
------
For each starting index:
    keep adding elements one by one
    check if the running sum equals k
    update maximum length if found

Though this approach is correct but NOT optimal.
For large inputs, use Prefix Sum + HashMap (O(n)).
*/


//class MyCode {
//
//    // Shared result to store the maximum length found
//    static int max = 0;
//
//    public static void func(int[] arr, int k, int start) {
//
//        int sum = 0;
//        int count = 0;
//
//        // Try all subarrays starting at index 'start'
//        for (int i = start; i < arr.length; i++) {
//            sum += arr[i];
//            count++;
//
//            if (sum == k) {
//                if (count > max) {
//                    max = count;
//                }
//            }
//        }
//
//        // Move start index to the next position
//        if (start < arr.length - 1) {
//            func(arr, k, start + 1);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {10, 5, 2, 7, 1, 9};
//        int k = 15;
//
//        func(arr, k, 0);
//
//        System.out.println(max); // Output: 4
//    }
//}