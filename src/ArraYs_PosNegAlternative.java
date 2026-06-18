//import java.util.ArrayList;
//import java.util.Scanner;

//public class ArraYs_PosNegAlternative {
//
//    static int[] arrangePosNeg(int[] arr, int n){
//        int[] res = new int[n];
//
//        int pos=0;
//        int neg=1;
//
//        for(int i=0; i< n ; i++){
//            if(arr[i]>=0) {
//                res[pos] = arr[i];
//                pos = pos + 2;
//            }
//            else {
//                res[neg] = arr[i];
//                neg = neg + 2;
//            }
//        }
//        return res;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        System.out.print("Enter Array elements one by one : " );
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//
//
//        for(int x: arr){
//            System.out.print(x + " ");
//        }
//
//        int[] res = new int[n];
//        res = arrangePosNeg(arr,n);
//        System.out.println("The Output Array: ");
//        for(int x : res){
//            System.out.print(x+" ");
//        }
//    }
//}

// The above method works for equal set of pos and neg numbers and as a part we will go for ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class ArraYs_PosNegAlternative {

    static int[] arrangePosNeg(int[] arr, int n) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Store positives and negatives separately
        for (int x : arr) {
            if (x >= 0)
                pos.add(x);
            else
                neg.add(x);
        }

        int[] res = new int[n];

        int i = 0;      // index for result array
        int p = 0;      // index for positive list
        int ne = 0;     // index for negative list

        // Place elements alternately
        while (p < pos.size() && ne < neg.size()) {
            res[i++] = pos.get(p++);
            res[i++] = neg.get(ne++);
        }

        // Add remaining positive elements
        while (p < pos.size()) {
            res[i++] = pos.get(p++);
        }

        // Add remaining negative elements
        while (ne < neg.size()) {
            res[i++] = neg.get(ne++);
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = arrangePosNeg(arr, n);

        System.out.println("Result:");

        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}