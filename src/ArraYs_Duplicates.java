import java.lang.reflect.Array;
import java.util.*;
public class ArraYs_Duplicates {
    static ArrayList<Integer> duplicates(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x: arr){
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int key : map.keySet()){
            if(map.get(key) > 1){ //  gets val w.r.t key
                arrayList.add(key);
            }
        }
        return arrayList;
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

        ArrayList<Integer> arrayList = duplicates(arr);


        System.out.print("From array List (traversal of each element):");
        for(int num: arrayList){
            System.out.print(num + " ");
        }
        System.out.println("");

        //array format
        int[] arrFmt = new int[arrayList.size()];

        for(int i = 0; i < arrayList.size(); i++){
            arrFmt[i] = arrayList.get(i);
        }

        System.out.print("From array List :");
        System.out.println(arrayList); // 1D // why direct content not address like arrays (doubt.)
        System.out.print("");

        System.out.print("From arrays to array List :");
        System.out.println(Arrays.toString(arrFmt)); // 1D
        // System.out.println(Arrays.deepToString(countFreq(arr))); // 2D
    }
}
