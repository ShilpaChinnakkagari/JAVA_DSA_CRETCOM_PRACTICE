// Problem: Find the missing number in a range
// Given an integer array of size n containing distinct values in the range from 0 to n (inclusive),
// return the only number missing from the array within this range.

// Example 1:
// Input: nums = [0, 2, 3, 1, 4]
// Output: 5
// Explanation: nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

// Example 2:
// Input: nums = [0, 1, 2, 4, 5, 6]
// Output: 3
// Explanation: nums contains 0, 1, 2, 4, 5, 6 thus leaving 3 as the only missing number in the range [0, 6]


// Constraints:
// n == nums.length
// 1 <= n <= 104
// 0 <= nums[i] <= n
// All the numbers of nums are unique

// Frequently Occurring Doubts:
// Q1: Why use the sum formula instead of iterative checks?
// Q2: What happens if the missing number is 0 or n?

// Interview Follow-ups:
// 1. How would you handle the problem if duplicates are allowed in the array?
// 2. How does the performance compare between the sum formula and XOR methods?


import java.util.Arrays;

class Q48_MissingNo {

    static void missingNoOptimal(int[] arr) {
        int n = arr.length;
        int total = n * (n + 1) / 2; // sum of 0..n
        int arrSum = 0;
        for (int num : arr) {
            arrSum += num;
        }
        System.out.println(total - arrSum);
    }


    static void missingNo(int[] arr) {
        Arrays.sort(arr);   // make consecutive check valid
        int n = arr.length;

        // case 1: missing 0
        if (arr[0] != 0) {
            System.out.println(0);
            return;
        }

        // case 2: missing in between
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                System.out.println(arr[i] + 1);
                return;
            }
        }

        // case 3: missing n
        System.out.println(n);
    }

    public static void main(String args[]) {
        int[] nums = {0, 1, 6, 4, 2, 5};
        missingNo(nums);
        missingNoOptimal(nums);
    }
}