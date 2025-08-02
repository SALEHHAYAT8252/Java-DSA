import java.util.Scanner;

public class AllPrime {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumber(int n){
        for(int i= 1 ; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range 1 to n");
        int n = sc.nextInt();
        printPrimeNumber(n);
        sc.close();

    }
}
