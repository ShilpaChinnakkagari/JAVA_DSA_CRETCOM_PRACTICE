// I. Recursion definition , why should we use it? Base Condition? JVM Call Stack? StackOverFlow
// What happens to Memory during Execution
// II. Factorial of a number
// III. Fibonocci Sequence
// IV. Count digits in a number
// V. Sum of N Natural Numbers +  Sum of N Natual Even Numbers
// VI. Reverse a String
// VII. Palindrome of String
// VIII. Permutations
// IX. Three stairs problem (LeetCode 70)
/*

 * What is Recursion and Why do we use it?
 * We can say that recursion is the another way to represent Iteration / Loops.
 * Whatever we can do using loops can also be done using recursion. At some
 * place the code with loops becomes more complicated so we use recursion and
 * vice-versa. Although we can solve the question of recursion with loops and
 * vice-versa but it all depends upon the question that by using which it can be
 * solved easily. (When we learn about the concept trees and graphs, there we
 * will mostly use the concept of recursion.)
 *
 * DEFINITION
 * Recursion basically means, a function that calls itself.
 * In programming, the main function calls a function and that functions calls
 * itself again and again until a BASE condition is reached. After reaching a
 * base condition we return back to the main function step-by-step and at each
 * step we return some value, if then value then i.e. if it is void then we just
 * return control.
 *
 * Base condition (or base case) is:
 * The condition in a recursive function that stops further recursive calls and provides a direct answer.
 * Without it, recursion would call itself forever → StackOverflowError in Java.
 *
 * Think about the JVM call stack:
Every recursive call pushes a new frame on the stack.
If there’s no base case, frames keep piling up.
Base case = the point where the stack stops growing and starts unwinding.
So in a sense, the base case is like a safety exit for the recursion.
 */


/*
 * What happens in Memory during recursion?
 * => All the functions are stacked one over another until the base condition is
 * reached. And every stack created, creates all the variables again which
 * consumes memory and this is the major difference between Recursion and loops
 * (in loops extra memory is not consumed). So we must provide a base condition
 * to the recursion or else the memory will get full and Stack Overflow error
 * will occur.
 */


//==================================================================================
// II. Factorial of a number
//import java.util.Scanner;
//
//public class Recursion {
//
//    // Recursive method
//    static int factorial(int n) {
//        if (n == 0 || n == 1) {   // base case
//            return 1;
//        }
//        return n * factorial(n - 1); // recursive call
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Factorial of " + n + " is: " + factorial(n));
//    }
//}

//==================================================================================

// III (a). Fibonocci Sequence (Recursive)
//
//import java.util.Scanner;
//
//public class Recursion {
//
//    // Recursive function to find nth Fibonacci number
//    public static int fib(int n) {
//        if (n <=  1) return n;   // Base case
//        return fib(n - 1) + fib(n - 2); // Recursive call
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        System.out.println("Fibonacci sequence up to n:");
//
//        // Print Fibonacci sequence from 0 to n
//        for (int i = 0; i <= n; i++) {
//            System.out.print(fib(i) + " ");
//        }
//    }
//}
//
//
//Iterative Fibonacci is much faster than recursion because it doesn’t keep piling up stack frames
// III (b). Fibonocci Sequence (Iterative)
//import java.util.Scanner;
//
//public class Recursion {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        if (n < 0) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        // Initialize first two Fibonacci numbers
//        int a = 0;
//        int b = 1;
//        System.out.print(a + " " + b + " ");
//
//        // Loop to calculate remaining Fibonacci numbers
//        for (int i = 2; i <= n; i++) {
//            int c = a + b;   // Next Fibonacci number
//            System.out.print(c + " ");
//            a = b;           // Shift a
//            b = c;           // Shift b
//        }
//    }
//}
//==================================================================================
// IV. Count digits of a number (Recursive Approach)
//public class Recursion {
//    public static int count(int n) {
//        if (n == 0) {       // base case: when n is 0, stop
//            return 0;
//        }
//        return 1 + count(n / 10);  // 1 for current digit + digits in n/10
//    }
//
//    public static void main(String args[]) {
//        System.out.print(count(143));  // Output: 3
//    }
//}
//
//
// IV. Count digits of a number (Iterative Approach)
//public class Recursion {
//    public static int count(int n) {
//        int c = 0;
//        while (n > 0) {
//            n = n / 10;
//            c++;
//        }
//        return c;
//    }
//
//    public static void main(String args[]) {
//        System.out.print(count(100));  // Output: 3
//    }
//}
//==================================================================================
// V. Sum of N Natural Numbers (Recursive)
//public class Recursion {
//    public static int sumN(int n) {
//        if (n == 0) {       // base case: when n is 0, stop
//            return 0;
//        }/        return n + sumN(--n);   // (n-1) also preferable
//    }
//
//    public static void main(String args[]) {
//        System.out.print(sumN(5));  // Output: 15
//    }
//}
//
//
// V. Sum of N Natural Numbers (Iterative)
//public class Recursion {
//    public static int sumN(int n) {
//        int sum=0;
//        for(int i=1; i<=n;i++){
//            sum += i;
//        } // 1 for current digit + digits in n/10
//        return sum;
//    }
//
//    public static void main(String args[]) {
//        System.out.print(sumN(5));  // Output: 15
//    }
//}
//
// Sum of N Natual Even Numbers
//public class Recursion {
//    public static int sumEven(int n) {
//        if (n <= 0) return 0; // base case: no numbers left
//
//        if (n % 2 == 0) {
//            return n + sumEven(n - 2); // if even, add it
//        } else {
//            return sumEven(n - 1);     // if odd, skip to previous number
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sumEven(5));  // Output: 6  (2 + 4)
//        System.out.println(sumEven(6));  // Output: 12 (2 + 4 + 6)
//    }
//}
//==================================================================================
// VI. Reverse a String
//public class Recursion {
//
//    // Recursive method to reverse a string
//    public static String reverse(String str) {
//        if (str.isEmpty()) {   // base case: empty string
//            return str;
//        }
//        // recursive case: reverse the substring excluding first char, then add first char at the end
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
//
//    public static void main(String[] args) {
//        String original = "HELLO";
//        String reversed = reverse(original);
//        System.out.println("Original: " + original);   // Output: HELLO
//        System.out.println("Reversed: " + reversed);   // Output: OLLEH
//    }
//}
//==================================================================================
// VII. Palindrome of a string
//public class Recursion {
//
//    // Recursive method to reverse a string
//    public static String reverse(String str) {
//        if (str.isEmpty()) {   // base case: empty string
//            return str;
//        }
//        // recursive case: reverse the substring excluding first char, then add first char at the end
//        return reverse(str.substring(1)) + str.charAt(0);
//    }
//
//    public static void main(String[] args) {
//        String original = "HELLOOLLE";
//        String reversed = reverse(original);
//        if(original.equals(reversed)){
//            System.out.println("Palindrome");
//        }else {
//            // Output: HELLO
//            System.out.println("Not Padlindrome");   // Output: OLLEH
//        }
//    }
//}
//==================================================================================
// VIII. Permutations
//public class Recursion {
//
//    // Recursive method to generate all permutations of a string
//    public static void permute(String str, String ans) {
//        if (str.length() == 0) {  // base case: nothing left to permute
//            System.out.println(ans);
//            return;
//        }
//
//        // iterate through all characters
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);                  // pick a character
//            String ros = str.substring(0, i) + str.substring(i + 1); // rest of string
//            permute(ros, ans + ch);                   // recursive call
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "ABC";
//        permute(str, "");
//    }
//}
//==================================================================================

//==================================================================================
//==================================================================================