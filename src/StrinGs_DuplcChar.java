import java.util.*;

public class StrinGs_DuplcChar {

    static HashMap<Character,Integer> freq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;

    }


    static void printDuplc(HashMap<Character,Integer> map){

        for(Character key : map.keySet() ){
            if(map.get(key) > 1 ){
                System.out.print(key + " ");
            }
        }
    }


    public static void main(String[] args) {

        String str = "asdffdsahjklioppqq";
        HashMap<Character,Integer> map = freq(str);

        printDuplc(map);
    }
}