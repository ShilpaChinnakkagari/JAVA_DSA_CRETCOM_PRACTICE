import java.util.*;

public class ArraYs_FirstRepeating {
    static int firstrepeat(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                return arr[i]; // first repeating
            }
            set.add(arr[i]);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("First Repeating Element: " + firstrepeat(arr));
    }
}
