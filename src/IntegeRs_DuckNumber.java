import java.util.Scanner;

public class IntegeRs_DuckNumber {

    static boolean isDuck(int n){
        boolean duck = false;

        while(n!=0){
            int digit = n%10;
            if(digit == 0){
                duck = true;
            }
            n = n/10;
        }
        return duck;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        boolean res = isDuck(num);

        if(res){
            System.out.println(num + " is a Duck Number");
        }
        else{
            System.out.println(num + " not a Duck Number");
        }

    }
}