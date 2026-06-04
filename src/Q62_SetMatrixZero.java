public class Q62_SetMatrixZero {

    public static void func(int[][] M) {
        int rows = M.length;
        int cols = M[0].length;

        boolean[] zeroRow = new boolean[rows];
        boolean[] zeroCol = new boolean[cols];

        // Step 1: Mark rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (M[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        // Step 2: Set zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRow[i] || zeroCol[j]) {
                    M[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] Matrix = {{0,1,1,0},{1,3,4,1},{1,7,8,9}};
        func(Matrix);

        for(int i=0;i<Matrix.length;i++){
            for(int j=0;j<Matrix[0].length;j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

