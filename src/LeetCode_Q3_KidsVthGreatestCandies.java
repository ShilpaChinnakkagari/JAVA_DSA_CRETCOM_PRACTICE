import java.util.*;

public class LeetCode_Q3_KidsVthGreatestCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();

        // Q: What are we trying to find?
        // A: For each kid, we want to know if giving them all extraCandies
        //    will make them have the greatest number of candies among all kids.

        // Step 1: Find the current maximum candies any kid has
        int maxCandies = 0;
        for (int c : candies) {
            if (c > maxCandies) {
                maxCandies = c;
            }
        }

        // Step 2: For each kid, check if giving all extraCandies makes them >= maxCandies
        for (int c : candies) {
            if (c + extraCandies >= maxCandies) {
                result.add(true);   // This kid can have the most candies
            } else {
                result.add(false);  // This kid cannot reach the maximum
            }
        }

        // Step 3: Return the list of boolean results
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] candies1 = {2,3,5,1,3};
        int extra1 = 3;
        // Output explanation:
        // Kid1: 2+3=5 ✅ max, true
        // Kid2: 3+3=6 ✅ max, true
        // Kid3: 5+3=8 ✅ max, true
        // Kid4: 1+3=4 ❌ less than max, false
        // Kid5: 3+3=6 ✅ max, true
        System.out.println(kidsWithCandies(candies1, extra1)); // [true, true, true, false, true]

        // Example 2
        int[] candies2 = {4,2,1,1,2};
        int extra2 = 1;
        // Only Kid1 can reach or exceed max = 4
        System.out.println(kidsWithCandies(candies2, extra2)); // [true, false, false, false, false]

        // Example 3
        int[] candies3 = {12,1,12};
        int extra3 = 10;
        System.out.println(kidsWithCandies(candies3, extra3)); // [true, false, true]
    }
}
