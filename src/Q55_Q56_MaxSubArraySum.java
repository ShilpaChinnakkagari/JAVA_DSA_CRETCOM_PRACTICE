/*
Problem Statement:
Given an integer array nums, find the subarray with the largest sum
and return the sum of the elements present in that subarray.

A subarray is a contiguous non-empty sequence of elements within an array.

Example:
Input : nums = [2, 3, 5, -2, 7, -4]
Output: 15

Explanation:
The subarray from index 0 to index 4 has the largest sum = 15.
*/


/*
Algorithm (Kadane’s Algorithm):

Step 1:
Initialize two variables:
- currentSum = nums[0]
- maxSum = nums[0]

Step 2:
Traverse the array from index 1 to n-1.

Step 3:
For each element nums[i], decide:
- Either extend the previous subarray:
      currentSum + nums[i]
- Or start a new subarray from nums[i]

Step 4:
Update currentSum as:
      currentSum = max(nums[i], currentSum + nums[i])

Step 5:
Update maxSum as:
      maxSum = max(maxSum, currentSum)

Step 6:
After the loop ends, maxSum will contain the maximum subarray sum.

Step 7:
Return maxSum.
*/




public class Q55_Q56_MaxSubArraySum {

    public static int maxSubArray(int[] nums) {

        // Step 1: Initialize currentSum and maxSum
        int currentSum = nums[0];
        int maxSum = nums[0];

        // Step 2: Traverse from second element
        for (int i = 1; i < nums.length; i++) {

            // Step 3 & 4:
            // Decide whether to extend previous subarray
            // or start a new subarray from nums[i]
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Step 5:
            // Update the global maximum subarray sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Step 6 & 7:
        // Return the maximum subarray sum
        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 5, -2, 7, -4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}

/*
Time Complexity  : O(n)
Space Complexity : O(1)
*/

