import java.util.*;

public class ArraYs_CountFreq {
    static int[][] countFreq(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // why wrapper cls?

        for(int x : arr){
            map.put(x, map.getOrDefault(x ,0) + 1); // we keep key + val (if pres - get it, or else put 0)
        }


        int[][] res = new int[map.size()][2]; // to return num + freq

        int i = 0;
        for(int key : map.keySet()){ // traverse hashmap
            res[i][0] = key;          // number
            res[i][1] = map.get(key); // frequency
            i++;
        }
        return res;
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

       //  System.out.println("Freq of elements in the array: " + countFreq(arr)); // we get obj reference
        //Arrays are objects, and since they don't override toString(),
        // System.out.println(array) prints the default object representation (type@hashcode) instead of the array contents.

        // Manual print by traversal method
        int[][] res = countFreq(arr);

        for(int i = 0; i < res.length; i++){
            System.out.println(res[i][0] + " -> " + res[i][1]);
        }

        //inbuilt metd
        System.out.println(Arrays.deepToString(countFreq(arr)));

    }
}
