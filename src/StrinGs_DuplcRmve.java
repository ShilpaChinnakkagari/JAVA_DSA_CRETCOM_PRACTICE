import java.util.*;

public class StrinGs_DuplcRmve {

    static LinkedHashMap<Character,Integer> freq(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;

    }


    static void removeDuplc(LinkedHashMap<Character,Integer> map){
        StringBuilder sb = new StringBuilder();

        for(Character key : map.keySet() ){
            if(map.get(key) < 2 ){
                sb.append(key);
            }
        }
        System.out.print(sb);
    }


    public static void main(String[] args) {

        String str = "asdffdsahjklioppqqknc";
        LinkedHashMap<Character,Integer> map = freq(str);

        removeDuplc(map);
    }
}