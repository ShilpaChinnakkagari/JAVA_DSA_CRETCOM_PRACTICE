// Given Let's take LeetCode contest
// output: contest LeetCode take Let's

class LeetCode_Q6_ReverseWords {
    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        String rev = "";
        for(int i = words.length-1;i>=0;i--){
            rev += words[i];
            if(i!=0){
                rev = rev + " ";
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}