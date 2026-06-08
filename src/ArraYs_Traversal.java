// 1. Create an integer array of size 5. Insert 5 elements and print it.
// 2. Traverse the array using a standard for loop.
// 3. Traverse the array using enhanced for loop.

public class ArraYs_Traversal {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Using standard for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nUsing enhanced for loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}