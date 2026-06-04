//import java.util.*;
//public class TargetFreq {
//    public static ArrayList<ArrayList<Integer>> countFreq(int[] nums, int k){
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num,0)+1);
//        }
//
//        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
//
//        for(int key : map.keySet()){
//            if(map.get(key)> k) {
//                results.add(Arrays.asList(key, map.get(key)));
//            }
//        }
//        return results;
//
//    }
//
//    public static void main(String[] args){
//        int[] nums = {1,2,2,2,3,3,4,5};
//        System.out.print("Freq: "+  countFreq(nums,2));
//
//
//    }
//}