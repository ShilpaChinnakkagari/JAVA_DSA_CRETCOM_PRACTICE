
import java.util.*;

public class StrinGs_ReverseEachWord {

    static void revEachword(String word) {
        StringBuilder wordRev = new StringBuilder();
        for(int i= word.length()-1 ; i>=0 ; i--){
            char ch = word.charAt(i);
            wordRev.append(ch);
        }
        System.out.print(wordRev+" ");
    }

    static void reverseWordByWord(String str){
        String[] words = str.split(" ");
        for(String st : words){
            revEachword(st);
        }
    }



    public static void main(String[] args) {

        String str = "Shilpa Is A Good Girl";

        reverseWordByWord(str);
    }
}