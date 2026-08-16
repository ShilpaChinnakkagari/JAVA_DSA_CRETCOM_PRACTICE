public class StrinGs_ReverseWordOrder {

    static void reverseWordOrder(String str) {

        String[] words = str.split(" ");
        int n = words.length;
        for (int i = n- 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {

        String str = "Shilpa Is A Good Girl";

        reverseWordOrder(str);
    }
}