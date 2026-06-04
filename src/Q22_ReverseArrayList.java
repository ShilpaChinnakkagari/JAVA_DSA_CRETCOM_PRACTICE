import java.util.ArrayList;
import java.util.Arrays;


public class Q22_ReverseArrayList {
    public static void swap(ArrayList<Integer> l1, int i, int j){
        int temp = l1.get(i);
        l1.set(i, l1.get(j));
        l1.set(j, temp);
    }
    public static void reverseList(ArrayList<Integer> l1){
        int n = l1.size();
        for(int i=0;i<n/2;i++){
            swap(l1,i,n-1-i);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        reverseList(l1);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
    }
}