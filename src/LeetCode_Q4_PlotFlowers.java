public class LeetCode_Q4_PlotFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        // Go through each spot in the flowerbed
        for (int i = 0; i < length; i++) {
            // Check if the current spot is empty
            if (flowerbed[i] == 0) {
                // Check neighbors: left and right
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == length - 1) || (flowerbed[i + 1] == 0);

                // If both neighbors are empty, we can plant a flower here
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant the flower
                    n--;              // One less flower to plant
                }
            }

            // Early exit: if we already planted all flowers
            if (n <= 0) return true;
        }

        // Final check after going through the whole flowerbed
        if (n > 0) {
            return false; // Still flowers left to plant → cannot plant all
        } else {
            return true;  // All flowers planted successfully
        }
    }

    public static void main(String[] args) {
        int[] flowerbed1 = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed1, 1)); // true

        int[] flowerbed2 = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(flowerbed2, 2)); // false

        int[] flowerbed3 = {0,0,1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(flowerbed3, 2)); // true
    }
}
