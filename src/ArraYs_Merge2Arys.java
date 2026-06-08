public class ArraYs_Merge2Arys {

    static int[] mergeArrays(int[] arr1, int[] arr2, int n1, int n2){
        int[] arr3 = new int[n1+n2];
        for(int i=0; i< n1; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0 ; i<n2; i++){
            arr3[n1+ i] = arr2[i];
        }
        return arr3;
    }

    public static void main(String[] args) {
        int arr1[] = {10,20,30,40};
        int arr2[] = {50,60,70,80};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];
        arr3 = mergeArrays(arr1, arr2, n1, n2);

        System.out.println("Merged Array is ");
        for(int i=0; i< arr3.length; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}
