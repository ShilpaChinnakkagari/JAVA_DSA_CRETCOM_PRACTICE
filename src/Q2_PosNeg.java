import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q2_PosNeg {
    public static List<List<Integer>> evenOrOdd(ArrayList<Integer> lst){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<lst.size() ; i++){
            if(lst.get(i)>0){
                pos.add(lst.get(i));
            }
            else{
                neg.add(lst.get(i));
            }
        }


        List<List<Integer>> allLists = new ArrayList<>();
        allLists.add(pos);
        allLists.add(neg);

        return allLists;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,-2,-3,4));
        System.out.print(evenOrOdd(lst));
    }
}
