//import java.util.*;
//
//public class StrinGs_Reverse {
//
//    static void rev(String str) {
//        StringBuilder strRev = new StringBuilder(str);
//        strRev.reverse();
//        System.out.print(strRev);
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Shilpa Is A Good Girl";
//
//        rev(str);
//    }
//}

import java.util.*;

public class StrinGs_Reverse {

    static void rev(String str) {
        StringBuilder strRev = new StringBuilder();
        for(int i= str.length()-1 ; i>=0 ; i--){
            char ch = str.charAt(i);
            strRev.append(ch);
        }
        System.out.print(strRev);
    }

    public static void main(String[] args) {

        String str = "Shilpa Is A Good Girl";

        rev(str);
    }
}