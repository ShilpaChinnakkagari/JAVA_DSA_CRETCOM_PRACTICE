// I. Rotate by 1 D
// II. Rotate by n D

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Q44_RotateArrayByD {
    public static List<Integer> rotateBy1(List<Integer> lst){
        int n = lst.size();

        int tmp = lst.get(0);
        for(int i= 0 ; i< (n-1) ; i++){
            lst.set(i,lst.get(i+1));
        }
        lst.set(n-1,tmp);
        //lst.set(0,lst.get(n-1));
        return lst;
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(10,20,30,40));
        //System.out.print(rotateBy1(lst));
        int n = 3;
        List<Integer> val= new ArrayList<>();
        for(int i=0;i<n;i++){
            val = rotateBy1(lst);
            System.out.print(val);
        }
    }
}
