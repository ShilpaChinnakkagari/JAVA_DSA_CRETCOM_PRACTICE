import java.util.Scanner;
//
//public class ArraYs_RotatekPosLft {
//    static void rotateLeft(int[] arr)
//    {
//        int n = arr.length; // we can calculate length like this also, if we do not want to pass 'n' explicitly
//        // 10 20 30 40 50
//        //Rotate Array by 1 Pos Left
//        // 20 30 40 50 10
//
//        // Step 1 : Copy the next element to the current element (towards left)
//        // Instance : for arr[0] <-- copy arr[i]...., arr[1]<--arr[2]....,
//
//        // Step 2 : Replace last element with the first element
//        // As a part, store first element in the temp vble.
//
//        int temp = arr[0];
//
//        for(int i=0;i<(n-1); i++){ // why upto (n-2), if array length = 6, we have index range from 0 to 5
//            arr[i] = arr[i+1];     // we cannot replace arr[5] with no upcoming element
//        }
//        arr[n-1] = temp;
//    }
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//
//        System.out.print("Enter size of array: ");
//        int n = obj.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.print("Enter elements now: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = obj.nextInt();
//        }
//
//        System.out.println("Enter K pos to rotate to Left :");
//        int k = obj.nextInt();
//        k = k % n;
//
//        //call that many times to rotate left by k pos
//        for(int i=1; i<=k ; i++){
//            rotateLeft(arr);
//        }
//
//        System.out.println("Array after being Rotated by "+ k +" Pos Left :");
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        obj.close();
//    }
//}
//Time  : O(nk)
//Space : O(1)

// Optimized Approach
public class ArraYs_RotatekPosLft {
    //swap elements by array reference, values swap does not work
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //func to reverse by 2 pointer approach
    static void reverseFunc(int[] arr, int start, int end){
        int len = end - start + 1;

        for(int i = 0; i < len / 2; i++){
            swap(arr, start + i, end - i);
        }
    }

    static void rotateLeft(int[] arr, int k){
        int n = arr.length;

        k = k % n;

        reverseFunc(arr, 0, k - 1);
        reverseFunc(arr, k, n - 1);
        reverseFunc(arr, 0, n - 1);
    }
    public static void main(String[] args) {

            Scanner obj = new Scanner(System.in);

            System.out.print("Enter size: ");
            int n = obj.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter elements: ");
            for(int i = 0; i < n; i++){
                arr[i] = obj.nextInt();
            }

            System.out.print("Enter k: ");
            int k = obj.nextInt();

            rotateLeft(arr, k);

            System.out.println("Array after rotation by " +k+ " Positions Left");

            for(int x : arr){
                System.out.print(x + " ");
            }

            obj.close();
    }
}

//        Time  : O(n)
//        Space : O(1)


