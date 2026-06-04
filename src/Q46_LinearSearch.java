// Given an array of integers nums and an integer target,
// find the smallest index (0-based indexing) where the target appears in the array.
// If the target is not found in the array, return -1.

// Example 1:
// Input: nums = [2, 3, 4, 5, 3], target = 3
// Output: 1
// Explanation: The first occurrence of 3 in nums is at index 1

// Example 2:
// Input: nums = [2, -4, 4, 0, 10], target = 6
// Output: -1
// Explanation: The value 6 does not occur in the array, hence output is -1

// Your turn!
// Input: nums = [1, 3, 5, -4, 1], target = 1
// Output: ?


/*ALGORITHM=>
Start

Input the array nums and the integer target

Traverse the array from index 0 to nums.length - 1

For each index i:

If nums[i] == target, then

Return i (this is the smallest index)

If the loop ends and the target is not found:

Return -1

End*/

public class Q46_LinearSearch {

    // Function to find the smallest index of target in the array
    public static int findIndex(int[] nums, int target) {
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if current element is equal to target
            if (nums[i] == target) {
                return i; // Return the first (smallest) index where target is found
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        // Example
        int[] nums1 = {2, 3, 4, 5, 3};
        int target1 = 3;
        System.out.println(findIndex(nums1, target1)); // Output: 1

        // Example 2
        int[] nums2 = {2, -4, 4, 0, 10};
        int target2 = 6;
        System.out.println(findIndex(nums2, target2)); // Output: -1

    }
}

//Time & Space Complexity
//Time Complexity: O(n)
//Space Complexity: O(1)