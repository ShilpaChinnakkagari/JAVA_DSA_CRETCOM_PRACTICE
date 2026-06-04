// Merge characters from two strings alternatively

import java.util.*;
class LeetCode_Q1_MergeStringsAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String mg="";
        int i=0,j=0;
        while(i<n || j<m){
            if(i<n){
                mg = mg + word1.charAt(i);
                i++;
            }
            if(j<m){
                mg = mg + word2.charAt(j);
                j++;
            }
        }
        return mg;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        String word1 = s.next();
        String word2 = s.next();

        System.out.print(mergeAlternately(word1,word2));
    }
}