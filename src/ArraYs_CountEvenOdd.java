import java.util.Scanner;

public class ArraYs_CountEvenOdd {
    static String count(int[] arr){
        int count_even = 0, count_odd = 0; //0 even
        for(int x : arr){
            if(x%2 == 0){
                ++count_even;
            }
            else{
                ++count_odd;
            }
        }
//        System.out.println("Total Odd Nos: " + count_odd);
//        System.out.println("Total Even Nos: " + count_even);
        return "Odd Count: " + count_odd + " " + "\nEven Count "+ count_even;
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

        System.out.println(count(arr));
    }
}
