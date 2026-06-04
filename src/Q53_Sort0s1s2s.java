/*
========================
Problem: Sort Colors (0, 1, 2)
========================

Given an array nums consisting of only 0, 1, or 2, sort the array in non-decreasing order.

Constraints:
1 <= nums.length <= 10^5
nums consists of 0, 1, 2 only
Sort in-place without using extra array

Example:
Input: [1, 0, 2, 1, 0]
Output: [0, 0, 1, 1, 2]

-------------------------
*/

import java.util.Arrays;

class Q53_Sort0s1s2s {

    /*
    =========================
    MY Approach: Two-pass
    =========================
    Idea:
    - First pass: move all 0s to the front
    - Second pass: move all 1s after 0s
    - 2s automatically end up at the end
    - Time: O(n) + O(n) = O(n)
    - Space: O(1)
    */
    public static void sortColorsTwoPass(int[] arr) {
        int n = arr.length;
        int k = 0; // pointer for next 0 or 1

        // First pass: move all 0s to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }

        // Second pass: move all 1s after 0s
        for (int i = k; i < n; i++) {
            if (arr[i] == 1) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        // 2s are already at the end
    }

    /*
    =========================
    Optimal Approach: Single-pass Dutch National Flag
    =========================
    Idea:
    - Maintain 3 pointers: low, k, high
    - low → next position for 0
    - k → current element being checked
    - high → next position for 2
    Rules:
        1. If nums[k] == 0 → swap nums[low] and nums[k], increment low & k
        2. If nums[k] == 1 → k++
        3. If nums[k] == 2 → swap nums[k] and nums[high], decrement high (k stays)
    - Single traversal → O(n) time, O(1) space
    */
    public static void sortNos(int[] nums) {
        int low = 0, k = 0, high = nums.length - 1;

        while (k <= high) {
            if (nums[k] == 0) {
                int temp = nums[k];
                nums[k] = nums[low];
                nums[low] = temp;
                low++;
                k++;
            } else if (nums[k] == 1) {
                k++;
            } else { // nums[k] == 2
                int temp = nums[k];
                nums[k] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 2, 1};
        sortColorsTwoPass(arr1);
        System.out.println("Two-pass approach: " + Arrays.toString(arr1)); // [1, 1, 1, 2, 2]

        int[] arr2 = {1, 0, 2, 1, 0};
        sortNos(arr2);
        System.out.println("Single-pass approach: " + Arrays.toString(arr2)); // [0, 0, 1, 1, 2]
    }
}
