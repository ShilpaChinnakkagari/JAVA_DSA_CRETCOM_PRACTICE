// ================================================================
//                      JAVA BASICS NOTES
// ================================================================

// ---------------------------------------------------------------
// I.   Introduction to Java
//      - Structure of a Java program
//      - main() method
//      - System.out.print / println
//
// II.  Variables & Data Types
//      - Primitive Data Types (int, double, char, boolean, etc.)
//      - Non-Primitive Types (String, Array, Class, Object)
//      - Type safety in Java
//
// III. Input Handling
//      - Scanner class (java.util package)
//      - next(), nextLine(), nextInt(), nextDouble()
//
// IV.  Operators
//      - Arithmetic operators (+, -, *, /, %)
//      - Relational operators (==, !=, >, <, >=, <=)
//      - Logical operators (&&, ||, !)
//
// V.   Conditional Statements
//      - if
//      - if-else
//      - else-if ladder
//      - switch-case
//
// VI.  Loops
//      - for loop
//      - while loop
//      - do-while loop
//      - Nested loops
//
// VII. Basic Problem Solving
//      - Sum of n natural numbers
//      - Prime number check
//      - Multiplication table
//      - Even/odd check
//      - Menu-driven programs
//
// ================================================================

// I. Structure of a Java Program

import java.util.*;

class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // BASICS OF JAVA:-

        // EXAMPLES OF OUTPUT IN JAVA

        // // To print in same line
        // System.out.print("Hello World");
        // System.out.print("Hello World");
        // /*--------------------------------------------------------*/

        // // To print in different/ next line
        // System.out.println("Hello World");
        // System.out.println("Hello World");
        // System.out.print("Hello World");
        /*--------------------------------------------------------*/

        // // Instead of 'println' we can also use '\n'
        // System.out.print("Hello World with Java\n");
        // System.out.print("Hello World with Java\n");
        // System.out.print("Hello World with Java");
        // /*--------------------------------------------------------*/

        // System.out.print("Hello World \n with Java \n from Shilpa");
        /*--------------------------------------------------------*/

        // // Qs. Print the Pattern:-
        // // *
        // // **
        // // ***
        // // ****
        // // Solution:-
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        /*--------------------------------------------------------*/

        // EXAMPLES OF VARIABLES IN JAVA

        // String name = "Wednesday Addams";
        // int age = 48;
        // double price = 25.25;
        // int a = 25;
        // int b = 10;
        /*--------------------------------------------------------*/

        // Updating the value of variables

        // b = 20;
        // name = "Goodie";
        /*--------------------------------------------------------*/

        // DATA-TYPES IN JAVA
        /*
         * Java is a typed language (means we need to say the type of the variable
         * before declaring it) and it is strictly bound.
         * 1. Primitive (Are already present in java and cannot be altered).
         * i. byte -> 1 byte or 8 bits
         * ii. short ->
         * iii. char -> 2 bytes
         * iv. boolean -> 1 byte
         * v. int -> 4 bytes
         * vi. long -> 8 bytes
         * vii. float -> 4 bytes
         * viii. double -> 8 bytes
         *
         * 2. Non-Primitive (Are already present in java but we can make these data
         * types by our own too).
         * i. String
         * ii. Array
         * iii. Class
         * iv. Object
         * v. Interface
         */
        /*--------------------------------------------------------*/

        // EXAMPLES OF USING DATA TYPES

        // int a = 10;
        // int b = 25;
        // int sum = a + b;
        // System.out.println(sum);

        // int diff = b - a;
        // System.out.println(diff);

        // int mul = a * b;
        // System.out.println(mul);
        /*--------------------------------------------------------*/

        // Qs. Make a program that takes the radius of a circle as input, calculates its
        // radius and area and prints it as output to the user:-

        // Solution:

        // int r = sc.nextInt();

        // double area = 3.14 * r * r;

        // System.out.println("Area of circle is: " + area);
        /*--------------------------------------------------------*/

        // EXAMPLES TO TAKE INPUT FROM USER IN JAVA

        /*
         * To take input from user we import a package i.e. import java.util.*;
         * Then we use Scanner i.e Scanner sc = new Scanner(System.in);
         * Here sc is the name of the scanner and can be anything like a or b or input
         * etc.
         */
        // import java.util.*;
        // public class Basics {
        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println(name);
        // /* Here sc.next() prints only the first word of the input, if we want to
        // print the entire line
        // then we should use sc.nextLine()
        // */
        // String Name = sc.nextLine();
        // System.out.println(Name);
        // }
        // }
        // Similarly sc.nextInt() -> takes integer input, sc.nextFloat() -> takes
        // decimal input and so on.
        /*--------------------------------------------------------*/

        // Qs. Take two variables 'a' and 'b' and print their sum:-
        // Solution:-
        // import java.util.*;
        // public class Basics {
        // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a + b;
        // System.out.println(sum);
        // }
        // }
        /*--------------------------------------------------------*/

        // CONDITIONAL STATEMENTS IN JAVA:-

        // EXAMPLES OF IF, ELSE

        // int age = sc.nextInt();

        // if (age > 18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }
        /*--------------------------------------------------------*/

        // int number = sc.nextInt();

        // if (number % 2 == 0) {
        // System.out.println("even");
        // } else {
        // System.out.println("odd");
        // }
        /*--------------------------------------------------------*/

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("a is equal to b");
        // } else {
        // if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("b is greater");
        // }
        // }
        /*--------------------------------------------------------*/

        // EXAMPLES OF ELSE IF

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        // System.out.println("a is equal to b");
        // } else if (a > b) {
        // System.out.println("a is greater");
        // } else {
        // System.out.println("b is greater");
        // }
        /*--------------------------------------------------------*/

        // int button = sc.nextInt();

        // if (button == 1) {
        // System.out.println("Hello");
        // } else if (button == 2) {
        // System.out.println("Namaste");
        // } else if (button == 3) {
        // System.out.println("Bonjour");
        // } else {
        // System.out.println("Invalid Button");
        // }
        /*--------------------------------------------------------*/

        // EXAMPLES OF SWITCH CASE

        // int button = sc.nextInt();

        // switch (button) {
        // case 1:
        // System.out.println("Hello");
        // break;
        // case 2:
        // System.out.println("Namaste");
        // break;
        // case 3:
        // System.out.println("Bonjour");
        // break;
        // default:
        // System.out.println("Invalid Button");
        // }
        /*--------------------------------------------------------*/

        /*
         * Make a calculator. Take 2 numbers (a & b) from the user and an operation as
         * follows:-
         * 1. Addition:- a+b
         * 2. Subtraction:- a-b
         * 3. Multiplication:- a*b
         * 4. Division:- a/b
         * 5. Modulo or remainder:- a%b
         */

        // Solution:
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int operator = sc.nextInt();

        // switch (operator) {
        // case 1:
        // System.out.println(a + b);
        // break;
        // case 2:
        // System.out.println(a - b);
        // break;
        // case 3:
        // System.out.println(a * b);
        // break;
        // case 4:
        // if (b == 0) {
        // System.out.println("Invalid Division");
        // } else {
        // System.out.println(a / b);
        // }
        // break;
        // case 5:
        // if (b == 0) {
        // System.out.println("Invalid Division");
        // } else {
        // System.out.println(a % b);
        // }
        // break;
        // default:
        // System.out.println("Invalid Operator");
        // }
        /*--------------------------------------------------------*/

        // Qs. Ask the user to enter the number of the month & print the name of the
        // month. For eg - For '1' print 'January', '2' print 'February' & so on.

        // Solution:
        // int button = sc.nextInt();

        // switch (button) {
        // case 1:
        // System.out.println("January");
        // break;
        // case 2:
        // System.out.println("February");
        // break;
        // case 3:
        // System.out.println("March");
        // break;
        // case 4:
        // System.out.println("April");
        // break;
        // case 5:
        // System.out.println("May");
        // break;
        // case 6:
        // System.out.println("June");
        // break;
        // case 7:
        // System.out.println("July");
        // break;
        // case 8:
        // System.out.println("August");
        // break;
        // case 9:
        // System.out.println("September");
        // break;
        // case 10:
        // System.out.println("October");
        // break;
        // case 11:
        // System.out.println("November");
        // break;
        // case 12:
        // System.out.println("December");
        // break;
        // default:
        // System.out.println("Invalid Number");
        // }
        /*--------------------------------------------------------*/

        // LOOPS IN JAVA:-

        /*
         * 1. for Loop
         * 2. while Loop
         * 3. do...while Loop
         */

        // EXAMPLES OF FOR LOOP

        /*
         * syntax -> for(initialization; condition; updation) {
         * message / work we want to do repeatedly...
         * }
         *
         * Here initialization is the starting condition of loop,
         * condition is the terminating condition of loop,
         * and updation is to update the value of the loop.
         * If we don't give terminating condition to loop then it becomes infinite loop.
         */

        // for (int counter = 0; counter < 10; counter++) {
        // System.out.println("Hello World");
        // }
        // This will print "Hello World" 10 times.
        /*--------------------------------------------------------*/

        // This will print from 1 to 10 in, every digit in new line.
        // for (int counter = 0; counter < 11; counter++) {
        // System.out.println(counter);
        // }
        /*--------------------------------------------------------*/

        // This will print from 1 to 10, every digit in same line.
        // for (int i = 0; i < 11; i++) {
        // System.out.print(i + " ");
        // }
        /*--------------------------------------------------------*/

        // EXAMPLES OF WHILE LOOP

        /*
         * syntax:- while(condition) {
         * work we want to do repeatedly...
         * }
         * Here, condition is the termination condition.
         */

        // int i = 0;
        // while (i < 11) {
        // System.out.println(i);
        // i++; // i = i+1;
        // }
        /*--------------------------------------------------------*/

        // EXAMPLES OF DO-WHILE LOOP

        /*
         * syntax -> do {
         * work we want to do repeatedly...
         * } while(condition);
         *
         * The difference between while and do-while is that: In while we check
         * the condition first and then do the work, whereas, in do-while we first
         * do the work and then check the condition.
         * i.e. No matter what is the condition the do-while will at least execute once
         * before checking the termination condition.
         * Also in for loop we check the condition first and then do the work, it is
         * similar to while loop.
         */

        // int i = 0;
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 11);
        /*--------------------------------------------------------*/

        // EXAMPLE TO SHOW DO-WHILE WILL AT LEAST EXECUTE ONE EVEN IF THE CONDITION IS
        // FALSE

        // int i = 12;
        // while (i < 11) {
        // System.out.println("Om Prakash Chaurasia");
        // i++;
        // }
        // This does not print anything as this is while-loop
        /*--------------------------------------------------------*/

        // int i = 12;
        // do {
        // System.out.println("Om Prakash Chaurasia");
        // i++;
        // } while (i < 11);
        // This will print "Om Prakash Chaurasia" once.
        /*--------------------------------------------------------*/

        // Qs. Print the Sum of 1st n Natural Numbers:-

        // Solution:
        // int n = sc.nextInt();

        // int sum = 0;
        // for (int i = 1; i <= n; i++) {
        // sum += i;
        // }
        // System.out.println(sum);
        /*--------------------------------------------------------*/

        // Qs. Print the table of a number input by the user:-

        // Solution:2
        // int n = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i * n);
        // }
        /*--------------------------------------------------------*/

        // Qs. Print all even numbers till n:-

        // Solution:
        // int n = sc.nextInt();

        // if (n <= 0) {
        // System.out.println("The input should be greater than zero");
        // return;
        // }

        // for (int i = 1; i <= n; i++) {
        // if (i % 2 == 0) {
        // System.out.println(i);
        // }
        // }
        /*--------------------------------------------------------*/

        // for (;;) {
        // System.out.println("Om Prakash Chaurasia");
        // }

        // // Gives infinite loop
        /*--------------------------------------------------------*/

        // Qs. Print if a number is prime or not (Input n from the user):-

        // Solution:
        // int n = sc.nextInt();

        // boolean flag = false;
        // for (int i = 2; i <= n / 2; i++) {
        // if (n % i == 0) {
        // flag = true;
        // break;
        // }
        // }

        // if (!flag) {
        // System.out.println(n + " is a Prime number");
        // } else {
        // System.out.println(n + " is not a Prime number");
        // }
        /*--------------------------------------------------------*/

        // EXAMPLES OF NESTED-LOOPS

        /*
         * Qs. Print the pattern
         *****
         *****
         *****
         *****
         */

        // Solution:
        // outer loop
        // for (int i = 0; i < 4; i++) {
        // // inner loop
        // for (int j = 0; j < 5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        // Qs. Print the pattern
        // * * * * *
        // * *
        // * *
        // * * * * *

        // Solution:
        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        /*--------------------------------------------------------*/

        /*
         * Qs. Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
         * If the user enters 1 then keep taking input from the user for a student's
         * marks (out of 100).
         * If they enter 0 then stop.
         * If he/ she scores:
         * Marks >= 90 -> print "This is Good"
         * 89 <= Marks >= 60 -> print "This is also Good"
         * 59 >= Marks >= 0 -> print "This is Good as well"
         * Because marks don't matter but our effort does.
         */

        // Solution:
        // int input;
        // do {
        // int marks = sc.nextInt();
        // if (marks >= 90 && marks <= 100) {
        // System.out.println("This is Good");
        // } else if (marks >= 60 && marks <= 89) {
        // System.out.println("This is also Good");
        // } else if (marks >= 0 && marks <= 59) {
        // System.out.println("This is good as well");
        // } else {
        // System.out.println("Invalid");
        // }
        // System.out.println("Want to continue ? (yes(1) or no(0))");
        // input = sc.nextInt();
        // } while (input == 1);
        /*--------------------------------------------------------*/
        sc.close();
    }
}