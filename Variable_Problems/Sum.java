package Variable_Problems;
import java.util.*;
public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int sum = a+b;
        sc.close();
        System.out.println("Sum of two number "+a+"+"+b+" = "+sum);
    }
}