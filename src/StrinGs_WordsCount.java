// public class StrinGs_SpecialCharCount {

//     static void countWords(String str) {

//         int count = 1;

//         for (int i = 0; i < str.length(); i++) {

//             char ch = str.charAt(i);

//             if (Character.isWhitespace(ch)) {
//                 count++;
//             }
//         }

//         System.out.println("Special characters count: " + count);
//     }

//     public static void main(String[] args) {

//         String str = "shilpa   speaks fast";

//         countWords(str);
//     }
// }

public class StrinGs_WordsCount {

    static void countWords(String str) {

        String[] words = str.trim().split("\\s+");

        System.out.println("Word count: " + words.length);
    }

    public static void main(String[] args) {

        String str = "shilpa   speaks fast";

        countWords(str);
    }
}