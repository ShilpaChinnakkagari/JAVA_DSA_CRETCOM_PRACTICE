import java.util.*;

/*
 PROBLEM:
 --------
 Given an integer array nums.
 Return all unique triplets [nums[i], nums[j], nums[k]] such that:
 nums[i] + nums[j] + nums[k] == 0

 CONDITIONS:
 - i, j, k must be different indices
 - No duplicate triplets allowed
 - Order of output does not matter

 APPROACH (Two Sum Extension):
 ----------------------------
 1. Fix one element nums[i]
 2. Use HashSet to find pairs with sum = -nums[i]
 3. Use a Set to avoid duplicate triplets
*/

//public class Q68_ThreeSum {
//
//    public static List<List<Integer>> threeSum(int[] nums) {
//
//        // To avoid duplicate triplets
//        Set<List<Integer>> resultSet = new HashSet<>();
//
//        int n = nums.length;
//
//        for (int i = 0; i < n; i++) {
//
//            HashSet<Integer> seen = new HashSet<>();
//
//            for (int j = i + 1; j < n; j++) {
//
//                int third = -nums[i] - nums[j];
//
//                // If third element is already seen, we found a triplet
//                if (seen.contains(third)) {
//
//                    List<Integer> triplet =
//                            Arrays.asList(nums[i], nums[j], third);
//
//                    // Sort triplet to avoid duplicates like [-1,0,1] & [0,-1,1]
//                    Collections.sort(triplet);
//
//                    resultSet.add(triplet);
//                }
//
//                seen.add(nums[j]);
//            }
//        }
//
//        // Convert set to list
//        return new ArrayList<>(resultSet);
//    }
//
//    public static void main(String[] args) {
//
//        int[] nums = {2, -1, -1, 3, -1};
//
//        System.out.println(threeSum(nums)); // Output: []
//    }
//}


import java.util.*;

public class Q68_ThreeSum {

    public static List<List<Integer>> triplet(int n, List<Integer> num) {

        // Using Set to avoid duplicate triplets
        Set<List<Integer>> st = new HashSet<>();

        // Triple nested loop like C++ code
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (num.get(i) + num.get(j) + num.get(k) == 0) {
                        // Create a triplet
                        List<Integer> temp = Arrays.asList(num.get(i), num.get(j), num.get(k));
                        // Sort the triplet to avoid duplicates like [-1,0,1] & [0,-1,1]
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }

        // Convert Set to List
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2, -2, 0, 3, -3, 5);
        List<List<Integer>> res = triplet(nums.size(), nums);
        System.out.println(res);
    }
}
