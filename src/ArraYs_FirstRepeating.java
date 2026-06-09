import java.util.HashSet;
import java.util.Scanner;

public class ArraYs_FirstRepeating {

    static int firstRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int answer = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                answer = arr[i];
            } else {
                set.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        System.out.println("First Repeating Element: " + firstRepeating(arr));
    }
}