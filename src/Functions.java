// ================================================================
//                      JAVA Functions NOTES
// ================================================================

// ---------------------------------------------------------------
// I. Functions in Java - Definition
        /*
            a) What is a function in Java?
            b) Syntax of method
            c) Return type
            d) void vs non-void
            e) Parameters vs arguments
            f) Call by value, Reference in Java ( is Java call by val or ref)
            g) Method overloading (Defn + Rules)
            h) Static vs non-static methods
            i) Scope (local vs global variable) ( defn, ex, diff)
        */
// ---------------------------------------------------------------
/*
// II. Functions Coding Practice

A. Basic Method Creation
-------------------------
1). Write a method to add two numbers.
2). Write a method to check if a number is even.
3). Write a method to find max of two numbers.
4). Write a method to swap two numbers (explain why original doesn’t change).
5). Write a method that returns square of a number.
6). Write a method that takes array and prints elements.
7). Write a method that returns sum of array.

B. Logical
--------------------------
8). Method to check if number is prime.
9). Method to calculate factorial.
10). Method to reverse a number.
11). Method to check palindrome number.
12). Method to count digits in a number.
13). Method to find GCD of two numbers.
14). Method to check Armstrong number.
15). Method to print Fibonacci series (using method).

C. String-Based Methods
-------------------------
16). Method to reverse a string.
17). Method to check if string is palindrome.
18). Method to count vowels.
19). Method to remove spaces.
20). Method to count frequency of characters.

D. Array + Method Combination
-----------------------------
21). Method to find max in array.
22). Method to find second largest.
23). Method to count even numbers in array.
24). Method to sort array.
25). Method to search element (linear search).
26). Method to perform binary search.
27). Method to remove duplicates.

E. Recursion
-----------------------
28). Factorial using recursion.
29). Fibonacci using recursion.
30). Power (x^n) using recursion.
31). Sum of digits using recursion.
32). Reverse string using recursion.
33) .Check palindrome using recursion.

// ===========================================================================

// I. Functions in Java - Definition

// a). What is a function in Java
/*
 * Functions are block of codes in Java (to avoid repetition, basically)
 * which takes some inputs from parameters and returns us
 * the output by performing some operations
 * Repetition of Code
 *
 * ----------------------------------------------------------------------------
// b). Syntax for writing a function:
*
 * syntax for writing a function:-
 * returnType functionName(type arg1, type arg2...) {
 * operations
 * return (optional)
 * }
  * ----------------------------------------------------------------------------
 // c). Return type in a method
 * Return type can be integer or float or double or void whichever data-types we
 * studied.
 * Here 'void' is the type which means 'no return'
 * But return type should be of only one type.
 *
 * e.g. public static void main (String[] args) {}
 * After functionName we pass the arguments in '()' along with its dataType like
 * int, float, double, string, etc.. There can be any number of arguments.
 * e.g. public static int personDetail(String name, int age) {
 * operations
 * }
 *
 * NOTE: The 'functionName' should be in camelCase.
 *
 *
  * ----------------------------------------------------------------------------
 // d). void vs. non-void
 * // VOID METHOD
 //   ------------
// - A void method does NOT return any value.
// - It performs an action only.
// - No return value is sent back to the caller.
//
// Example:
//
// public static void greet() {
//     System.out.println("Hello");
// }
//
// Usage:
// greet();   // Just call it
//
// Important:
// - We cannot store its result.
// - It may contain: return;  (only to exit early)
//
//
// NON-VOID METHOD
// --------------
// - A non-void method returns a value.
// - It must contain a return statement.
// - The return type must match the method's declared type.
//
// Example:
//
// public static int add(int a, int b) {
//     return a + b;
// }
//
// Usage:
// int result = add(5, 3);
//
// Important:
// - Returned value can be stored or reused.
// - Return type can be int, double, boolean, String, etc.
//
//
// KEY DIFFERENCES
// ----------------
// Void Method:
// - Returns nothing
// - Used for performing actions (printing, updating)
// - Cannot store result
//
// Non-Void Method:
// - Returns a value
// - Used for calculations or logical checks
// - Can store and reuse result
//
//* ----------------------------------------------------------------------------
// e) Parameters vs arguments
// ---------------------------
// PARAMETERS
// ----------
// - Parameters are variables defined in the method declaration.
// - They act as placeholders to receive values.
// - They are local to the method.
//
// Example:
//
// public static int add(int a, int b) {
//     return a + b;
// }
//
// Here:
// int a and int b → are PARAMETERS
//
// ARGUMENTS
// ----------
// - Arguments are the actual values passed to a method when calling it.
// - They are the real data sent to parameters.
//
// Example:
//
// int result = add(5, 3);
//
// Here:
// 5 and 3 → are ARGUMENTS
//
// SIMPLE DIFFERENCE
// --------------------
// Parameters → Defined in method
// Arguments  → Passed while calling method
//
// Parameters are like containers.
// Arguments are the values placed into those containers.
//
//
//* ----------------------------------------------------------------------------
// f) Call by value, refernce in Java
// --------------------------
 */
// CALL BY VALUE
// --------------
// Definition:
// In Call by Value, a COPY of the variable is passed to the method.
// whatever changes has been made inside the method, that DO NOT affect the original variable.
//
// Example:
//public class CallByValueDemo {
//    public static void changeValue(int x) {
//        x = 100;
//        System.out.println("Inside method: " + x); // 100
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        System.out.println("Before method call: " + a); // 10
//        changeValue(a);
//        System.out.println("Outside method: " + a); // 10
//    }
//}

// After method call:
// a is still 10
//
// Reason:
// Only a copy of 'a' was modified, not the original.
//
// CALL BY REFERENCE
// -------------------
// Definition:
// In Call by Reference, the actual memory address (reference)
// of the variable is passed to the method.
// whatever Changes made inside the method, affect the original variable.
//
// Example:
//class Box {
//    int value;
//}
//
//public class Main {
//    public static void change(Box b) {
//        b.value = 100;
//    }
//
//    public static void main(String[] args) {
//        Box obj = new Box();
//        obj.value = 10;
//        change(obj);
//        System.out.println(obj.value); // 100
//    }
//}
//
// Here, original value changes.
//

//  ********** INTERVIEW QUES ***************
//Java - Call by Value Or Call by Reference
// +++++++++++++++++++++++++++++++++++++++++
// Java supports only Call by Value.

// When a method is called,
// Java passes a COPY of the variable.

// 1)
// For primitive types:
// A copy of the actual value is passed.
// 2)
// For objects:
// A copy of the reference (memory address) is passed,
// not a copy of the object itself.

// Ques to SELF : If only a copy is sent… how is the original object changing? Shouldn’t it stay untouched?
// Both original and copied reference
// point to the same object in memory.

// Therefore, modifying object data inside the method
// affects the original object.

// Hence, Java is strictly Call by Value.
//
//
//* ----------------------------------------------------------------------------
// g) Method overloading
/*
DEFINITION :
------------
// Method Overloading means having multiple methods
// with the same name in the same class
// but with different parameters (number, type, or order).


RULES :
------
// 1. Method name must be same.
// 2. Parameters must be different.
//    (Different number OR different type OR different order)
// 3. Return type alone cannot differentiate overloaded methods.


EXAMPLE :
----------
class Demo {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.add(10, 20));
        System.out.println(d.add(10, 20, 30));
    }
}
 */
//* ----------------------------------------------------------------------------
// h) Static vs non-static methods

/*
// STATIC METHODS :
--------------------
// Static method do belongs to the class instead of objects.
// These can be called without creating an object and
// can be accessed by  only static variables and static methods.

EXMAPLE :
class Static {

    static void show() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        Static.show();  // called using class name
    }
}

 */

/*
NON - STATIC METHODS :
--------------------------
// Non-static method belongs to the object in the class.
// They specifically require an object to be called.
// It can be accessed both static and non-static members.

EXMAPLES :
class NonStatic {

    void display() {
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args) {
        NonStatic obj = new NonStatic();
        obj.display();  // called using object
    }
}
 */
//* ----------------------------------------------------------------------------
// i) Scope (local vs instance/global variable)
// Scope defines the region where a variable
// can be accessed in a program.

// LOCAL VARIABLE :
// ----------------
// A local variable is declared inside a method,
// constructor, or block.

// Its scope is limited to that method/block only.
// and must be initialized before use.
// It is stored in stack memory.

// EXMAPLE :
/*
class LocalV {

    void show() {
        int x = 10;   // local variable
        System.out.println(x);
    }
}
//x cannot be used outside show().

 */

// INSTANCE / GLOBAL VARIABLE :
// ----------------------------
// Instance variable is declared inside class
// but outside methods.

// It belongs to object.
// It can be accessed by all methods of the class.
// It gets default value if not initialized.

// EXMALE :
/*
class InstanceV {

    int x = 10;   // instance (global) variable

    void show() {
        System.out.println(x);
    }

    void display() {
        System.out.println(x);
    }
}
// Here, x is accessible in all methods.
 */

// KEY DIFFERENCES :
// Local Variable:
// - Declared inside method/block.
// - Scope limited to that method/block.
// - No default value.
// - Stored in stack memory.

// Instance (Global) Variable:
// - Declared inside class, outside method.
// - Accessible to all methods in class.
// - Has default value.
// - Stored in heap memory.
//* ----------------------------------------------------------------------------