import java.util.Scanner;

public class ArraYs_Rotate1PosRght {
    static void rotateRightt(int[] arr)
    {
        int n = arr.length; // we can calculate length like this also, if we do not want to pass 'n' explicitly
        // 10 20 30 40 50
        //Rotate Array by 1 Pos Right
        // 50 10 20 30 40

        // Step 1 : Copy the prev element to the current element
        // Instance : for arr[n-1] <-- copy arr[n-2]...., arr[5]<--arr[4]....,

        // Step 2 : Replace first element with the last element
        // As a part, store last element in the temp vble.

        int temp = arr[n-1];

        for(int i=(n-1);i>0 ; i--){ // why from (n-1), if array length = 6, we have index range from 0 to 5
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
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

        rotateRightt(arr);

        System.out.println("Array after being Rotated by 1 Pos Right :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}
