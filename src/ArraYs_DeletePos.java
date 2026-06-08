import java.util.Scanner;

class ArraYs_DeletePos {
    public static int deleteFunc(int[] arr, int n, int pos){
        if(pos < 1 || pos > n + 1){
            System.out.println("Invalid Position");
            return n;
        }
        for(int i=(pos-1); i<(n-1) ; i++){
            arr[i] = arr[i+1];
        }

        return n-1;
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n]; // extra space for insertion

        System.out.print("Enter elements now: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.print("Enter position to delete: ");
        int pos = obj.nextInt();

        n = deleteFunc(arr, n, pos);

        System.out.println("Array after Deletion :");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}