public class StrinGs_Decode {

    static void decode(String str) {

        for (int i = 0; i < str.length(); i += 2) {

            char ch = str.charAt(i);
            int count = str.charAt(i + 1) - '0';
            for (int j = 0; j < count; j++) {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {

        String str = "a3b2c6";

        decode(str);
    }
}