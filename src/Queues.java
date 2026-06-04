
/*
 * Queue => Queue is a kind of data structure where we place things one after another.
 * This is also known as FIFO -> "First In First Out" data structure.
 *
 * There are so many Arrays and LinkedList problems which can be solved very
 * easily using Queue and it also important from interview point of view and
 * also in recursion, implicit Stack is being implement in the memory.
 *
 *
 * The three major operations in Queue are :-
 * 1. Enqueue which is done by add() method which adds the element to the Queue
 * and TC = O(1).
 *
 * 2. Dequeue which is done by remove() method which removes the element from
 * the
 * Queue and TC = O(1).
 *
 * 3. Front which is done by peek() method which means to find the value of
 * front
 * element and TC = O(1).
 *
 * NOTE :- Don't get confused between Dequeue and Deque, Dequeue means to remove
 * the element from a queue whereas, Deque means Double Ended Queue.
 *
 * Now, there are three ways by which we can implement Stack.
 * 1. Array :- If we implement Queue using Array then the size of our Queue will
 * also be fixed as the size of the Array is fixed. So, we either have to stop
 * the user from providing the input when the Queue is full or we have to make a
 * new Array which larger size and copy the values of old Array into new one
 * which is now recommended. So, we don't follow this approach practically.
 */

// 1. Implementing Queue using Array.

// public class QueueClass {
// static class Queue {
// static int arr[];
// static int size;
// static int rear = -1;
// // We don't have to initialize front because when we implementing with Array
// the
// // front always exists and its position will be fixed.

// Queue(int n) {
// arr = new int[n];
// this.size = n;
// }

// public static boolean isEmpty() {
// return rear == -1;
// }

// // Enqueue :- Adding data in the Queue. TC = O(1)
// public static void add(int data) {
// if (rear == size - 1) {
// System.out.println("Queue is full");
// return;
// }

// rear++;
// arr[rear] = data;
// }

// // Dequeue :- Removing data from the Queue. TC = O(n) while implementing with
// // Array.
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// int front = arr[0];
// // Moving the elements to the front after the 1st front element is removed.
// for (int i = 0; i < rear; i++) {
// arr[i] = arr[i + 1];
// }

// rear--;
// return front;
// }

// // Front :- Checking the value of the front element in the Queue. TC = O(n)
// // while implementing with Array.
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return arr[0];
// }
// }

// public static void main(String[] args) {
// Queue q = new Queue(5);

// q.add(1);
// q.add(2);
// q.add(3);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }
/*---------------------------------------------------------------- */

// 2. Implementing Circular Queue using Array.
/*
 * The advantage here is that all three operation takes TC = O(1).
 * This is complicated to understand so, refer to Queue's video also a very
 * important statement in this is rear = (rear + 1) % size
 */

// public class QueueClass {
// static class Queue {
// static int arr[];
// static int size;
// static int rear = -1;
// static int front = -1;
// // Here, we are declaring front too as this is a Circular Queue so, the
// position
// // of front will also change.

// Queue(int n) {
// arr = new int[n];
// this.size = n;
// }

// public static boolean isEmpty() {
// // Here, if rear as well as front is -1 then the Queue is empty.
// return rear == -1 && front == -1;
// }

// // Now, we need to mention the condition of full also.
// public static boolean isFull() {
// return (rear + 1) % size == front;
// }

// // Enqueue :-
// public static void add(int data) {
// if (isFull()) {
// System.out.println("Queue is full");
// return;
// }

// // After adding the 1st element we need to increase front too
// if (front == -1) {
// front = 0;
// }

// rear = (rear + 1) % size;
// arr[rear] = data;
// }

// // Dequeue :-
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// int result = arr[front];
// // Single element condition
// if (rear == front) {
// rear = front = -1;
// } else {
// front = (front + 1) % size;
// }

// return result;
// }

// // Peek :-
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return arr[front];
// }
// }

// public static void main(String[] args) {
// Queue q = new Queue(5);
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// System.out.println(q.remove());
// q.add(6);

// System.out.println(q.remove());
// q.add(7);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }
/*---------------------------------------------------------------- */

// 3. Implementing Queue using Linked List.
/*
 * Linked List by default acts like a Queue,
 * The advantage here is that all three operation takes TC = O(1).
 */

// public class QueueClass {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// next = null;
// }
// }

// static class Queue {
// static Node head = null;
// static Node tail = null;

// public static boolean isEmpty() {
// return head == null && tail == null;
// }

// // Enqueue :-
// public static void add(int data) {
// Node newNode = new Node(data);

// if (tail == null) {
// tail = head = newNode;
// return;
// }

// tail.next = newNode;
// tail = newNode;
// }

// // Dequeue :-
// public static int remove() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// int front = head.data;
// if (head == tail) {
// tail = null;
// }

// head = head.next;

// return front;
// }

// // Peek :-
// public static int peek() {
// if (isEmpty()) {
// System.out.println("Queue is empty");
// return -1;
// }

// return head.data;
// }
// }

// public static void main(String[] args) {
// Queue q = new Queue();
// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }
/*---------------------------------------------------------------- */

// 4. Implementing Queue using Java Collection Framework (using LinkedList).

// import java.util.*;

// public class QueueClass {
// public static void main(String[] args) {
// Queue<Integer> q = new LinkedList<>();
// // This Queue can be of any data-type e.g. Queue<Character> q = new
// // LinkedList<>()

// /*
// * Why are we using LinkedList for implementing Queue?
// * Because In Java Queue is an Interface not a Class and Objects can only be
// * constructed of Classes not of Interfaces which we have already studied in
// * OOPS Concept.
// *
// * There are two classes which can implement Queue namely ArrayDeque and
// * LinkedList. There are only some differences between implementing between
// * these two which are based on cache which we don't require here.


// *
// * Which is more preferable?
// * Depends upon the developers choice and cache. You can find the difference
// * between these two on Google.
// */

// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }
/*---------------------------------------------------------------- */

// 5. Implementing Queue using Java Collection Framework (using ArrayDeque).

// import java.util.*;

// public class QueueClass {
// public static void main(String[] args) {
// Queue<Integer> q = new ArrayDeque<>();
// // This Queue can be of any data-type e.g. Queue<Boolean> q = new
// // ArrayDeque<>();

// q.add(1);
// q.add(2);
// q.add(3);
// q.add(4);
// q.add(5);

// while (!q.isEmpty()) {
// System.out.println(q.peek());
// q.remove();
// }
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Implement Queue using two Stacks.

/*
 * Now there are two ways to implement this but neither of these are
 * efficient as an efficient Queue is that which can do add(), remove(), and
 * peek() operations in TC = O(1).
 *
 * In our case if we apply 1st method then remove() will become of TC = O(n) and
 * if we apply 2nd method then add() will become of TC = O(n).
 *
 * Also, a Stack can be converted into Queue only by using more than one Stack,
 * with one Stack we can only implement LIFO but with two Stacks we can convert
 * LIFO into FIFO.
 */

//  Solution :-

import java.util.*;

public class Queues {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // Enqueue :- This is a three step process.
        public void add(int data) {
            // 1. Pushing all the data of s1 to s2 and deleting it from s1 to make s1 empty.
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // 2. Pushing new data to 1st Stack when it is empty.
            s1.push(data);

            // 3. Putting back all the data from s2 to s1 after putting the new element to
            // s1 until s2 is empty.
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Dequeue :-
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        // Peek :-
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
/*---------------------------------------------------------------- */