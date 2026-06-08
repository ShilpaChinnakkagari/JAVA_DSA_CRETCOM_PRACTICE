import java.util.Scanner;

public class ArraYs_LinearSearch {

    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;   // Return index if found
            }
        }
        return -1;          // Not found
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = obj.nextInt();

        int index = linearSearch(arr, target);

        if(index != -1)
            System.out.println("Element found at pos : " + (index+1));
        else
            System.out.println("Element not found");
    }
}