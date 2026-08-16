import java.util.Scanner;

class ArraYs_ReverseArr {

    public static void reverseArr(int[] arr, int n){
        int arrCpy[] = new int[n];
        int index=0;
        for(int i=(n-1); i>=0 ; i--){
            arrCpy[index] = arr[i];
            index++;
        }


        for(int i=0; i<n; i++){
            System.out.print(arrCpy[i]+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArr(arr, n);
    }
}