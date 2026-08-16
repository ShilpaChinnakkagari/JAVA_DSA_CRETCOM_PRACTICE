import java.util.Scanner;

class ArraYs_2ndMaxElement {

    public static void secMax(int[] arr, int n){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int x: arr){
            if(x > max1){
                max2 = max1;
                max1 = x;
            }
            else if (x > max2 && x != max1) {
                max2 = x;
            }
        }

        System.out.println(max2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        secMax(arr, n);
    }
}