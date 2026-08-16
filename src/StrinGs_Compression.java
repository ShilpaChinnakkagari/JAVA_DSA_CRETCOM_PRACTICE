import java.util.*;

public class StrinGs_Compression {

    static LinkedHashMap<Character, Integer> freq(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    static void printFreq(LinkedHashMap<Character, Integer> map) {

        for (Character key : map.keySet()) {
            System.out.print(key + "" + map.get(key));
        }
    }

    public static void main(String[] args) {

        String str = "aaabbcca";

        LinkedHashMap<Character, Integer> map = freq(str);

        printFreq(map);
    }
}