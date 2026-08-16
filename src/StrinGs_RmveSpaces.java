import java.util.*;

public class StrinGs_RmveSpaces {

    static void remove(String str) {
        StringBuilder str2 = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if( !Character.isWhitespace(ch) )
            {
                str2.append(ch);
            }
        }
        System.out.print(str2);
    }

    public static void main(String[] args) {

        String str = "Shilpa Is A Good Girl";

        remove(str);
    }
}