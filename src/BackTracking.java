// I. Defintion
// II. All Possible Permutations of a given String
// III.
// ==================================================================================
// I. Defintion
/* BACKTRACKING
 * What is BackTracking?
 * It helps us to find all the possible solutions and then out of them we can
 * use the one we want.
 *
 * => In advance Recursion we have used Backtracking and here
 * also we are going to study the concept of Backtracking. It is one of the
 * important part of programming languages like JAVA, C++, Python, etc.
 *
 * =>By using BackTracking we do a lot of advance operations in DSA. When we talk about
 * Trees, Graphs we mostly use * * BackTracking.
 * When we visualize the concept of Tree where we found out the 1st possible
 * solution of our problem and now we want to go to find the 2nd or other
 * possible solutions then we go back to our main problem the way we came down
 * and that is known as BackTracking.
 */
// ==================================================================================

// Qs. Print all the possible permutations of a given string :- TC = O(n*n!)
//import java.util.*;
//
//public class BackTracking {
//
//    public static void main(String[] args) {
//
//        String s = "ABCD";   // input string
//        permute(s, "");
//    }
//
//    static void permute(String s, String ans) {
//
//        // Base case: when no characters are left
//        if (s.length() == 0) {
//            System.out.println(ans);
//            return;
//        }
//
//        // Recursive case
//        for (int i = 0; i < s.length(); i++) {
//
//            char ch = s.charAt(i);
//
//            // Remaining string after removing character ch
//            String left = s.substring(0, i);
//            String right = s.substring(i + 1);
//
//            // Recursive call
//            permute(left + right, ans + ch);
//        }
//    }
//}

/*---------------------------------------------------------------- */

// Qs. N-Queens :- We are provided with a chessboard of N*N and we are provided
// with N Queens. Print all solutions where queens are safe :- TC = O(n^n) :-
// Level Hard

// I am not going to write the entire solution but I'll do the main solution.
// This problem is from LeetCode N-Queens.

// import java.util.ArrayList;
// import java.util.List;

// public class BackTracking {
// public boolean isSafe(int row, int col, char board[][]) {
// // horizontal
// for (int j = 0; j < board.length; j++) {
// if (board[row][j] == 'Q') {
// return false;
// }
// }

// // vertical
// for (int i = 0; i < board[0].length; i++) {
// if (board[i][col] == 'Q') {
// return false;
// }
// }

// // upper left
// int r = row;
// for (int c = col; c >= 0 && r >= 0; c--, r--) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // upper right
// r = row;
// for (int c = col; c < board.length && r >= 0; r--, c++) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // lower left
// r = row;
// for (int c = col; c >= 0 && r < board.length; r++, c--) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// // lower right
// for (int c = col; c < board.length && r < board.length; c++, r++) {
// if (board[r][c] == 'Q') {
// return false;
// }
// }

// return true;
// }

// public void saveBoard(char board[][], List<List<String>> allBoards) {
// String row = "";
// List<String> newBoard = new ArrayList<>();

// for (int i = 0; i < board.length; i++) {
// row = "";
// for (int j = 0; j < board[0].length; j++) {
// if (board[i][j] == 'Q') {
// row += 'Q';
// } else {
// row += '.';
// }
// }
// newBoard.add(row);
// }
// allBoards.add(newBoard);
// }

// public void helper(char board[][], List<List<String>> allBoards, int col) {
// if (col == board.length) {
// saveBoard(board, allBoards);
// return;
// }

// for (int row = 0; row < board.length; row++) {
// if (isSafe(row, col, board)) {
// board[row][col] = 'Q';
// helper(board, allBoards, col + 1);
// board[row][col] = '.';
// }
// }
// }

// public List<List<String>> solveNQueens(int n) {
// List<List<String>> allBoards = new ArrayList<>();
// char board[][] = new char[n][n];

// helper(board, allBoards, 0);
// return allBoards;
// }
// }
/*---------------------------------------------------------------- */

// Qs. Sudoku Solver :- Write a program to solve a Sudoku puzzle by filling the
// empty cells:- Level Hard

// I am not going to write the entire solution but I'll do the main solution.
// This problem is from LeetCode Sudoku Solver.

/*
 * BackTracking
 */
//public class BackTracking {
//    public boolean isSafe(char board[][], int row, int col, int number) {
//        // row & column check
//        for (int i = 0; i < board.length; i++) {
//            if (board[i][col] == (char) (number + '0')) {
//                return false;
//            }
//            if (board[row][i] == (char) (number + '0')) {
//                return false;
//            }
//        }
//
//        // grid check
//        int sr = (row / 3) * 3;
//        int sc = (col / 3) * 3;
//
//        for (int i = sr; i < sr + 3; i++) {
//            for (int j = sc; j < sc + 3; j++) {
//                if (board[i][j] == (char) (number + '0')) {
//                    return false;
//                }
//            }
//        }
//
//        return true;
//    }
//
//    public boolean helper(char board[][], int row, int col) {
//        if (row == board.length) {
//            return true;
//        }
//
//        int nrow = 0;
//        int ncol = 0;
//        if (col != board.length - 1) {
//            nrow = row;
//            ncol = col + 1;
//        } else {
//            nrow = row + 1;
//            ncol = 0;
//        }
//
//        if (board[row][col] != '.') {
//            if (helper(board, nrow, ncol)) {
//                return true;
//            }
//        } else {
//            for (int i = 1; i <= 9; i++) {
//                if (isSafe(board, row, col, i)) {
//                    board[row][col] = (char) (i + '0');
//                    if (helper(board, nrow, ncol)) {
//                        return true;
//                    } else {
//                        board[row][col] = '.';
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//
//    public void solveSudoku(char board[][]) {
//        helper(board, 0, 0);
//    }
//}

// ==================================================================================
// Rat in a Maze
/*
import java.util.*;
public class BackTracking {
    public static ArrayList<String> findPath(int[][] m,int n) {
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0] == 0) {
            return ans;
        }
        boolean[][] visited = new boolean[n][n];
        solve(0,0,m,n,visited,"",ans);
        return ans;
    }
    static void solve(int i,int j, int[][] m,int n,boolean[][] visited,String path,ArrayList<String> ans) {
        if(i==n-1 && j==n-1) {
            ans.add(path);
            return;
        }
        visited[i][j] = true;
        //move down
        if(i+1 < n && m[i+1][j]==1 && !visited[i+1][j]) {
            solve(i+1,j,m,n,visited,path+"D",ans);
        }
        //move left
        if(j-1>=0 && m[i][j-1]==1 && !visited[i][j]) {
            solve(i,j-1,m,n,visited,path+"l",ans);
        }
        //move right
        if(j+1<n && m[i][j+1]==1 && !visited[i][j+1]){
            solve(i,j+1,m,n,visited,path+"R",ans);
        }
        //move Up
        if(i-1>=0 && m[i-1][j] == 1 && !visited[i-1][j]){
            solve(i-1,j,m,n,visited,path+"U",ans);
        }
        visited[i][j]=false;
    }
    public static void main(String args[]) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int n = maze.length;
        ArrayList<String> paths = findPath(maze, n);
        System.out.println(paths);
    }
}
*/
// ==================================================================================

// Different ways to add Paranthesis
//function solve(expression):
//result = []
//for  each index i :
//if expression
//
//left = expression[0....i-1]:
//right = expression[i+1......n]:
//
//for l in left:
//    for r in right:
//        result.add(l or r):
//
//
//import java.util.*;
//
//public class BackTracking {
//
//    public static List<Integer> solve(String expression) {
//        List<Integer> result = new ArrayList<>();
//
//        // base case: pure number
//        if (!expression.contains("+") &&
//                !expression.contains("-") &&
//                !expression.contains("*")) {
//            result.add(Integer.parseInt(expression));
//            return result;
//        }
//
//        // for each index i
//        for (int i = 0; i < expression.length(); i++) {
//            char ch = expression.charAt(i);
//
//            // if expression[i] is an operator
//            if (ch == '+' || ch == '-' || ch == '*') {
//
//                // left = expression[0...i-1]
//                String leftExpr = expression.substring(0, i);
//
//                // right = expression[i+1...n]
//                String rightExpr = expression.substring(i + 1);
//
//                // recursive calls
//                List<Integer> left = solve(leftExpr);
//                List<Integer> right = solve(rightExpr);
//
//                // for l in left
//                for (int l : left) {
//                    // for r in right
//                    for (int r : right) {
//
//                        // result.add(l or r)
//                        if (ch == '+') result.add(l + r);
//                        else if (ch == '-') result.add(l - r);
//                        else if (ch == '*') result.add(l * r);
//                    }
//                }
//            }
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(solve("2*3-4*5"));
//    }
//}
// ==================================================================================
//Subsets of a Number
//import java.util.*;
//
//public class BackTracking {
//
//    public static void main(String[] args) {
//
//        String s = "123";   // input string
//        subset(s, 0, "");
//    }
//
//    static void subset(String s, int index, String ans) {
//
//        // Base case: processed all characters
//        if (index == s.length()) {
//            System.out.println(ans);
//            return;
//        }
//
//        // Choice 1: include current character
//        subset(s, index + 1, ans + s.charAt(index));
//
//        // Choice 2: exclude current character
//        subset(s, index + 1, ans);
//    }
//
//}

// my approach
/*
public class BackTracking {

    public static void main(String[] args) {
        String s = "123";
        subset(s, 0, new StringBuilder());
    }

    static void subset(String s, int index, StringBuilder ans) {

        // Base case
        if (index == s.length()) {
            printSet(ans);
            return;
        }

        // Include current character
        ans.append(s.charAt(index));
        subset(s, index + 1, ans);

        // Backtrack
        ans.deleteCharAt(ans.length() - 1);

        // Exclude current character
        subset(s, index + 1, ans);
    }

    static void printSet(StringBuilder ans) {
        System.out.print("[");
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
            if (i != ans.length() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

import java.util.*;

class BackTracking {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: sort to handle duplicates
        Arrays.sort(nums);

        // Step 2: backtracking
        backtrack(nums, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // add every subset (including empty)
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // skip duplicates
            if (i > index && nums[i] == nums[i - 1])
                continue;

            // include
            current.add(nums[i]);

            // recurse
            backtrack(nums, i + 1, current, result);

            // exclude (backtrack)
            current.remove(current.size() - 1);
        }
    }
}

*/

/*---------------------------------------------------------------- */