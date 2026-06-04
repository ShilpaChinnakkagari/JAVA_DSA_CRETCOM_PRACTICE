/*
 * What is Tree?
 * Tree is a hierarchy data structure. Till now we have studies Arrays,
 * ArrayList, LinkedList, Stacks, Queues, etc. all these are linear data
 * structures but Tree is a non-linear data structure.
 *
 * To write code for Tree we have a "Root Node" which has some data in it, from
 * this we will have so many branches coming out, which will form more Nodes,
 * which will further get distributed and further more Nodes are created. And
 * the Node from which no further branches are coming are know as "Leaf Node".
 *
 * The above structure is for General Tree which can have n-Nodes from a single
 * Node, but on Binary Tree we have maximum of two Node from a single Node.
 *
 * Common terms to remember in Tree are :- Parent Node (Root Node), Children
 * Node (Left Child and Right Child), Sibling Nodes, Ancestor Node, Levels
 * (Depth) and Subtree in a tree.
 *
 * A parent can also have only a Right Child or only a Left Child. And a Subtree
 * in tree can have a Left Subtree and a Right Subtree.
 */

//==================================================================================

/*
THEORY :
======
TREE
Definition : A tree is a non-linear, hierarchical data structure that consists of nodes
connected by edges
--> It is used to represent the data that has a parent-child relationship.
--> Unlike Arrays, Stacks or Queues which are linear, a tree allows multiple paths
    to reach different data elements.

--> Examples : File Systems

BASIC TERMINOLOGIES OF TRESS :
=============================
1. Node : A Node is a basic unit of a Tree that contains data and links to other nodes( reference).
2. Root : The top most node of a tree
            A tree can have only one root
3. Edge : is the connection between two nodes
4. Parent : A node that has one or more children is a parent node.
5. Child : A node that has a parent
 */

/*
A BST is something that in which the structure so that the tree remains shallow
 */

//==================================================================================
// Qs. Build Tree Pre-order.
// 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1

// Solution :-
// Here, all -1 represents a null Node.

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public static Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// System.out.println(root.data);
// }
// }
/*---------------------------------------------------------------- */

// Now there are four ways to travel on a Tree :-

/*
 * 1. Pre-order Traversal :- It is a recursive technique to travel on a tree. It
 * has some rule i.e first travel on Root then on Left Subtree and then on Right
 * Subtree which also means that it is following DFS -> Depth First Search.
 *
 * This is called Pre-order because the Root comes at first. Also its TC = O(n)
 * as we are traversing one at a time throughout the Array.
 */

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Pre-order Traversal
// public static void preorder(Node root) {
// if (root == null) {
// System.out.print(-1 + " ");
// return;
// }

// System.out.print(root.data + " ");
// preorder(root.left);
// preorder(root.right);
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// preorder(root);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 2. In-order Traversal :- It has some rule i.e first travel on Left
 * Subtree and Root then on Right Subtree which also means that it is
 * following DFS -> Depth First Search.
 *
 * It is called In-order Traversal because the Root comes in the middle.
 * Also its TC = O(n) as we are traversing one at a time throughout the Array.
 */

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // In-order Traversal
// public static void inorder(Node root) {
// if (root == null) {
// return;
// }

// inorder(root.left);
// System.out.print(root.data + " ");
// inorder(root.right);
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// inorder(root);
// }
// }
/*---------------------------------------------------------------- */

/*
 * 3. Post-order Traversal :- It has some rule i.e first travel on Left
 * Subtree and Right Subtree and then on Root which also means that it is
 * following DFS -> Depth First Search.
 *
 * It is called Post-order Traversal because the Root comes at last.
 * Also its TC = O(n) as we are traversing one at a time throughout the Array.
 */

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Post-order Traversal
// public static void postorder(Node root) {
// if (root == null) {
// return;
// }

// postorder(root.left);
// postorder(root.right);
// System.out.print(root.data + " ");
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// postorder(root);
// }
// }
/*---------------------------------------------------------------- */

/*
 * VVI 4. Level Order Traversal :- Here, we print elements on the basis of
 * its level and it can not be done simply like other traversal because it
 * doesn't use Recursion instead uses Iteration. (Microsoft, Facebook, Adobe)
 * Level Hard
 *
 * This problem is from LeetCode Binary Tree Level Order Traversal.
 *
 * So, in order to achieve this we use another data structure for this i.e
 * Queue.
 *
 * Why Queue?
 * So that we can use its FIFO property and which also means that it is
 * following BFS -> Breadth First Search along will a null so that we can
 * move on to new line before printing the next level.
 *
 * Also its TC = O(n) as we are traversing one at a time throughout the Array.
 */

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);
// }
// }
/*---------------------------------------------------------------- */

// Qs. Count of Nodes. TC = O(n)
// Level Easy
// This problem is from LeetCode Count Complete Tree Nodes.

// Solution :-
// Most of the solutions can be solved easily using Recursion.

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // Count of Nodes.
// public static int countOfNodes(Node root) {
// if (root == null)
// return 0;

// int leftNode = countOfNodes(root.left);
// int rightNode = countOfNodes(root.right);

// return leftNode + rightNode + 1;
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);

// System.out.println();
// System.out.println("No. of Nodes = " + countOfNodes(root));
// }
// }
/*---------------------------------------------------------------- */

// Qs. Sum of Nodes. TC = O(n)

// Solution :-

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // Sum of Nodes.
// public static int sumOfNodes(Node root) {
// if (root == null)
// return 0;

// int leftSum = sumOfNodes(root.left);
// int rightSum = sumOfNodes(root.right);

// return leftSum + rightSum + root.data;

// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);

// System.out.println();
// System.out.println("Sum of Nodes = " + sumOfNodes(root));
// }
// }
/*---------------------------------------------------------------- */

// Qs. Height of a Tree. TC = O(n)

// Solution :-

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // Height of a Tree
// public static int heightOfTree(Node root) {
// if (root == null)
// return 0;

// int leftHeight = heightOfTree(root.left);
// int rightHeight = heightOfTree(root.right);

// int height = Math.max(leftHeight, rightHeight) + 1;

// return height;

// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);

// System.out.println();
// System.out.println("Height of Tree = " + heightOfTree(root));
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Diameter of a Tree (No. of Nodes in the Longest path between
// any 2 Nodes). TC = O(n) (Adobe, Snapdeal)
// Level Easy
// This problem is from LeetCode Diameter of Binary Tree.

// Solution :-
// It can have two cases:- 1. Dia. through Root, 2. Dia. not through Root.
// Also, there are two approaches to solve our problem.

// // Approach 1 : TC = O(n^2).

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;




// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // Height of a Tree. TC = O(n)
// public static int heightOfTree(Node root) {
// if (root == null)
// return 0;

// int leftHeight = heightOfTree(root.left);
// int rightHeight = heightOfTree(root.right);

// int height = Math.max(leftHeight, rightHeight) + 1;

// return height;

// }

// // Diameter of a Tree. TC = O(n)
// public static int diameter(Node root) {
// if (root == null)
// return 0;

// int dia1 = diameter(root.left);
// int dia2 = diameter(root.right);
// int dia3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

// return Math.max(dia3, Math.max(dia1, dia2));
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);

// System.out.println();
// System.out.println("Diameter of Tree = " + diameter(root));
// }
// }
/*---------------------------------------------------------------- */

// Approach 2 : TC = O(n).
// If we would have not written method for height and diameter separately
// then the TC = O(n).

// import java.util.LinkedList;
// import java.util.Queue;

// public class Trees
// {
// // This Node class will represent each Node of a tree.
// static class Node {
// int data;
// Node left;
// Node right;

// Node(int data) {
// this.data = data;
// this.left = null;
// this.right = null;
// }
// }

// static class BinaryTree {
// // Defining a static variable with -1 so that we can traverse throughout the
// // array.
// static int idx = -1;

// // This will take all the Node from a Tree and will return it to Root Node
// public Node buildTree(int nodes[]) {
// idx++;

// if (nodes[idx] == -1) {
// return null;
// }

// Node newNode = new Node(nodes[idx]);
// newNode.left = buildTree(nodes);
// newNode.right = buildTree(nodes);

// return newNode;
// }
// }

// // Level Order Traversal
// public static void levelOrder(Node root) {
// if (root == null) {
// return;
// }

// Queue<Node> q = new LinkedList<>();
// q.add(root);
// q.add(null);

// while (!q.isEmpty()) {
// Node currNode = q.remove();
// if (currNode == null) {
// System.out.println();
// if (q.isEmpty()) {
// break;
// } else {
// q.add(null);
// }
// } else {
// System.out.print(currNode.data + " ");
// if (currNode.left != null) {
// q.add(currNode.left);
// }

// if (currNode.right != null) {
// q.add(currNode.right);
// }
// }
// }
// }

// // Creating a class which can store both Diameter and Height together.
// static class TreeInfo {
// int height;
// int dia;

// TreeInfo(int height, int dia) {
// this.height = height;
// this.dia = dia;
// }
// }

// // Both diameter and height are being calculated in same method.
// public static TreeInfo diameter(Node root) {
// if (root == null) {
// return new TreeInfo(0, 0);
// }

// TreeInfo left = diameter(root.left);
// TreeInfo right = diameter(root.right);

// int heightOfTree = Math.max(left.height, right.height) + 1;

// int dia1 = left.dia;
// int dia2 = right.dia;
// int dia3 = left.height + right.height + 1;

// int myDia = Math.max(Math.max(dia1, dia2), dia3);

// TreeInfo info = new TreeInfo(heightOfTree, myDia);
// return info;
// }

// public static void main(String[] args) {
// int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

// BinaryTree tree = new BinaryTree();
// // This will represent the complete Tree.
// Node root = tree.buildTree(nodes);

// levelOrder(root);

// System.out.println();
// System.out.println("Diameter of Tree = " + diameter(root).dia);
// }
// }
/*---------------------------------------------------------------- */

// VVI Qs. Subtree of another Tree. TC = O() (Microsoft, Facebook, Amazon)
// Level Easy
// I am not going to write the entire solution but I'll do the main solution.
// This problem is from LeetCode Subtree of Another Tree

// import javax.swing.tree.TreeNode;

// public class Trees
// {
// public boolean isIdentical(TreeNode root, TreeNode subRoot) {
// if (root == null && subRoot == null) {
// return true;
// }

// if (root == null || subRoot == null) {
// return false;
// }

// if (root.val == subRoot.val) {
// return isIdentical(root.left, subRoot.left) && isIdentical(root.right,
// subRoot.right);
// }

// return false;
// }

// public boolean isSubtree(TreeNode root, TreeNode subRoot) {
// if (subRoot == null) {
// return true;
// }

// if (root == null) {
// return false;
// }

// if (root.val == subRoot.val) {
// if (isIdentical(root, subRoot)) {
// return true;
// }
// }

// return isSubtree(root.Left, subRoot) || isSubtree(root.right, subRoot);
// }
// }
/*---------------------------------------------------------------- */

// binary tree : in order, pre order, post order
//public class tree{
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//    public static void inorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        inorder(root.left);
//        System.out.println(root.data+" ");
//        inorder(root.right);
//    }
//
//    public static void preorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        System.out.println(root.data+" ");
//        inorder(root.left);
//        inorder(root.right);
//    }
//
//    public static void postorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        inorder(root.left);
//        inorder(root.right);
//        System.out.println(root.data+" ");
//    }
//
//    public static void main(String[] args){
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        System.out.print("pre-order:");
//        preorder(root);
//
//    }
//}


// height, traversals, countnodes
//public class tree{
//    static class Node {
//        int data;
//        Node left;
//        Node right;
//
//        Node(int data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//    public static void inorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        inorder(root.left);
//        System.out.println(root.data+" ");
//        inorder(root.right);
//    }
//
//    public static void preorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        System.out.println(root.data+" ");
//        inorder(root.left);
//        inorder(root.right);
//    }
//
//    public static void postorder(Node root){
//        if(root == null){
//            return;
//        }
//
//        inorder(root.left);
//        inorder(root.right);
//        System.out.println(root.data+" ");
//    }
//
//    public static int countNodes(Node root){
//        if (root == null) {
//            return 0;
//        }
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }
//
//    public static int heightOfTree(Node root){
//        if (root == null) {
//            return -1;
//        }
//        return 1 + Math.max(heightOfTree(root.left) , heightOfTree(root.right));
//    }
//
//    public static void printLeaves(Node root){
//        if (root == null) {
//            return -1;
//        }
//        return 1 + Math.max(heightOfTree(root.left) , heightOfTree(root.right));
//    }
//
//    public static void main(String[] args){
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        System.out.print("pre-order:");
//        preorder(root);
//
//        System.out.print("coutn nodes:"+ countNodes(root));
//        System.out.print("\nheights nodes:"+ heightOfTree(root));
//
//    }
//}

// mirror
//
//import java.util.*;
//
//class Node {
//    int data;
//    Node left, right;
//
//    Node(int data) {
//        this.data = data;
//        left = right = null;
//    }
//}
//
//public class Main {
//
//    static Node mirror(Node root) {
//        if (root == null) return null;
//
//        Node temp = root.left;
//        root.left = mirror(root.right);
//        root.right = mirror(temp);
//
//        return root;
//    }
//
//    static void levelOrder(Node root) {
//        if (root == null) return;
//
//        Queue<Node> q = new LinkedList<>();
//        q.add(root);
//
//        while (!q.isEmpty()) {
//            Node curr = q.poll();
//            System.out.print(curr.data + " ");
//
//            if (curr.left != null) q.add(curr.left);
//            if (curr.right != null) q.add(curr.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//
//        root = mirror(root);
//        levelOrder(root);
//    }
//}

