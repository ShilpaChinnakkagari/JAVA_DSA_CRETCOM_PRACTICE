import java.util.Scanner;

public class ArraYs_Resize {
    public static int[] resizeArray(int[] arr, int newSize) {
        //resize array
        int[] newArr = new int[newSize];

        //copy back elements to the new array
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        //return array of int elements to display and it stores in an array format
        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // call method to resize array (method: resizeArray(...), given array and size)
        arr = resizeArray(arr, 10);


        // once resized, display the length of array
        System.out.println("New Size: " + arr.length);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
