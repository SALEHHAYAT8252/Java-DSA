import java.util.Scanner;

public class NaturalSum {
    public static int sum(int n){
        int sum=0;
        while(n>=1){
            sum+=n;
            n--;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to find sum 1 to n ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of 1 to "+n+" = "+sum(n));
    }
    
}