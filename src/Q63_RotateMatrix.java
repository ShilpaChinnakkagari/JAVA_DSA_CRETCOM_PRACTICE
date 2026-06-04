import java.util.Scanner;

public class Q63_RotateMatrix {
    public static void func(int[][] A){
        int[][] B = new int[A.length][A[0].length];
        int n = A.length;
        // Rotate using extra matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                B[i][j] = A[n - 1 - j][i];

            }
        }

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                A[i][j] = B[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        func(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
