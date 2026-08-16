public class StrinGs_LowerUpperCount {
        static void count(String str) {
            int upper=0;
            int lower = 0;
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);

                if(Character.isUpperCase(ch)){
                    upper++;
                }

                if(Character.isLowerCase(ch)){
                    lower++;
                }
            }

            System.out.print("Upper count: " + upper + "\nLower count: " + lower);
        }

        public static void main(String[] args) {

            String str = "sHilpa   spEAks faSt";

            count(str);
        }
    }
