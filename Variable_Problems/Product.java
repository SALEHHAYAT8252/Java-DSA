import java.util.Scanner;

public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int product = a*b;
        sc.close();
        System.out.println("Product of two number"+a+"*"+b+" = "+product);
    }
}
