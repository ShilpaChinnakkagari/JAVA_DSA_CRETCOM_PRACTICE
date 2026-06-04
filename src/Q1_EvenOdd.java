import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1_EvenOdd {
    public static List<List<Integer>> evenOrOdd(ArrayList<Integer> lst){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<lst.size() ; i++){
            if(lst.get(i)%2==0){
                even.add(lst.get(i));
            }
            else{
                odd.add(lst.get(i));
            }
        }


        List<List<Integer>> allLists = new ArrayList<>();
        allLists.add(even);
        allLists.add(odd);

        return allLists;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.print(evenOrOdd(lst));
    }
}
