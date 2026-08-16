public class StrinGs_SpecialCharCount {

    static void countSpecialCharacters(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                count++;
            }
        }
        count = str.length() - count;

        System.out.println("Special characters count: " + count);
    }

    public static void main(String[] args) {

        String str = "Shilpa@123#!";

        countSpecialCharacters(str);
    }
}