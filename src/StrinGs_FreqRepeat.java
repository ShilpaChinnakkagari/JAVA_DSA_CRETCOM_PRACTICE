import java.util.*;

public class StrinGs_FreqRepeat {

    static LinkedHashMap<Character, Integer> freq(String str) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }

    static Character firstRepeat(LinkedHashMap<Character, Integer> map) {

        for (Character key : map.keySet()) {

            int freq = map.get(key);

            if (freq > 1) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        String str = "aasdfasssssdfasdfghz";

        LinkedHashMap<Character, Integer> map = freq(str);

        System.out.print(firstRepeat(map));
    }
}