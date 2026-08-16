class ArraYs_FirstOccurBS {

    static int firstOccurrence(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {

            int leftAnswer = firstOccurrence(arr, left, mid - 1, target);

            if (leftAnswer == -1) {
                return mid;
            }

            return leftAnswer;
        }

        if (arr[mid] > target) {
            return firstOccurrence(arr, left, mid - 1, target);
        }

        return firstOccurrence(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 6, 6, 8, 10};
        int target = 6;

        int result = firstOccurrence(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }
}