// Problem: Maximum Consecutive 1s in a Binary Array
// Given a binary array nums, return the maximum number of consecutive 1s in the array.
// A binary array is an array that contains only 0s and 1s.

// Example 1:
// Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]
// Output: 3
// Explanation: The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s

// Example 2:
// Input: nums = [0, 0, 0, 0, 0, 0, 0, 0]
// Output: 0
// Explanation: No 1s are present in nums, thus we return 0

// Your turn!
// Input: nums = [1, 0, 1, 1, 1, 0, 1, 1, 1]
// Output: ?
// Options:
// 1
// 3
// 4
// 7

// Constraints:
// 1 <= nums.length <= 105
// nums[i] is either 0 or 1


// Frequently Occurring Doubts:
// Q1: What is the time complexity, and can it be optimized further?
// Q2: How does the algorithm handle arrays with alternating 1s and 0s?

// Interview Follow-ups:
// 1. How would you modify the algorithm to return the indices of the maximum segment of consecutive 1s?
// 2. How would you handle a streaming input (data arriving one bit at a time)?


public class Q49_MaxConsOnes {

        static void func(int[] arr) {
            int i,j;
            int count=0;
            int max =0;
            int n = arr.length;
            for(i=0;i<n;i++){
                if(arr[i]==1){
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                else{
                    count=0;
                }
            }
            System.out.println(max);
        }
        public static void main(String args[]) {
            int[] a1 = {1,1,0,1,1,1,1,0};
            func(a1);

            for (int a : a1) {
                System.out.print(a + " ");
            }
            System.out.println();

        }
}

/*
Time Complexity  : O(n)
Space Complexity : O(1)
*/