import java.util.Scanner;
public class ArraYs_ReverseTwoPointer {

    //swap elements by array reference, values swap does not work
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //func to reverse by 2 pointer approach
    static void reverseFunc(int[] arr, int n){
        int mid = n/2;
        for(int i=0; i<mid;i++){
            swap(arr, i, (n-i-1));
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements now: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        reverseFunc(arr, n);

        System.out.println("Array after being Reveresed :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}
