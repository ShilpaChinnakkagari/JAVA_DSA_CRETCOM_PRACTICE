class ArraYs_TotalOccurr {

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

    static int lastOccurrence(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {

            int rightAnswer = lastOccurrence(arr, mid + 1, right, target);

            if (rightAnswer == -1) {
                return mid;
            }

            return rightAnswer;
        }

        if (arr[mid] > target) {
            return lastOccurrence(arr, left, mid - 1, target);
        }

        return lastOccurrence(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 6, 6, 8, 10};
        int target = 6;

        int first = firstOccurrence(arr, 0, arr.length - 1, target);
        int last = lastOccurrence(arr, 0, arr.length - 1, target);

        int count;

        if (first == -1) {
            count = 0;
        } else {
            count = last - first + 1;
        }

        System.out.println("Total occurrences = " + count);
    }
}