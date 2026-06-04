/*
// I. Definition of LL
// II. Comparison of ArrayList and LinkedList
// III. Basic Properties of LinkedList
// Time complexity
//
// IV. Structure of a Node in aLL
// V. Types of Linked List
//
// VI. Creation of a Simple Single Linked List + Multiple Node
// VII. Insertion
// VIII. Deletion
// Predefined Methods for Insertion and Deletion in a LinkedList
// IX. Reverse a Linked List
// X. Return Middle Element
// XI. Palindrome of LinkedList
// XII. Remove nth Node from end of list
// XIII. Detect loop cycle in linked list
// XIV. Intersection of two Linked Lists
// XV. Merge Two Sorted LinkedList
// XVI. Find length of LinkedList (iterative + recursive)
// XVII. Delete node given ONLY the node (no head)
// XVIII. Add two numbers represented by LinkedList
// XIX. Rotate LinkedList by K positions
// XX. Remove duplicates (sorted + unsorted)

// ==================================================================================
//
// I. Definition
 * LINKEDLIST :-
 *  => a part of Java Collection Framework
 *  => import using java.util.LinkedList Package
 *  => A data structure that stores multiple collection of elements linked together
 *  in a non-contiguous (non-continuous) memory locations
 //==================================================================================
 // II. Comparison
 * ArrayList vs LinkedList :-
 * ArrayList is implemented by the help of dynamic array and TC to insert an
 * element in the middle of the ArrayList is O(n) and searching TC is O(1).
 * LinkedList, to insert the element in the middle TC is O(1) and to search the
 * element TC is O(n).
 * From above difference we can see that if our main task is to manipulate the
 * data i.e. add/delete then we should use LinkedList and if our main task is to
 * search the data the we should ArrayList data structure.
 //==================================================================================
 //III. Basic Properties
 * Basic properties of a LinkedList :-
 * i. Variable Size :- The size is not fixed at all.
 * ii. Non-contiguous Memory :- The nodes are stored at non-continuous memory
 * locations in the form of chunks and we just create link to those chunks.
 * iii. Insert in O(1).
 * iv. Search in O(n).
 //==================================================================================
 // IV. Structure of a Node
 * Structure of a LinkedList :- A LinkedList is made of basic structure which we
 * call as 'node', each element is called as a node and at last it is connected
 * to an empty node (null node). Each node contains two important data in it.
 * First one is the data (value) and second one is the information/reference
 * (memory address of next node) of the next node. Null node doesn't have next
 * reference.
 *
 * The first node of a LinkedList is called "Head" and we don't have to remember
 * the address of each and every node in a linked list. If we are able to get
 * the address of the 1st node then we can find any node by its help as it
 * contains the address of next node and the next node contains the address of
 * next, next node.
 * Similarly, the last node is also called as "Tail".
 //==================================================================================
 // V. Types of LL
 * There are three types of LinkedList :-
 * i. Singular LinkedList :- Also known as Single Ended LinkedList. In this all
 * the nodes are connected only in one direction. It contains only
 * "next pointer".
 *
 * ii. Doubly LinkedList :- Also known as Double Ended LinkedList. In this all
 * the nodes are connected in both the direction. It contains both "next" as
 * well as "previous" pointers.
 *
 * iii. Circular LinkedList :- In this the last node is connected to the 1st
 * node i.e. Head and Tail are connected where tail is never a null node. It can
 * also be on Singly or Doubly type.
 */
//==================================================================================
// VI.(a) Creation of Simple Single Linked List

//class SinglyLinkedList {
//
//    static class Node {
//        int data;
//        Node next;
//
//        // Constructor must be inside the Node class
//        Node(int data, Node next) {
//            this.data = data;
//            this.next = next;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(10, null);
//        System.out.print(head.data);
//
//        Node current = new Node(20, null);
//        System.out.print(" " + current.data);
//    }
//}
//==================================================================================
// VI.(b) Creation of Single Linked List with Multiple Nodes
//import java.util.*;
//
//class SinglyLinkedList {
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method that creates the entire linked list (including head)
//    public static Node createLinkedList(int n) {
//
//        if (n <= 0) {
//            return null;
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter nodes one by one: ");
//
//        //Creation of head node
//        int data = sc.nextInt();
//        Node head = new Node(data);   // head created here
//
//        Node current = head;
//        //head ──► [10 | null]
//        //current ─┘
//        /*Node current = head; assigns a temporary pointer to the head node so we can traverse or add nodes without losing the reference to the first node.*/
//
//        for (int i = 1; i < n; i++) {
//            data = sc.nextInt();
//            current.next = new Node(data);
//            current = current.next;
//        }
//
//        return head; // We keep track of first node of LL
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//
//        // Display the linked list
//        System.out.print("Singly Linked List: ");
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//}
//==================================================================================
// VII. Insertion
//import java.util.*;
//
//class SinglyLinkedList {
//
//    // Node definition
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method to create a singly linked list (including head)
//    public static Node createLinkedList(int n) {
//
//        if (n <= 0) {
//            return null;
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("\n----- Singly Linked List Creation -----");
//        System.out.print("Enter nodes one by one: ");
//
//        // Create head node
//        int data = sc.nextInt();
//        Node head = new Node(data);
//
//        Node current = head;
//
//        // Create remaining nodes
//        for (int i = 1; i < n; i++) {
//            data = sc.nextInt();
//            current.next = new Node(data);
//            current = current.next;
//        }
//
//        return head;
//    }
//
//    // Insert at beginning
//    public static Node insertBegin(Node head, int data) {
//        Node newNode = new Node(data);
//
//        // Base case: empty list
//        if (head == null) {
//            return newNode;
//        }
//
//        newNode.next = head;
//        head = newNode;
//        return head;
//    }
//
//    //Insert at end
//    public static Node insertEnd(Node head, int data) {
//        Node newNode = new Node(data);
//
//        // Base case: empty list
//        if (head == null) {
//            return newNode;
//        }
//
//        Node current = head;
//
//        while(current.next!=null){
//            current = current.next;
//        }
//        current.next = newNode;
//        return head;
//    }
//
//    //Insert at specified position
//    public static Node insertPos(Node head, int data, int pos) {
//        Node newNode = new Node(data);
//
//        // Base case: empty list
//        if (head == null) {
//            return newNode;
//        }
//
//        Node current = head;
//
//        for(int i=0;i<(pos-1);i++){
//            current = current.next;
//        }
//
//        Node tmp = current.next;
//
//        current.next = newNode;
//        newNode.next = tmp;
//
//        return head;
//    }
//
//    // Display the linked list
//    public static void displayList(Node head) {
//        System.out.println("----- Linked List -----");
//        System.out.print("List elements: ");
//
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data);
//            if (temp.next != null) {
//                System.out.print(" -> ");
//            }
//            temp = temp.next;
//        }
//        System.out.println(" -> end");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Base case
//        //Node head = null;   // empty list
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//        System.out.println("\nAfter Creation of Linked List: ");
//        displayList(head);
//
//        System.out.print("\nEnter data to insert at beginning: ");
//        int value_begin = sc.nextInt();
//        head = insertBegin(head, value_begin);
//
//        System.out.println("\nAfter Inserting data at end of Linked List: ");
//        displayList(head);
//
//        System.out.print("\nEnter data to insert at end: ");
//        int value_end = sc.nextInt();
//        head = insertEnd(head, value_end);
//
//        System.out.println("\nAfter Inserting data at end of Linked List: ");
//        displayList(head);
//
//        System.out.print("\nEnter pos to insert : ");
//        int pos = sc.nextInt();
//        System.out.print("\nEnter data to insert at: " + pos);
//        int value_pos = sc.nextInt();
//        head = insertPos(head, value_pos, pos);
//
//        System.out.println("\nAfter Inserting data at "+pos+" of Linked List: ");
//        displayList(head);
//    }
//}
/*---------------------------------------------------------------- */
//==================================================================================
// VIII. Deletion
//import java.util.*;
//
//class SinglyLinkedList {
//
//    // Node definition
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method to create a singly linked list (including head)
//    public static Node createLinkedList(int n) {
//
//        if (n <= 0) {
//            return null;
//        }
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("\n----- Singly Linked List Creation -----");
//        System.out.print("Enter nodes one by one: ");
//
//        // Create head node
//        int data = sc.nextInt();
//        Node head = new Node(data);
//
//        Node current = head;
//
//        // Create remaining nodes
//        for (int i = 1; i < n; i++) {
//            data = sc.nextInt();
//            current.next = new Node(data);
//            current = current.next;
//        }
//
//        return head;
//    }
//
//    //Deletion at Beginning
//    public static Node deleteBegin(Node head){
//        head = head.next;
//        return head;
//    }
//
//    //Deletion at End
//    public static void deleteEnd(Node head){
//        Node current = head ;
//        Node prevNode = head;
//        while(current.next!=null){
//            prevNode = current;
//            current = current.next;
//        }
//        prevNode.next = null;
//    }
//
//    //Deletion at specific position
//    public static void deletePos(Node head, int pos){
//        Node current = head ;
//        Node prevNode = head;
//        for(int i=0;i<pos-1;i++){
//            current = current.next;
//        }
//        current.next = current.next.next;
//    }
//
//    // Display the linked list
//    public static void displayList(Node head) {
//        System.out.println("----- Linked List -----");
//        System.out.print("List elements: ");
//
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data);
//            if (temp.next != null) {
//                System.out.print(" -> ");
//            }
//            temp = temp.next;
//        }
//        System.out.println(" -> end");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        // Base case
//        //Node head = null;   // empty list
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//        System.out.println("\nAfter Creation of Linked List: ");
//        displayList(head);
//
//        System.out.println("\nAfter Deletion at beginning of Linked List: ");
//        Node newHead = deleteBegin(head);
//        displayList(newHead);
//
//        System.out.println("\nAfter Deletion at end of Linked List: ");
//        deleteEnd(head);
//        displayList(newHead);
//
//        System.out.print("\nEnter pos to delete : ");
//        int pos = sc.nextInt();
//        System.out.println("\nAfter Deletion at pos of Linked List: ");
//        deletePos(head,pos);
//        displayList(head);
//
//    }
//}
//==================================================================================
//Predefined Methods to insert and delete elements in a LinkedList
//import java.util.LinkedList;
//class SinglyLinkedList {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        // Add elements
//        list.add(10);          // add at end
//        list.add(20);
//        list.addFirst(5);      // add at beginning
//        list.addLast(30);      // add at end
//        list.add(2, 15);       // add at index 2
//
//        System.out.println("After insertion:");
//        System.out.println(list);
//
//        // Remove elements
//        list.removeFirst();    // remove from beginning
//        list.removeLast();     // remove from end
//        list.remove(1);        // remove element at index 1
//
//        System.out.println("After deletion:");
//        System.out.println(list);
//    }
//}
//==================================================================================
// IX. Reverse a LinkedList
//import java.util.*;
//
//class SinglyLinkedList {
//
//    // Node definition
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method to create linked list (as you gave earlier)
//    public static Node createLinkedList(int n) {
//
//        if (n <= 0) return null;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter nodes one by one: ");
//
//        Node head = new Node(sc.nextInt());
//        Node current = head;
//
//        for (int i = 1; i < n; i++) {
//            current.next = new Node(sc.nextInt());
//            current = current.next;
//        }
//        return head;
//    }
//
//    // Reverse linked list (MY logic)
//    public static Node reverseList(Node head) {
//
//        if (head == null || head.next == null)
//            return head;
//
//        Node prevNode = head;
//        Node currentNode = head.next;
//
//        while (currentNode != null) {
//            Node nextNode = currentNode.next;
//
//            currentNode.next = prevNode;
//
//            prevNode = currentNode;
//            currentNode = nextNode;
//        }
//        head.next = null;
//        head = prevNode;
//
//        return head;
//    }
//
//    // Display list
//    public static void displayList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("end");
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//
//        System.out.println("Original List:");
//        displayList(head);
//
//        head = reverseList(head);
//
//        System.out.println("Reversed List:");
//        displayList(head);
//    }
//}

/*---------------------------------------------------------------- */

//==================================================================================

// IX (b). Alternatively using Recursive approach :-

// public class SinglyLinkedList {
// Node head;
// private int size;

// SinglyLinkedList() {
// this.size = 0;
// }

// class Node {
// String data;
// Node next;

// Node(String data) {
// this.data = data;
// this.next = null;
// size++;
// }
// }

// public void addFirst(String data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// public void addLast(String data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }

// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;
// }

// currNode.next = newNode;
// }

// public void printList() {
// if (head == null) {
// System.out.println("List is empty");
// return;
// }

// Node currNode = head;
// while (currNode != null) {
// System.out.print(" " + currNode.data + " " + "-->" + " ");
// currNode = currNode.next;
// }

// System.out.println("Null");
// }

// public void deleteFirst() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;
// head = head.next;
// }

// public void deleteLast() {
// if (head == null) {
// System.out.println("This list is empty");
// return;
// }
// size--;

// if (head.next == null) {
// head = null;
// return;
// }

// Node secondLast = head;
// Node lastNode = head.next;
// while (lastNode.next != null) {
// lastNode = lastNode.next;
// secondLast = secondLast.next;
// }

// secondLast.next = null;
// }

// public int getSize() {
// return size;
// }

// // Method to reverse a LinkedList.
// public Node reverseRecursive(Node head) {
// // Base case
// if (head == null || head.next == null) {
// return head;
// }

// Node newHead = reverseRecursive(head.next);
// head.next.next = head;
// head.next = null;

// return newHead;
// }

// public static void main(String args[]) {
// SinglyLinkedList list = new SinglyLinkedList();
// list.addFirst("a");
// list.addFirst("is");
// list.addFirst("This");
// list.printList();

// list.addLast("list");
// list.printList();

// list.head = list.reverseRecursive(list.head);
// list.printList();
// }
// }
/*---------------------------------------------------------------- */
//==================================================================================

// X. Return Middle Element of LinkedList
//import java.util.*;
//class SinglyLinkedList {
//
//    // Node definition
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method to create linked list (as you gave earlier)
//    public static Node createLinkedList(int n) {
//
//        if (n <= 0) return null;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter nodes one by one: ");
//
//        Node head = new Node(sc.nextInt());
//        Node current = head;
//
//        for (int i = 1; i < n; i++) {
//            current.next = new Node(sc.nextInt());
//            current = current.next;
//        }
//        return head;
//    }
//
//    // Display list
//    public static void displayList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("end");
//    }
//
//    // Method to return middle element (your approach)
//    public static int getMiddle(Node head) {
//
//        if (head == null) return -1;
//
//        // Step 1: count nodes
//        int count = 0;
//        Node temp = head;
//
//        // Length of LinkedList
//        while (temp != null) {
//            count++;
//            temp = temp.next;
//        }
//
//        // Step 2: find middle index
//        int middle = count / 2;
//
//        // Step 3: traverse to middle
//        temp = head;
//        for (int i = 0; i < middle; i++) {
//            temp = temp.next;
//        }
//
//        // Step 4: return middle data
//        return temp.data;
//    }
//
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//
//        System.out.println("Original List:");
//        displayList(head);
//
//        System.out.println("The Middle Node is: " + getMiddle(head));
//
//    }
//}
//==================================================================================
// Two pointer approach to return Middle element in the linked list.
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    // Function to find middle of linked list
//    static Node findMiddle(Node head) {
//
//        if (head == null)
//            return null;
//
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;        // move 1 step
//            fast = fast.next.next;  // move 2 steps
//        }
//
//        return slow; // slow is at middle
//    }
//
//    // Main method
//    public static void main(String[] args) {
//
//        // Creating linked list: 10 -> 20 -> 30 -> 40 -> 50
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//
//        Node middle = findMiddle(head);
//
//        if (middle != null)
//            System.out.println("Middle element is: " + middle.data);
//    }
//}
//==================================================================================
//XI. Palindrome of LinkedList
// Qs. Palindrome Linked List. (Leet Code Q.234, Level = Easy).

// The driver code is already given on Leet Code, I'll write the logic here.
// There are various ways to do this question like we can convert this
// LinkedList to an Array or String or an ArrayList and the we can compare the
// elements as we did in Arrays or Strings but these approach will consume
// extra memory as we need to create a new Array or String or ArrayList.

// Here, I'll follow an approach which will not consume any extra memory. My
// approach is 1st find the middle of the LL and then reverse either 1st half or
// 2nd half of the LL and then compare the 1st half with 2nd half, if 1st half
// is equal to 2nd half then it's palindrome.

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    // Display list
//    public static void displayList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("end");
//    }
//
//    // Reverse linked list (your logic)
//    public static Node reverseList(Node head) {
//        if (head == null || head.next == null)
//            return head;
//
//        Node prevNode = head;
//        Node currentNode = head.next;
//
//        while (currentNode != null) {
//            Node nextNode = currentNode.next;
//
//            currentNode.next = prevNode;
//
//            prevNode = currentNode;
//            currentNode = nextNode;
//        }
//
//        head.next = null; // old head becomes tail
//        head = prevNode;  // new head
//        return head;
//    }
//
//    // Find middle node using two-pointer approach
//    public static Node findMiddle(Node head) {
//        if (head == null)
//            return null;
//
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;       // move 1 step
//            fast = fast.next.next;  // move 2 steps
//        }
//
//        return slow; // slow is at middle
//    }
//
//    // Check if linked list is palindrome
//    public static boolean isPalindrome(Node head) {
//        if (head == null || head.next == null)
//            return true;
//
//        // Step 1: Find middle
//        Node middle = findMiddle(head);
//
//        // Step 2: Reverse second half
//        Node secondHalfStart = reverseList(middle);
//
//        // Step 3: Compare first half and second half
//        Node firstIter = head;
//        Node secondIter = secondHalfStart;
//        boolean palindrome = true;
//
//        while (secondIter != null) {
//            if (firstIter.data != secondIter.data) {
//                palindrome = false;
//                break;
//            }
//            firstIter = firstIter.next;
//            secondIter = secondIter.next;
//        }
//
//        // Step 4: Optional: Restore second half (to keep original list)
//        reverseList(secondHalfStart);
//
//        return palindrome;
//    }
//
//    public static void main(String[] args) {
//
//        // Creating linked list: 1 -> 2 -> 3 -> 2 -> 1
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(2);
//        head.next.next.next.next = new Node(1);
//
//        System.out.println("Original List:");
//        displayList(head);
//
//        System.out.println("Is Palindrome? " + isPalindrome(head));
//
//        System.out.println("List after checking palindrome:");
//        displayList(head);
//    }
//}
//==================================================================================
// XII. Remove nth Node from end of list
// (Leet Code Q.19, Level = Medium).
// The driver code is already given on Leet Code, here we will just perform the
// solution of the question.
//
//public class SinglyLinkedList {
//
//    static class Node {
//        int data;
//        Node next;
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Remove N-th node from end using size calculation
//    public static Node removeNthFromEnd(Node head, int n) {
//        // Edge case: list has only one node
//        if (head.next == null) {
//            return null;
//        }
//
//        // Step 1: Count size of the list
//        int size = 0;
//        Node curr = head;
//        while (curr != null) {
//            size++;
//            curr = curr.next;
//        }
//
//        // Step 2: If n == size, remove the first node
//        if (n == size) {
//            return head.next;
//        }
//
//        // Step 3: Find the node **just before** the node to remove
//        int indexToSearch = size - n; // 0-indexed: node to remove is at index size-n
//        Node prev = head;
//        for (int i = 1; i < indexToSearch; i++) {
//            prev = prev.next;
//        }
//
//        // Step 4: Delete the target node
//        if (prev.next != null) {
//            prev.next = prev.next.next;
//        }
//
//        return head; // return original head
//    }
//
//    // Display linked list
//    public static void displayList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data);
//            if (temp.next != null) System.out.print(" -> ");
//            temp = temp.next;
//        }
//        System.out.println(" -> end");
//    }
//
//    public static void main(String[] args) {
//        // Create linked list: 10 -> 20 -> 30 -> 40 -> 50
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//
//        System.out.println("Original List:");
//        displayList(head);
//
//        int n = 2; // Remove 2nd node from end
//        head = removeNthFromEnd(head, n);
//
//        System.out.println("After removing " + n + "-th node from end:");
//        displayList(head);
//    }
//}
//==================================================================================
// XIII. Detect loop cycle in linked list
//
//import java.util.HashMap;
//import java.util.Scanner;
//
//class SinglyLinkedList {
//
//    // Node definition
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    // Method to create linked list
//    public static Node createLinkedList(int n) {
//        if (n <= 0) return null;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter nodes one by one: ");
//
//        Node head = new Node(sc.nextInt());
//        Node current = head;
//
//        for (int i = 1; i < n; i++) {
//            current.next = new Node(sc.nextInt());
//            current = current.next;
//        }
//
//        return head;
//    }
//
//    // Detect loop using HashMap
//    public static boolean detectLoop(Node head) {
//        HashMap<Node, Boolean> visited = new HashMap<>();
//        Node current = head;
//
//        while (current != null) {
//            if (visited.containsKey(current)) {
//                return true; // loop found
//            }
//            visited.put(current, true);
//            current = current.next;
//        }
//
//        return false; // no loop
//    }
//
//    // Method to create loop at given position
//    public static void createLoop(Node head, int pos) {
//        if (head == null || pos < 0) return;
//
//        // Step 1: Move tail to the last node
//        Node tail = head;
//        while (tail.next != null) {
//            tail = tail.next;
//        }
//
//        // Step 2: Move current to the node at index = pos
//        Node current = head;
//        int index = 0;
//
//        while (index < pos && current != null) {
//            current = current.next;
//            index++;
//        }
//
//        // Step 3: Connect tail to the node at position pos
//        if (current != null) {
//            tail.next = current;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of nodes: ");
//        int n = sc.nextInt();
//
//        Node head = createLinkedList(n);
//
//        System.out.print("Enter position to connect tail for loop (-1 for no loop): ");
//        int pos = sc.nextInt();
//
//        createLoop(head, pos);
//
//        boolean hasLoop = detectLoop(head);
//        System.out.println("Loop detected: " + hasLoop);
//
//    }
//}
//==================================================================================
// XIV. Intersection of two Linked Lists
//class ListNode {
//    int data;
//    ListNode next;
//
//    ListNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//
//        if (headA == null || headB == null) return null;
//
//        ListNode a = headA;
//        ListNode b = headB;
//
//        while (a != b) {
//            a = (a == null) ? headB : a.next;
//            b = (b == null) ? headA : b.next;
//        }
//
//        return a; // intersection node or null
//    }
//
//    public static void main(String[] args) {
//
//        // ----- Create shared intersection part: 2 → 3 → 4 -----
//        ListNode n1 = new ListNode(1);
//        ListNode n2 = new ListNode(2);
//        ListNode n3 = new ListNode(3);
//        ListNode n4 = new ListNode(4);
//
//        // ----- List A: 1 → 2 → 3 → 4 -----
//
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//
//
//        // ----- List B: 11 → 12 → 13 → 14 → 2 → 3 → 4 -----
//        ListNode b1 = new ListNode(11);
//        ListNode b2 = new ListNode(12);
//        ListNode b3 = new ListNode(13);
//        ListNode b4 = new ListNode(14);
//
//        b1.next = b2;
//        b2.next = b3;
//        b3.next = b4;
//        b4.next = n2;   // intersection starts here
//
//        // ----- Find intersection -----
//        ListNode result = getIntersectionNode(n1, b1);
//
//        if (result != null) {
//            System.out.println("Intersection Node: " + result.data);
//        } else {
//            System.out.println("No intersection");
//        }
//    }
//}
//==================================================================================
// XV. Merge Two Sorted Linked Lists
//public class SinglyLinkedList {
//
//    // Static inner class Node
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static Node merge(Node headA, Node headB) {
//        Node a = headA;
//        Node b = headB;
//
//        Node head = null; // head of merged list
//        Node tail = null; // tail of merged list
//
//        while (a != null && b != null) {
//            Node temp;
//            if (a.data <= b.data) {
//                temp = a;
//                a = a.next;
//            } else {
//                temp = b;
//                b = b.next;
//            }
//
//            if (head == null) {
//                head = temp;
//                tail = temp;
//            } else {
//                tail.next = temp;
//                tail = temp;
//            }
//        }
//
//        while (a != null) {
//            tail.next = a;
//            tail = a;
//            a = a.next;
//        }
//
//        while (b != null) {
//            tail.next = b;
//            tail = b;
//            b = b.next;
//        }
//
//        return head;
//    }
//
//    // Helper method to print linked list
//    public static void printList(Node head) {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    // Main method to test merge
//    public static void main(String[] args) {
//        // First list: 1 -> 3 -> 5
//        Node headA = new Node(3);
//        headA.next = new Node(6);
//        headA.next.next = new Node(10);
//
//        // Second list: 2 -> 4 -> 6
//        Node headB = new Node(2);
//        headB.next = new Node(7);
//        headB.next.next = new Node(9);
//
//        Node mergedHead = merge(headA, headB);
//
//        System.out.print("Merged List: ");
//        printList(mergedHead);
//    }
//}
//==================================================================================
// XVI. Reverse in a group of k

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    static Node reverseList(Node head) {
//        Node prev = null, curr = head, next;
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    static Node reverseKGroup(Node head, int k) {
//
//        if (head == null) return null;
//
//        Node curr = head;
//        int count = 1;
//
//        while (curr != null && count < k) {
//            curr = curr.next;
//            count++;
//        }
//
//        if (curr == null) return head;
//
//        Node nextGroupHead = curr.next;
//        curr.next = null; // CUT
//
//        Node newHead = reverseList(head);
//
//        head.next = reverseKGroup(nextGroupHead, k);
//
//        return newHead;
//    }
//
//    static void print(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // 1 2 3 4 5 6 7 8
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);
//        head.next.next.next.next.next.next.next = new Node(8);
//
//        head = reverseKGroup(head, 3);
//        print(head);
//    }
//}
//==================================================================================
// XVII. Swap pairs in a LinkedList

//same code as above but the thing, replace k =2
//approach - 1

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    static Node reverseList(Node head) {
//        Node prev = null, curr = head, next;
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    static Node reverseKGroup(Node head, int k) {
//
//        if (head == null) return null;
//
//        Node curr = head;
//        int count = 1;
//
//        while (curr != null && count < k) {
//            curr = curr.next;
//            count++;
//        }
//
//        if (curr == null) return head;
//
//        Node nextGroupHead = curr.next;
//        curr.next = null; // CUT
//
//        Node newHead = reverseList(head);
//
//        head.next = reverseKGroup(nextGroupHead, k);
//
//        return newHead;
//    }
//
//    static void print(Node head) {
//        while (head != null) {
//            System.out.print(head.data + " ");
//            head = head.next;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        // 1 2 3 4 5 6 7 8
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//        head.next.next.next.next.next = new Node(6);
//        head.next.next.next.next.next.next = new Node(7);
//        head.next.next.next.next.next.next.next = new Node(8);
//
//        head = reverseKGroup(head, 2);
//        print(head);
//    }
//}

// approach - 2
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//public class SinglyLinkedList {
//
//    // swap function
//    static void swap(Node a, Node b) {
//        int temp = a.data;
//        a.data = b.data;
//        b.data = temp;
//    }
//
//    // function to swap pairs
//    static void pairwiseSwap(Node head) {
//        Node curr = head;
//
//        while (curr != null && curr.next != null) {
//            swap(curr, curr.next);
//            curr = curr.next.next; // move to next pair
//        }
//    }
//
//    // utility to print list
//    static void printList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }
//    }
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//
//        pairwiseSwap(head);
//        printList(head);
//    }
//}

//==================================================================================
//==================================================================================
//==================================================================================
/*---------------------------------------------------------------- */