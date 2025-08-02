import java.util.Scanner;

public class BinomialCofficient {
    public static int factorial(int n){
        int fact =1 ;
        for(int i =n ; i>1;i--){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCofficient(int n,int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n and r ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomialCofficient(n, r));
    }
}