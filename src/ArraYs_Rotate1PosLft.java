import java.util.Scanner;

public class ArraYs_Rotate1PosLft {
    static void rotateLeft(int[] arr)
    {
        int n = arr.length; // we can calculate length like this also, if we do not want to pass 'n' explicitly
        // 10 20 30 40 50
        //Rotate Array by 1 Pos Left
        // 20 30 40 50 10

        // Step 1 : Copy the next element to the current element (towards left)
        // Instance : for arr[0] <-- copy arr[i]...., arr[1]<--arr[2]....,

        // Step 2 : Replace last element with the first element
        // As a part, store first element in the temp vble.

        int temp = arr[0];

        for(int i=0;i<(n-1); i++){ // why upto (n-2), if array length = 6, we have index range from 0 to 5
            arr[i] = arr[i+1];     // we cannot replace arr[5] with no upcoming element
        }
        arr[n-1] = temp;
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

        rotateLeft(arr);

        System.out.println("Array after being Rotated by 1 Pos Left :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}
