import java.util.Scanner;

public class Average {
    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of three number is " + average(a, b, c));
        sc.close();
    }
}
