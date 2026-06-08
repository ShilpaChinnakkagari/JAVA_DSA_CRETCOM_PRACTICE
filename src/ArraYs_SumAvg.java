import java.util.Scanner;

public class ArraYs_SumAvg {
    static int sum(int[] arr){
        int sum=0;
        for(int x: arr){
            sum += x;
        }
        return sum;
    }

    static double avg_func(int[] arr, int sum){
        int n = arr.length;
        double avg = sum/n;
        return avg;
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

        int total = sum(arr);
        System.out.println("The Sum of all elements in the array : " + total);

        double avg = avg_func(arr, total);
        System.out.println("The avg of array elements: "+ avg);
    }

}
