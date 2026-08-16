import java.util.Scanner;

public class IntegeRs_Prime {
    static boolean isPrime(int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean res = isPrime(num);

        if (res) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime");
        }

        sc.close();
    }
}