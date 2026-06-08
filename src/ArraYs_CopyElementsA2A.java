public class ArraYs_CopyElementsA2A {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int n = arr1.length;
        int[] arr2 = new int[n];

        for(int i = 0; i < n; i++){
            arr2[i] = arr1[i];
        }

        System.out.println("Copied Array:");

        for(int i = 0; i < n; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}