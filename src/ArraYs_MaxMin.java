import java.util.Scanner;

class ArraYs_MaxMin{
    static int max_func(int[] arr){
        //int n = arr.length;
        int max = Integer.MIN_VALUE;

        for(int x : arr){
            if(x > max){
                max = x;
            }
        }
        return max;
    }

    static int min_func(int[] arr){
        //int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int x : arr){
            if(x < min){
                min = x;
            }
        }
        return min;
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

        System.out.println("Max of all Elements: " + max_func(arr));
        System.out.println("Min of all Elements: " + min_func(arr));
    }
}