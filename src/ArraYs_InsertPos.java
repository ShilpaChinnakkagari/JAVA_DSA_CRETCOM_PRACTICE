import java.util.Scanner;

class ArraYs_InsertPos {
    public static int insertFunc(int[] arr, int n, int pos, int val){
        if(pos < 1 || pos > n + 1){
            System.out.println("Invalid Position");
            return n;
        }
        for(int i=n; i>=pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = val;
        return n+1;
    }
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n + 1]; // extra space for insertion

        System.out.print("Enter elements now: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.print("Enter position to insert: ");
        int pos = obj.nextInt();

        System.out.print("Enter value: ");
        int val = obj.nextInt();

        n = insertFunc(arr, n, pos, val);

        System.out.println("Array after insertion:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        obj.close();
    }
}

//import java.util.Scanner;
//
//class Main {
//
//    public static void insertPos(int[] arr, int n, int pos, int no){
//
//        for(int i=n; i>pos ; i--){
//            arr[i] = arr[i-1];
//        }
//        arr[pos] = no;
//
//        for(int x: arr){
//            System.out.print(x+ " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n+1];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n ; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter pos to insert ");
//        int pos = sc.nextInt();
//
//        System.out.println("Enter element to isnert: ");
//        int no = sc.nextInt();
//
//        insertPos(arr, n, pos-1, no);
//    }
//}