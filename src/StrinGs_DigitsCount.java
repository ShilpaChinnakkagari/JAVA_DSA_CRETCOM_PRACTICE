public class StrinGs_DigitsCount {

    static void countDigits(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                count++;
            }
        }

        System.out.println("Digits count: " + count);
    }

    public static void main(String[] args) {

        String str = "ShilpA123";

        countDigits(str.toLowerCase());
    }
}