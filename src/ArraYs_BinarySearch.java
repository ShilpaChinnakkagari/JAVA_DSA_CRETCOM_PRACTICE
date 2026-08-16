public class ArraYs_BinarySearch {

    static int binarySearch(int[] arr, int left, int right, int target) {

        if(left > right){
            return -1;
        }

        int mid = left + (right- left)/2;

        if(arr[mid]==target){
            return mid;
        }

        else if(arr[mid] > target){
            return binarySearch(arr, left, mid-1, target);
        }

        else{
            return binarySearch(arr, mid+1, right, target);
        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");
    }
}


//public class ArraYs_BinarySearch {
//     static int binarySearch(int[] arr, int target) {
//            int left = 0;
//            int right = arr.length - 1;
//
//            while (left <= right) {
//                int mid = left + (right - left) / 2;
//
//                if (arr[mid] == target) {
//                    return mid;
//                }
//                else if (arr[mid] < target) {
//                    left = mid + 1;
//                }
//                else {
//                    right = mid - 1;
//                }
//            }
//
//            return -1;
//        }
//
//        public static void main(String[] args) {
//
//            int[] arr = {2, 4, 6, 8, 10, 12, 14};
//            int target = 10;
//
//            int result = binarySearch(arr, target);
//
//            if (result != -1)
//                System.out.println("Element found at index " + result);
//            else
//                System.out.println("Element not found");
//        }
//    }
//}
