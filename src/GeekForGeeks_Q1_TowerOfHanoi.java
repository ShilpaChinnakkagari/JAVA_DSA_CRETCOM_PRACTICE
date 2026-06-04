// https://www.geeksforgeeks.org/dsa/c-program-for-tower-of-hanoi/

public class GeekForGeeks_Q1_TowerOfHanoi {
    static void towerOfHanoi(int n, char fromRod,
                                 char toRod, char auxRod){
        if (n == 0) {
            return;
        }
        towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Disk " + n + " moved from "
                    + fromRod + " to "
                    + toRod);
        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }
    public static void main(String args[]){
            int n = 3;

            // A, B and C are names of rods
            towerOfHanoi(n, 'A', 'C', 'B');
    }
}
