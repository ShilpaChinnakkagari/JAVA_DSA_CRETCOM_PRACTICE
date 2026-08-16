public class StrinGs_VowelsCount {
    static void countVowels(String str){

        int vowels_count=0;
        int const_count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch=='o' || ch=='i' || ch=='u'){
                vowels_count++;
            }
            else{
                const_count++;
            }
        }
        System.out.print("Vowels count: "+vowels_count+ " Consonants Count: " +const_count);
    }

    public static void main(String[] args) {
        String str="ShilpA";
        countVowels(str.toLowerCase());
    }
}
