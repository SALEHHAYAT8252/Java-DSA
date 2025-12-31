import java.util.Scanner;
public class Factorail {
    public static int fact(int n){
        int fact = 1;
        for(int i = n ; i>1;i--)
        {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number to calculate Factorial of a Number ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of a number "+n+" is "+fact(n));
    }
}
