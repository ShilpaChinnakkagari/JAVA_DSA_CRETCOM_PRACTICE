import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Q2_PairEq2 {

    public static List<List<Integer>> pairEqK(int[] arr, int k) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k) {

                    int a = Math.min(arr[i], arr[j]);
                    int b = Math.max(arr[i], arr[j]);
                    String key = a + "," + b;

                    if (!seen.contains(key)) {
                        seen.add(key);
                        List<Integer> pair = new ArrayList<>();
                        pair.add(a);
                        pair.add(b);
                        res.add(pair);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 6;
        System.out.print(pairEqK(arr, k));
    }
}
