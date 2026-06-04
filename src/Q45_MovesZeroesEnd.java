/*
 * Problem: Move Zeros to End
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums, move all the 0's to the end of the array.
 * The relative order of the other elements must remain the same.
 *
 * Constraints:
 * - Must be done in-place, without making a copy of the array.
 *
 * Example 1:
 * Input:  nums = [0, 1, 4, 0, 5, 2]
 * Output: [1, 4, 5, 2, 0, 0]
 * Explanation: Both zeroes are moved to the end and the order of the other elements stays the same.
 *
 * Example 2:
 * Input:  nums = [0, 0, 0, 1, 3, -2]
 * Output: [1, 3, -2, 0, 0, 0]
 * Explanation: All three zeroes are moved to the end and the order of the other elements stays the same.
 */


/*
ALGORITHM =>

Step 1: Iterate through the array from start to end.

Step 2: Whenever a '0' is found at index i:
        a) Store arr[i] in a temporary variable (tmp).
        b) Shift all elements to the left starting from index i:
           for each j from i to n-1, set arr[j] = arr[j+1].
        c) Place the stored tmp value at the end of the current effective array.

Step 3: After shifting:
        a) Decrement i to recheck the current index, because a new element has come to index i.
        b) Decrement n (effective array size) by 1, because the last element is now a zero.

Step 4: Repeat Steps 1-3 until the end of the effective array is reached.

Step 5: The array now has all zeros moved to the end, and non-zero elements
        maintain their relative order.

TIME COMPLEXITY: O(n^2) in worst case (many zeros at start)
SPACE COMPLEXITY: O(1) (in-place)
*/

// Appraoch - 2
// Move zeroes to end
/*
Ex: [1,2,0,0,1,0]
output : [1,2,1,0,0,0]
*/

//class Q45_MovesZeroesEnd {
//
//    static void zeroesend(int[] arr) {
//        int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                int tmp = arr[i];
//                // shift elements left
//                for (int j = i; j < n - 1; j++) {
//                    arr[j] = arr[j + 1];
//                }
//                // put zero at the end
//                arr[n - 1] = tmp;
//                i--;// recheck same index as new element arrived at this i
//                n--; // reduce effective size as last indexes are placed with fixed values
//            }
//        }
//    }
//
//    public static void main(String args[]) {
//        int[] arr = {0, 0, 1, -2,0, 3};
//        zeroesend(arr);
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//    }
//}

public class Q45_MovesZeroesEnd{
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void moveZeroesEnd(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                swap(arr, i, n-1);
                i--;
                n--;
            }
        }
    }

    public static void main(String args[]){
        //int[] arr = {0,2,0,1,4};
        int[] arr = {1,2,0,0,1,0};
        moveZeroesEnd(arr);
        for(int x: arr){
            System.out.print(x+ " ");
        }
    }
}

// for Lists
// Move zeroes to end
/*
Ex: [1,2,0,0,1,0]
output : [1,2,1,0,0,0]
*/
/*
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Q45_MovesZeroesEnd{
    public static void swap(List<Integer> lst,int i , int j){
        int temp = lst.get(i);
        lst.set(i,lst.get(j));
        lst.set(j, temp);
    }

    public static void moveZeroesEnd(List<Integer> lst){
        int n = lst.size();
        for(int i=0;i<n;i++){
            if(lst.get(i)==0){
                swap(lst, i, n-1);
                i--;
                n--;
            }
        }
    }

    public static void main(String args[]){
        //int[] arr = {0,2,0,1,4};
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,2,0,0,1,0)) ;
        int n = lst.size();

        moveZeroesEnd(lst);

        for(int i=0;i<n;i++){
            System.out.print(lst.get(i)+ " ");
        }
    }
}
*/