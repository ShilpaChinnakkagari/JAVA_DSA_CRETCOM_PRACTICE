// ================================================================
//                      JAVA ArraysList NOTES
// ================================================================

// I. Definition of Collection FrameWork
// II. ArrayList Definition + Package +How elements are stored?
// III. Comparison of ArrayList and Arrays
// IV. Basic Operations in ArrayList
// V. Work with ArrayList built-in methods

// VI. ArrayList Practice Questions
// ++++++++++++++++++++++++++++++++++++++++//

/*
==================== ArrayList Practice Questions ====================
// VI. ArrayList Practice Questions

A. Basic Operations
1. Create an ArrayList of integers. Add 5 elements, then print it.
2. Insert an element at index 2, then print the updated list.
3. Replace the element at index 0 with a new value.
4. Remove the element at index 3.
5. Print the element at index 2.
6. Find the size of the ArrayList.
7. Clear the ArrayList and check if it’s empty.
8. Clone an ArrayList and print both lists. + **** What does cloning do internally???
9. Check if a specific element exists using contains().

B. Iteration
10. Iterate over the ArrayList using a standard for loop.
11. Iterate using for-each loop.
12. Iterate using Iterator.
13. Iterate using ListIterator and reverse iterate.

C. Sorting & Ordering
14. Sort an ArrayList of integers in ascending order.
15. Sort an ArrayList in descending order.
16. Sort an ArrayList of strings alphabetically.
17. Find the max and min element in an ArrayList.

D. Searching & Indexing
18. Find the index of a specific element.
19. Count the frequency of a given element.
20. Check if an element exists in the list (contains()).
21. Find all elements greater than a given value.

E. ArrayList Manipulation
22. Merge two ArrayLists into one.
23. Remove all elements of one ArrayList from another.
24. Retain only the common elements between two ArrayLists.
25. Reverse the ArrayList without using Collections.reverse().
26. Remove all duplicates from an ArrayList.

F. Number-specific Operations
27. Sum all elements of an integer ArrayList.
28. Find the average of numbers in an ArrayList.
29. Find the second, third, nth largest element.
30. Find all even numbers in an ArrayList.
31. Find all odd numbers in an ArrayList.
Separate even and odd numbers into two ArrayLists.
32. Separate +ve and -ve numbers into two ArrayLists.

G. Advanced Mini Problems
33. Rotate an ArrayList by k positions.
34. Swap two elements at given indices.
35. Shift all zeros in an ArrayList to the end.
36. Find pairs of numbers that sum to a given value.
37. Remove elements that are multiples of 3.
38. Find the first repeating element.
39. Find the first non-repeating element.
40. Convert ArrayList to array and back.

H. Combined Operations
41. Add numbers 1–10, remove all even numbers, replace 5 with 50, sort in descending, print final list.
42. Merge two ArrayLists, remove duplicates, find the max, and print.
43. Given an ArrayList of strings, remove all strings with length < 3, sort alphabetically, and print.
44. Given an ArrayList of integers, reverse it, find the sum, and check if it contains a given number.
45. Clone an ArrayList, clear the original, and print both lists.

========================================================================


 */
//==================================================================================
// I. Definition of Collection FrameWork
/*
* What is Collection Framework?
        * We know how to implement the data structures from scratch but when we go for
        * competitive programming then we don't have to create data structures
        from scratch there are already data structures present in JAVA we just need to implement them.
        * =>Collection Framework : The java collection framework pvdes.
        * data structures with built-in methods for CRUD operations adding, removing, searching,
        and sorting elements overcoming the limitations of array.
*/
//==================================================================================
// II. ArrayList Definition + Package +How elements are stored?
/*
 * What is ArrayList?
 * It is one of the most important concept of collection framework in java
 * which is little bit similar to Arrays but very different from Arrays.
 * =>Part of java.util.ArrayList that can grow or shrink automatically as elements
 * are added or removed, unlike regular arrays fixed size
 *
 */

//How ArrayList Stores Elements
//        Internally, ArrayList uses a regular array to store elements.
//        When you add elements and it reaches its current capacity,
//        it creates a new bigger array and copies all the old elements into it.
//       Then it adds the new element to this bigger array.
//Once the copy is done, the old array becomes unreferenced — no variable or object points to it.
//        The Java Garbage Collector (GC) will eventually clean it up and free the memory.
/*
//==================================================================================
// III. Comparison of ArrayList and Arrays
*=>COMPARISON
 * Arrays have the fixed size and limited with built in operations making them inflexible.

 * In arrays we store the data as chunks and this has certain properties like :-
 * 1. It has fixed size.
 * 2. The chunks(entire part of Array) are stored in a continuous memory location.
 * 3. In arrays we can store only Primitive data-types like int, float, char, string etc.
 *
 * The ArrayList over comes the above disadvantages of Arrays as :-
 * 1. It doesn't have fixed size.
 * 2. The chunks(entire part of Array)  are stored in a non-continuous memory location.
 * 3. In ArrayList we can store only as Objects.
 * 4. ArrayList is stored in Heap memory.
 */
//==================================================================================
// IV. Basic Operations in ArrayList
/*
 * On every collection we do perform some operations, and we are going to do the same on ArrayList too.
 * Operations in ArrayList :-
 * 1. Add :- To add the elements in ArrayList.
 * 2. Get :- To retrieve the element from certain index in ArrayList.
 * 3. Modify :- To modify / replace element at certain index in ArrayList.
 * 4. Delete / Remove :- To delete element at certain index in ArrayList.
 * 5. Iterate :- To loop over and ArrayList.
 *
 * To use ArrayList in JAVA we need to import the package called "import java.util.ArrayList;"
 */


//        | Operation    | What to practice                              |
//        | ------------ | --------------------------------------------- |
//        | Add          | `add()`, `add(index, element)`, `addAll()`    |
//        | Get          | `get(index)`                                  |
//        | Modify       | `set(index, element)`                         |
//        | Delete       | `remove(index)` or `remove(object)`           |
//        | Search       | `contains()`, `indexOf()`                     |
//        | Iterate      | `for loop`, `for-each`, `iterator`            |
//        | Size         | `size()`                                      |
//        | Sort/Reverse | `Collections.sort()`, `Collections.reverse()` |
//        | Clone        | `clone()`                                     |

//==================================================================================

// V. Work with ArrayList built-in methods
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class ArraysList {
//    public static void main(String args[]) {
//        // As we discussed earlier that we store the objects in the ArrayList so we
//        // cannot use int, float, boolean etc. here, instead we have to use Wrapper class of
//        // this data-types such as Integer, Float, Boolean, String, etc. i.e. it starts
//        // with Uppercase and we have to write fullName of the datatype.
//
//        /*CREATION OF ARRAYLIST*/
//        // Both the methods below are correct to create an ArrayList.
//        // ArrayList<Integer> list1 = new ArrayList<Integer>();
//        // ArrayList<Boolean> list2 = new ArrayList<>();
//
//
//        //<Integer> => Wrapper class
//        ArrayList<Integer> list = new ArrayList<>();
//        // ArrayList<Boolean> list2 = new ArrayList<>();
//        // ArrayList<String> list3 = new ArrayList<>();
//
//        /*OPERATIONS*/
//        //ADD
//        // To add elements :- Elements are added at the end of the ArrayList.
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println("After adding elements: "+list);
//
//        // To add elements in between the ArrayList :-
//        list.add(1, 15); // element added at the 1st index and the element added is 15.
//        System.out.println("Adding element at first pos: "+list);
//
//        // addAll methods add the elements from list1 to list2
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.addAll(list);
//        System.out.println("After addAll the list2: " + list);
//
//        // list.clear();
//        System.out.println("After clear of list2: " + list);
//
//
//        //(DISPLAY) GET
//        // To get elements :- (Display)
//        int element = list.get(1);
//        System.out.println("Displaying element at first pos: "+element);
//
//        //SIZE
//        // To get the length / size of the ArrayList :-
//        int size = list.size();
//        System.out.println("Size of Array: "+size);
//
//        //REPLACE(SET)
//        // To replace element we use set(); here 1st param is index and 2nd param is
//        // element.
//        list.set(0, 5);
//        System.out.println("Replacing 0th pos element by 5: "+list);
//
//        // To delete the element from certain index we use remove();
//        list.remove(3);
//        System.out.println("Removing 3rd pos element: "+list);
//
//        System.out.print("Displaying values of array: ");
//        // To loop over the ArrayList :-
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//
//        // Sort :- In ArrayList we can sort the elements in ascending order easily by
//        // using 'Collections.sort()' function which is already optimized and to use
//        // this we need to import is as "import java.util.Collections;"
//
//        list.add(2);
//        Collections.sort(list);
//        System.out.println("After sorting elements using sort method: "+list);
//
//        //CLONE
//        ArrayList<Integer> clonedList = (ArrayList<Integer>) list.clone();
//        System.out.println("Cloned list: " + clonedList);
//
//        //CONTAINS
//        System.out.println("Contains 20? " + list.contains(20));
//
//        // That's all we need to know about ArrayList. It is very rare that we'll use
//        // any functions other than the discussed above.
//    }
//}
//==================================================================================
// VI. ArrayList Practice Questions
//----------------------------------------------------------------------------------
//A. Basic Operations

//add(value) → adds at the end
//
//add(index, value) → inserts at specific index
//
//set(index, value) → replaces an element
//
//remove(index) → removes element at index
//
//get(index) → retrieves element
//
//size() → returns number of elements
//
//clear() → removes all elements
//
//isEmpty() → checks if list is empty
//
//clone() → creates a shallow copy
//
//contains(value) → checks if value exists


/*import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {

    public static void main(String[] args) {

        // 1. Create an ArrayList of integers. Add 5 elements, then print it.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("1. After adding 5 elements: " + list);

        // 2. Insert an element at index 2, then print the updated list.
        list.add(2, 25); // Insert 25 at index 2
        System.out.println("2. After inserting 25 at index 2: " + list);

        // 3. Replace the element at index 0 with a new value.
        list.set(0, 5); // Replace 10 with 5 at index 0
        System.out.println("3. After replacing element at index 0 with 5: " + list);

        // 4. Remove the element at index 3.
        list.remove(3); // Remove element at index 3
        System.out.println("4. After removing element at index 3: " + list);

        // 5. Print the element at index 2.
        int element = list.get(2);
        System.out.println("5. Element at index 2: " + element);

        // 6. Find the size of the ArrayList.
        int size = list.size();
        System.out.println("6. Size of the list: " + size);

        // 7. Clear the ArrayList and check if it’s empty.
        list.clear();
        System.out.println("7. After clearing, is the list empty? " + list.isEmpty());

        // 8. Clone an ArrayList and print both lists.
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        ArrayList<Integer> clonedList = (ArrayList<Integer>) list2.clone();
        System.out.println("8. Original list2: " + list2);
        System.out.println("   Cloned list: " + clonedList);
        clonedList.add(1000);
        System.out.println(" Adding Element to the Cloned list: " + clonedList);
        System.out.println(" Adding Element to the Cloned list does not impact actual list (but elements): " + list2);

// Rule
//        clone() makes a new list, but not new objects inside.
//                Change the list itself (add/remove) → does not affect the other list.
//        Change the objects inside → affects both if the objects are mutable (like StringBuilder, custom objects).
//        Immutable objects (like String) can’t be changed, so changes won’t propagate.

// Only the containers change where we store elements not the object themselves
// When we clone an ArrayList, Java creates a new list object with its own internal array.
// The new list holds references to the same elements, but the list itself is separate.
// So if we add or remove elements in the cloned list, it changes only the new list, not the original.
// Only if we modify the objects inside (like changing a StringBuilder) will both lists see the change.
        // EX: Rack to hold books , this side same other side same but other side flexibility to add some more books

        // 9. Check if a specific element exists using contains().
        boolean exists = list2.contains(2);
        System.out.println("9. Does list2 contain 2? " + exists);
    }
} */

//----------------------------------------------------------------------------------
//B. Iteration

/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // 10. Standard for loop
        System.out.print("10. Standard for loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 11. For-each loop
        System.out.print("11. For-each loop: ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 12. Using Iterator
        System.out.print("12. Iterator: ");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 13. Using ListIterator and reverse iteration
        System.out.print("13. ListIterator reverse: ");
        ListIterator<String> listIt = list.listIterator(list.size()); // start at end
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }
        System.out.println();
    }
}
*/

/*
==> Iterator & ListIterator Notes

1. Iterator Basics:
   - An Iterator is like a cursor that moves over the elements of a collection.
   - You cannot access an element directly; you must move the cursor.

2. hasNext():
   - Returns true if there is a next element in the collection.
   - Use it in a loop to check if you can safely call next().

3. next():
   - Moves the cursor forward by one element and returns that element.
   - If you call next() when there’s no next element, it throws NoSuchElementException.

Example with Iterator:
Iterator<String> it = list.iterator();
while(it.hasNext()) {       // Check if there is a next element
    String val = it.next(); // Move cursor and get the element
    System.out.println(val);
}
1️⃣ Normal Iterator (Uni-directional)
Moves only forward.
You can do: hasNext() + next()
Once you move past an element, you cannot go back.

4. ListIterator (for bi-directional traversal):
   - listIterator() can move forwards and backwards.
   - hasPrevious(): Returns true if there is an element before the current cursor.
   - previous(): Moves cursor backward and returns that element.
2️⃣ ListIterator (Bi-directional)
Can move forward and backward.
Forward: hasNext() + next()
Backward: hasPrevious() + previous()

Example (reverse iteration):
ListIterator<String> listIt = list.listIterator(list.size()); // start after last element
while(listIt.hasPrevious()) {           // Check if there is a previous element
    System.out.println(listIt.previous()); // Move backward and get element
}

==> Quick Analogy
Imagine a train of elements: [A] [B] [C] [D]
Cursor starts here: ^
- hasNext() → "Is there a car ahead?"
- next()    → "Move to that car and tell me what's inside"
- hasPrevious() → "Is there a car behind me?"
- previous()    → "Move back one car and tell me what's inside"
*/

//----------------------------------------------------------------------------------
//C. Sorting & Ordering
/*
import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {

    public static void main(String[] args) {

        // 14. Sort an ArrayList of integers in ascending order
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        Collections.sort(numbers); // Ascending
        System.out.println("14. Ascending order: " + numbers);

        // 15. Sort an ArrayList in descending order
        Collections.reverse(numbers); // Descending
        System.out.println("15. Descending order: " + numbers);

        // Alternatively, you could do:
        // Collections.sort(numbers, Collections.reverseOrder());

        // 17. Find the max and min element in an ArrayList
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("17. Min element: " + min + ", Max element: " + max);

        // Or using sorted list:
        // Collections.sort(numbers);
        // int min = numbers.get(0);
        // int max = numbers.get(numbers.size() - 1);

        // 16. Sort an ArrayList of strings alphabetically
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Grapes");

        Collections.sort(fruits); // Alphabetical order
        System.out.println("16. Strings sorted alphabetically: " + fruits);

        // Descending alphabetical order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Strings sorted in reverse alphabetical: " + fruits);
    }
}
*/

//----------------------------------------------------------------------------------
//D. Searching & Indexing
/*
import java.util.ArrayList;
import java.util.Collections;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        System.out.println("ArrayList: " + list);

        // 18. Find the index of a specific element
        int index = list.indexOf(20);
        System.out.println("18. Index of element 20: " + index);

        // 19. Count the frequency of a given element
        int frequency = Collections.frequency(list, 20);
        System.out.println("19. Frequency of element 20: " + frequency);

        // 20. Check if an element exists in the list
        boolean exists = list.contains(30);
        System.out.println("20. Does list contain 30? " + exists);

        // 21. Find all elements greater than a given value
        int target = 25;
        System.out.print("21. Elements greater than " + target + ": ");
        for (int x : list) {
            if (x > target) {
                System.out.print(x + " ");
            }
        }
    }
}
*/

//----------------------------------------------------------------------------------

//E. ArrayList Manipulation



//22. Merge two ArrayLists into one.

//addAll() Method
/*
import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Merge list2 into list1
        list1.addAll(list2);

        System.out.println("Merged list using addAll(): " + list1);
    }
}
*/

//Manual implementation
/*
import java.util.ArrayList;

public class ArraysList {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Manual merge
        for (int x : list2) {
            list1.add(x);
        }

        System.out.println("Merged list using loop: " + list1);
    }
}
*/



//23. Remove all elements of one ArrayList from another.

/*
Example:
ArrayList<Integer> list1 = [1, 2, 3, 4, 5]
ArrayList<Integer> list2 = [2, 4]

Operation:
list1.removeAll(list2);

Result:
list1 = [1, 3, 5]

Explanation:
- Every element present in list2 is removed from list1
- list2 remains unchanged
- Only common elements are removed
*/


//using built-in method
/*
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4));

        list1.removeAll(list2);

        System.out.println(list1); // [1, 3, 5]
    }
}
*/

//using Manual Implementation
/*
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4));

        for (Integer x : list2) {
            list1.remove(x);
        }

        System.out.println(list1); // [1, 3, 5]
    }
}
*/

//Another method also there....
/*  LOGIC
for (int i = list1.size() - 1; i >= 0; i--) {
            if (!(list2.contains(list1.get(i)))) {
                list1.remove(i);
            }
        }
 */

/*NOTE
========
=> Observe lineNo 593, you would see for loop like for(int x :list)
    but in the lineNo 653, we do mention like for(Integer x : list)
        why did we specify, so....?
=>REASON :
We have two approaches to remove the element from the list.
        (i) specifying index     (ii) specifying object
We do declare ArrayList like ArrayList<Integer> with wrapper class, right?
Thus, when we specify "int" it takes x as int format which mean a number,
in this scenario, it tries to remove the element from the list by specifying the index value,

but what we are implementing is that... removing element specifying object
At that case, we do declare Integer format in for each loop, to avoid ambuiguity between the number and object
 */



//24. Retain only the common elements between two ArrayLists.
/*
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysList {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 4));

        for (int i = list1.size() - 1; i >= 0; i--) {
            if (!(list2.contains(list1.get(i)))) {
                list1.remove(i);
            }
        }

        System.out.println(list1); // [2,4]
    }
}
 */

/*
BREAKDOWN :
===========
list1.get(i) -> gets element
        (i) TRUE CASE
list2.contains(element) -> returns true if list1 and list2 consists same element
!(list2.contains(element) -> returns false, thus we do not remove element ultimately
        if the element is common in each group

        (ii) FALSE CASE
 list2.contains(element) -> returns false if list1 element not present in list2
 !(list2.contains(element) -> returns true, thus we do need to remove element ultimately
  if there is no element is common in each group
*/

//Question to Self : Can we implement above using for-each loop?? Absolutely No
/*
Because a for-each loop internally uses an Iterator.
If we modify the list directly using remove() while iterating, the iterator detects a structural change and throws a ConcurrentModificationException.
To remove elements safely, we should use an explicit Iterator or an index-based loop
 */


//Question to Self : Any reason behind you start with the size of list1 only?? why list2??
/* Because we are removing elements from list1 to print common elements */

// Do we have previlege to run the for loop from int i=0???
// Yes we can, no issues in that.



//25. Reverse the ArrayList without using Collections.reverse().

/*
Here, we have many approaches to reverse
 */

// Approach -1
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ArraysList {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.print(list.get(i) + " ");
//        }
//    }
//}

// Approach -2
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ArraysList {
//
//    // swap function
//    static void swap(ArrayList<Integer> list, int i, int j) {
//        int temp = list.get(i);
//        list.set(i, list.get(j));
//        list.set(j, temp);
//    }
//
//    // reverse function
//    static void reverseList(ArrayList<Integer> list) {
//
//        int n = list.size();
//
//        for (int i = 0; i < n / 2; i++) {
//            swap(list, i, n - 1 - i);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list =
//                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//        reverseList(list);
//
//        System.out.println(list); // [5, 4, 3, 2, 1]
//    }
//}

// Question to Self :
/*
Suppose i have list1 = [1,2,3], i do perform Collections.reverse(list1) and print it, so if i print(list1) now,
what does it print???
//list1 = [3, 2, 1]
 */



//26. Remove all duplicates from an ArrayList.
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//
//public class ArraysList {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list =
//                new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5));
//
//        HashSet<Integer> set = new HashSet<>(list);
//
//        list.clear();
//        list.addAll(set);
//
//        System.out.println(list);
//    }
//}

//----------------------------------------------------------------------------------

//F. Number-specific Operations


// 27. Sum all elements of an integer ArrayList.
// 28. Average of elements in an arraylist
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class ArraysList {
//    public static void main(String[] args) {
//
//        ArrayList<Integer> list =
//                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//
//        int sum = 0;
//
//        for (int i = 0; i < list.size(); i++) {
//            sum += list.get(i);
//        }
//        double avg = (double) sum / list.size();
//
//        System.out.println("Sum = " + sum); // 15
//        System.out.println("Average = " + avg);
//    }
//}

// 29 (a). Second Largest Element in the ArrayList
/* Check Q40_SecondLargestElement.java */

// 29 (b). Third Largest Element in the ArrayList
/* Check Q40_SecondLargestElement.java */

// 29 (c). nth Largest Element in the ArrayList
/*
30. Find all even numbers in an ArrayList.
31. Find all odd numbers in an ArrayList.
Separate even and odd numbers into two ArrayLists.
 */
// Check Q1_EvenOdd.java

// 32. Separate +ve and -ve numbers into two ArrayLists.
// Check Q2_EvenOdd.java

//----------------------------------------------------------------------------------


//G. Advanced Mini Problems


//33. Rotate an ArrayList by D positions.
// Check Q44_RotateArrayByD.java


// 34. Swap two elements at given indices.
//  Check Q22_ReverseArrayList.java method : swap()


// 35. Shift all zeros in an ArrayList to the end.
// Check Q45_MovesZeroesEnd.java

/*

36. Find pairs of numbers that sum to a given value.
37. Remove elements that are multiples of 3.
38. Find the first repeating element.
39. Find the first non-repeating element.
40. Convert ArrayList to array and back.
 */
//==================================================================================


//==================================================================================
//==================================================================================
/*---------------------------------------------------------------- */