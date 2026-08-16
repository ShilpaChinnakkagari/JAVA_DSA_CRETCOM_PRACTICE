import java.util.Scanner;

public class IntegeRs_PrimesUptoN {
    static boolean primeFunc(int n){
        boolean isPrime = true;

        for(int i =2; i<n; i++){
            if(n%i==0){
                isPrime = false;
                return isPrime;
            }
        }
        return isPrime;
    }
    static void PrimeNos(int n) {

        boolean res = false;
        for (int i = 2; i < n; i++) {
            res = primeFunc(n);

            if (res) {
                System.out.print(i+ " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PrimeNos(num);

        sc.close();
    }
}