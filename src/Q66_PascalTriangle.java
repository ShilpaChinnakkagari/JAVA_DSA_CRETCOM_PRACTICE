import java.util.Scanner;

public class Q66_PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {

            int val = 1;

            // spacing (optional, for triangle shape)
            for (int s = 0; s < n - row - 1; s++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= row; i++) {
                System.out.print(val + " ");
                // nCr iterative formula
                val = val * (row - i) / (i );
            }
            System.out.println();
        }
    }
}
