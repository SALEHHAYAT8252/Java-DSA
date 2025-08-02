import java.util.Scanner;

public class SumOverload {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println(sum(a, b,c));
    }
}