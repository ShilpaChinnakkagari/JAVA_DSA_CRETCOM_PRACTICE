//import java.util.ArrayList;
//
//public class RainWaterBuilding {
//    public static int func(ArrayList<Integer> arr) {
//        int max = arr.get(0);
//        for(int i=0;i<arr.size();i++){
//            max = Math.max(max, arr.get(i));
//        }
//        arr.remove(max);
//
//        return arr.get(0)-arr.get(1);
//    }
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(7);
//        arr.add(11);
//        arr.add(13);
//
//        System.out.println(func(arr));
//    }
//}
public class RainWaterBuilding {

    public static int trap(int[] buildings) {
        int left = 0, right = buildings.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (buildings[left] < buildings[right]) {
                if (buildings[left] >= leftMax) {
                    leftMax = buildings[left];
                } else {
                    water += leftMax - buildings[left];
                }
                left++;
            } else {
                if (buildings[right] >= rightMax) {
                    rightMax = buildings[right];
                } else {
                    water += rightMax - buildings[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] buildings1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(buildings1)); // 6

        int[] buildings2 = {4,2,0,3,2,5};
        System.out.println(trap(buildings2)); // 9
    }
}
