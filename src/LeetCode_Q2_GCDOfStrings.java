// str1 = ABCABCABC
// str 2 = ABC
// op (GCD) : ABC
public class LeetCode_Q2_GCDOfStrings {

    // Function to find GCD of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to find the largest string x that divides both str1 and str2
    public static String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if a common string is even possible
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // No common divisor
        }

        // Step 2: Find the GCD of their lengths
        int lenGCD = gcd(str1.length(), str2.length());

        // Step 3: The first lenGCD characters form the largest common divisor string
        return str1.substring(0, lenGCD);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));   // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));  // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));    // Output: ""
        System.out.println(gcdOfStrings("AAAAAB", "AAA"));   // Output: ""
    }
}
