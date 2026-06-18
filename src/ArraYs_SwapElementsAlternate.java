import java.util.Scanner;

public class ArraYs_SwapElementsAlternate {
    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void swap(int[] arr, int n){
        for(int i=0 ; i<= (n-2); i+=2){
            swap(arr, i, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Array elements one by one : " );
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        swap(arr, n);

        for(int x: arr){
            System.out.print(x + " ");
        }
    }
}
