/*
 * Stack :- a data structure that works by LIFO ="Last In First Out" principle
 *
 * OPERATIONS
 * In Stack we are majorly going to focus on three operations i.e. push(), pop()
 * and peek() and sometimes size(), empty().
 *
 * There are so many Arrays and LinkedList problems which can be solved very
 * easily using Stack and implicit(in-built not manual) Stack is being implement in the memory.
 *
 *=>push()
 * push() which means to adds
 * the data at the top of the Stack and TC for this is O(1) and top of the Stack
 * is also known as the end of the Stack.
 *
 * =>pop()
 * pop() which means to remove
 * the data from the top of the Stack and TC for this is also O(1).
 *
 * =>peek()
 * peek() which means to find the value of
 * the top element of the Stack and the TC for this is also O(1).
 *
 * All the three operations mentioned above have minimal TC but there are other
 * operations which may take more time.
 *
 * Now, there are three ways by which we can implement Stack.
 * 1. Array :- If we implement Stack using Array then the size of our Stack will
 * also be fixed as the size of the Array is fixed. So, we either have to stop
 * the user from providing the input when the Stack is full or we have to make a
 * new Array which larger size and copy the values of old Array into new one
 * which is now recommended. So, we don't follow this approach practically.
 *
 * 2. ArrayList :- We practically can implement ArrayList as we have variable
 * size so, there is no limitation unlike Array.
 *
 * 3. LinkedList :- We can implement LinkedList to implement Stack as it has
 * variable size. Here, we first create 1st element and it becomes our Head, and
 * when we put 2nd element then this element becomes out Head and so on. So,
 * this becomes a Stack, but how? As we know from LinkedList that we can only
 * track the Head of the LinkedList so all the operations are possible on the
 * Head of LinkedList with TC = O(1) as mentioned by Stack.
 */

// 1. Implementing the Stack using LinkedList.

// public class Stacks {
// static class Node {
// // Node class will represent every node of the LinkedList.

// int data;
// Node next;

// public Node(int data) {
// this.data = data;
// next = null;
// }
// }

// static class Stack {
// public static Node head;

// public static boolean isEmpty() {
// return head == null;
// }

// public static void push(int data) {
// Node newNode = new Node(data);
// if (isEmpty()) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public static int pop() {
// if (isEmpty()) {
// return -1;
// }

// int top = head.data;
// head = head.next;
// return top;
// }

// public static int peek() {
// if (isEmpty()) {
// return -1;
// }

// return head.data;
// }
// }

// public static void main(String args[]) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);
// s.push(4);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }
/*---------------------------------------------------------------- */

// 2. Implementing the Stack using ArrayList.

//INTEGER

//import java.util.ArrayList;
//
//public class Stacks {
//
//    static class Stack {
//        static ArrayList<Integer> list = new ArrayList<>();
//
//        public static boolean isEmpty() {
//            return list.size() == 0;
//        }
//
//        public static void push(int data) {
//            list.add(data);
//        }
//
//        public static int pop() {
//            if (isEmpty()) {
//                return -1;
//            }
//
//            int top = list.get(list.size() - 1);
//            list.remove(list.size() - 1);
//            return top;
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                return -1;
//            }
//
//            return list.get(list.size() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack s = new Stack();
//
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

//CHARACTER
//import java.util.ArrayList;
//
//public class Stacks {
//
//    static class Stack {
//        static ArrayList<Character> list = new ArrayList<>();
//
//        public static boolean isEmpty() {
//            return list.size() == 0;
//        }
//
//        public static void push(char data) {
//            list.add(data);
//        }
//
//        public static char pop() {
//            if (isEmpty()) {
//                return '0';
//            }
//
//            char top = list.get(list.size() - 1);
//            list.remove(list.size() - 1);
//            return top;
//        }
//
//        public static char peek() {
//            if (isEmpty()) {
//                return '0';
//            }
//
//            return list.get(list.size() - 1);
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack s = new Stack();
//
//        s.push('s');
//        s.push('h');
//        s.push('i');
//        s.push('l');
//        s.push('p');
//        s.push('a');
//
//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }
//    }
//}

/*---------------------------------------------------------------- */

// 3. Implementing Stack using Java Collection Framework.

// import java.util.Stack;
//
// public class Stacks {
//    public static void main(String args[]) {
//        Stack<Integer> s = new Stack<>();
//        s.push(1);
//        s.push(2);
//        s.push(3);
//        s.push(4);
//
//        System.out.println("Traversing from the end of the stack:");
//        //using while loop (Display)
//        while (!s.isEmpty()) {
//            System.out.print(s.peek());
//            s.pop();
//        }
//
//        System.out.println("Traversing through the array: ");
//        //using for loop (Display) - reverse
//        for(int x: s){
//            System.out.print(x+" ");
//        }
//    }
// }
/*---------------------------------------------------------------- */

// Qs. Push at the Bottom of Stack :-

/*
 * Stacks are of two types namely Implicit and Explicit Stack.
 * Implicit Stack is the one which code makes by itself and Explicit Stack is
 * the one which we are making in this class while studying.
 * To solve this problem we will take help of
 * recursion as recursion has it own implicit Stack.
 */

// In implicit Stack we can do operations while going up as well as while coming
// down too. While going up we will remove the elements and while coming down we
// will push the element into the Stack.

// import java.util.Stack;
//
// public class Stacks {
// public static void pushAtBottom(int data, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }
//
// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }
//
// public static void main(String args[]) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);
//
// pushAtBottom(4, s);
//
// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
//
// }
// }
/*---------------------------------------------------------------- */

// Qs. Reverse a Stack.

// import java.util.Stack;

// public class Stacks {
// public static void pushAtBottom(int data, Stack<Integer> s) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }

// int top = s.pop();
// pushAtBottom(data, s);
// s.push(top);
// }

// public static void reverse(Stack<Integer> s) {
// if (s.isEmpty()) {
// return;
// }

// int top = s.pop();
// reverse(s);
// pushAtBottom(top, s);
// }

// public static void main(String args[]) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// reverse(s);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }

// }
// }
/*---------------------------------------------------------------- */
//import java.util.Stack;
//public class Stacks {
//
//    public static boolean isValid(String s) {
//
//        Stack<Character> stack = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//
//            // Opening brackets
//            if (ch == '(' || ch == '{' || ch == '[') {
//                stack.push(ch);
//            }
//            // Closing brackets
//            else {
//                if (stack.isEmpty()) return false;
//
//                char top = stack.pop();
//
//                if ((ch == ')' && top != '(') ||
//                        (ch == '}' && top != '{') ||
//                        (ch == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//
//        String s = "{[()]}";
//
//        if (isValid(s))
//            System.out.println("Valid Parentheses");
//        else
//            System.out.println("Invalid Parentheses");
//    }
//}


//=================
//getsmallest no (my approach)
//
//import java.util.*;
//
//public class Stacks {
//
//    public static int getSmallestFromStack(Stack<Integer> stack) {
//        // Convert stack to array
//        Integer[] arr = stack.toArray(new Integer[0]);
//
//        // Sort the array
//        Arrays.sort(arr);
//
//        // Return the first element (smallest)
//        return arr[0];
//    }
//
//    public static void main(String[] args) {
//        // Create a stack
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(5);
//        stack.push(20);
//        stack.push(1);
//
//        // Print original stack
//        System.out.println("Original stack: " + stack);
//
//        // Get the smallest element after sorting
//        int smallest = getSmallestFromStack(stack);
//
//        System.out.println("Smallest element: " + smallest);
//    }
//}

// Optimal approach
//import java.util.Stack;
//
//public class Stacks {
//
//    // Function to find the smallest element
//    public static int findSmallest(Stack<Integer> stack) {
//        if (stack.isEmpty()) {
//            throw new RuntimeException("Stack is empty");
//        }
//
//        int min = stack.peek(); // Assume top is minimum
//        //Stack<Integer> tempStack = new Stack<>();
//
//        // Traverse the stack
//        while (!stack.isEmpty()) {
//            int curr = stack.pop();
//            if (curr < min) {
//                min = curr;
//            }
//            //tempStack.push(curr);
//        }
//
//        // // Restore original stack
//        // while (!tempStack.isEmpty()) {
//        //     stack.push(tempStack.pop());
//        // }
//
//        return min;
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.push(2);
//        stack.push(9);
//        stack.push(1);
//        stack.push(6);
//
//        int smallest = findSmallest(stack);
//        System.out.println("Smallest element in stack: " + smallest);
//    }
//}

