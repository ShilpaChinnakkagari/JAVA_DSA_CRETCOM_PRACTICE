import java.util.Scanner;

public class ArraYs_RotatekPosRght {
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

        reverseFunc(arr, 0, n - 1);
        reverseFunc(arr, 0, k - 1);
        reverseFunc(arr, k, n - 1);

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