/*
 Question:
 Given an integer array nums of size n.
 Return all elements which appear more than n/3 times in the array.
 The output can be returned in any order.

 Example:
 Input: nums = [1, 2, 1, 1, 3, 2, 2, 3]
 Output: [1, 2]

 Explanation:
 n = 8
 n/3 = 2
 Elements appearing more than 2 times are 1 and 2.
*/

import java.util.*;

public class Q67_MajorityElementNby3 {

    public static List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Check which elements appear more than n/3 times
        List<Integer> result = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                result.add(key);
            }
        }

        // Step 3: Sort result
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
