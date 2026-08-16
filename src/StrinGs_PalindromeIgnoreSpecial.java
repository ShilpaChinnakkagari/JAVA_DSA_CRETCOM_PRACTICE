public class StrinGs_PalindromeIgnoreSpecial {

    static String removeSpecialChars(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
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

        String str = "A man, a plan, a canal: Panama";
        String str2 = str.toLowerCase();
        String newStr = removeSpecialChars(str2);
        System.out.println(isPalindrome(newStr));
    }
}