/*
=====================================
Problem: Majority Element (n/2 times)
=====================================

Given an integer array nums of size n,
return the element that appears more than n/2 times.

The majority element is GUARANTEED to exist.

-------------------------------------
Example:
Input:  [7, 0, 0, 1, 7, 7, 2, 7, 7]
Output: 7

Input:  [-1, -1, -1, -1]
Output: -1
-------------------------------------

Approaches:
1. HashMap (easy but extra space)
2. Sorting (O(n log n))
3. Boyer-Moore Voting Algorithm (OPTIMAL)

We use Boyer-Moore.
Time: O(n)
Space: O(1)
=====================================
*/


//My approach - Frequency Count Q29

class Q54_MajorityElement {

    /*
    ==============================
    Boyer-Moore Voting Algorithm
    ==============================

    Idea:
    - Keep a candidate
    - Maintain a count
    - Same number → count++
    - Different number → count--
    - When count becomes 0 → change candidate

    Why it works:
    - Majority element appears more than n/2 times
    - It can never be fully cancelled out
    */

    public static int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {

            // if count is 0, pick new candidate
            if (count == 0) {
                candidate = num;
            }

            // vote
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // since majority element is guaranteed
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1};
        System.out.println(majorityElement(nums)); // -1
    }
}
