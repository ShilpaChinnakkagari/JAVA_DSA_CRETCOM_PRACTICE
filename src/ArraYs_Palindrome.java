import java.util.Scanner;

public class ArraYs_Palindrome {
    static boolean isPalindrome(int[] arr){
        int n = arr.length;
        for(int i=0; i< n/2 ; i++){
            if(arr[i] != arr[n-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        if(isPalindrome(arr)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
