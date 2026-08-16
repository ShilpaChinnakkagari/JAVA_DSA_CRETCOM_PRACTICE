//import java.util.*;
//
//public class StrinGs_FreqMinChar {
//
//    static void minFreq(String str) {
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        int min = 100;
//        Character minChar = null;
//
//        for(int i=0; i<str.length(); i++)
//        {
//            Character ch = str.charAt(i);
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }
//
//        for(Character key : map.keySet() ){
//            int freq = map.get(key);
//
//            if(freq < min){
//                min = freq;
//                minChar = key;
//            }
//        }
//
//        System.out.print(minChar + " " + min);
//    }
//
//    public static void main(String[] args) {
//
//        String str = "aasdfasssssdfasdfghz";
//
//        minFreq(str);
//    }
//}
//

import java.util.*;

public class StrinGs_FreqMinChar {

    static HashMap<Character,Integer> freq(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<str.length(); i++)
        {
            Character ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;

    }


    static void minFreq(HashMap<Character,Integer> map){

        int min = 100;
        Character minChar = null;

        for(Character key : map.keySet() ){
            int freq = map.get(key);

            if(freq < min){
                min = freq;
                minChar = key;
            }
        }

        System.out.print(minChar + " " + min);
    }


    public static void main(String[] args) {

        String str = "aasdfasssssdfasdfghz";
        HashMap<Character,Integer> map = freq(str);

        minFreq(map);
    }
}