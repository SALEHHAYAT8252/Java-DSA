import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n){
       
        if(n==1)
        {
            return false;
        }
         if(n==2){
            return false;
        }
        // for(int i=2;i<n;i++ ){
        //     if(n%i==0)
        //     {
        //         return false;
        //     }
        // }
        // return true;

        for(int i =2 ;i<=Math.sqrt(n);i++){
                     if(n%i==0)
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isPrime(n));
    }
}
