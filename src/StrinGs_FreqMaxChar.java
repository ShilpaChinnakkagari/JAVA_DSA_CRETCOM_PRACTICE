import java.util.*;

public class StrinGs_FreqMaxChar {

    static void maxFreq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        Character maxChar = null;

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Character key : map.keySet() ){
            int freq = map.get(key);

            if(freq > max){
                max = freq;
                maxChar = key;
            }
        }

        System.out.print(maxChar + " " + max);
    }

    public static void main(String[] args) {

        String str = "aasdfasssssdfazsdfgh";

        maxFreq(str);
    }
}