public class StrinGs_PalindromeIgnoreSpaces {

    static String removeSpaces(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    static boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madam im adam";
        String newStr = removeSpaces(str);
        System.out.println(isPalindrome(newStr));
    }
}