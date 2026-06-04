// I. Second Largest Element in ArrayList
// II. Third Largest Element in ArrayList
// III. nth Largest Element in ArrayList
//+++++++++++++++++++++++++++++++++++++++++++++

// I. Second Largest Element in ArrayList
//public class Q40_SecondLargestElement {
//    public static int func(int arr[]) {
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        //int max3 = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                //max3 = max2;
//                max2 = max1;
//                max1 = arr[i];
//            }
//
//            else if (arr[i] > max2 && arr[i] != max1) {
//                //max3 = max2;
//                //max3 = arr[i];
//                max2 = arr[i];
//            }
//            // else if (arr[i] > max3 && arr[i] != max2 && arr[i] != max1) {
//            //     max3 = arr[i];
//            // }
//        }
//        return max2;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,4,4,1};
//        System.out.println(func(arr));
//    }
//}

// Question to self : arr[i] != max1 ===> Is this mandatory??
/*
x != max1 ensures we find the second largest distinct element and don’t count the maximum value twice.
 */
//==================================================================================
// II. Third largest element in the ArrayList

// we have two appraoches

// Approach - 1 (Simple start loop from i=1)
//public class Q40_SecondLargestElement {
//    public static int func(int arr[]) {
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        //int max3 = Integer.MIN_VALUE;
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                //max3 = max2;
//                max2 = max1;
//                max1 = arr[i];
//            }
//
//            else if (arr[i] > max2 && arr[i] != max1) {
//                //max3 = max2;
//                //max3 = arr[i];
//                max2 = arr[i];
//            }
//            // else if (arr[i] > max3 && arr[i] != max2 && arr[i] != max1) {
//            //     max3 = arr[i];
//            // }
//        }
//        return max2;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {5,4,4,1};
//        System.out.println(func(arr));
//    }
//}

//Approach 2
//public class Q40_SecondLargestElement {
//
//    public static int thirdLargest(int[] arr) {
//
//        int max1 = Integer.MIN_VALUE;
//        int max2 = Integer.MIN_VALUE;
//        int max3 = Integer.MIN_VALUE;
//
//        for (int x : arr) {
//
//            if (x > max1) {
//                max3 = max2;
//                max2 = max1;
//                max1 = x;
//            }
//            else if (x > max2 && x != max1) {
//                max3 = max2;
//                max2 = x;
//            }
//            else if (x > max3 && x != max2 && x != max1) {
//                max3 = x;
//            }
//        }
//
//        return max3;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {5, 4, 4, 1, 6, 3};
//        System.out.println(thirdLargest(arr)); // 4
//    }
//}

//==================================================================================
// III. nth Largest Element in ArrayList
//import java.util.*;
//
//public class Q40_SecondLargestElement {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list =
//                new ArrayList<>(Arrays.asList(5, 4, 4, 1, 6, 3));
//
//        int n = 3; // 3rd largest
//
//        HashSet<Integer> set = new HashSet<>(list);      // remove duplicates
//        ArrayList<Integer> unique = new ArrayList<>(set); // convert back to ArrayList
//
//        Collections.sort(unique); // ascending
//
//        int nthLargest = unique.get(unique.size() - n);
//
//        System.out.println(nthLargest);
//    }
//}
//==================================================================================