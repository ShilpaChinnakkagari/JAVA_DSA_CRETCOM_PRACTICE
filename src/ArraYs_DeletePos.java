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
//
//import java.util.Scanner;
//
//class Main {
//
//    public static void deletePos(int[] arr, int n, int pos){
//
//        for(int i=pos; i<(n-1) ; i++){
//            arr[i] = arr[i+1];
//        }
//
//
//        for(int i=0; i<(n-1); i++){
//            System.out.print(arr[i]+ " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter pos to delete ");
//        int pos = sc.nextInt();
//
//        deletePos(arr, n, pos-1);
//    }
//}