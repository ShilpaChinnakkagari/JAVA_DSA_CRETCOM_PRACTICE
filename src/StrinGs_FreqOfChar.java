import java.util.*;

public class StrinGs_FreqOfChar {

    static void freq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character key : map.keySet() ){
            System.out.print("Char : " + key + "\nFreq: "+ map.get(key)+"\n\n");
        }
    }

    public static void main(String[] args) {

        String str = "asdfasdfazsdfgh";

        freq(str);
    }
}