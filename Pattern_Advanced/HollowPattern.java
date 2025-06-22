import java.util.Scanner;

public class HollowPattern {

    public static void printHollowPattern(int n,int k) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 1 || i == n | j == 1 || j == k) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  number of lines ");
        int n = sc.nextInt();
        System.out.print("Enter number of column ");
        int k = sc.nextInt();
        sc.close();
        printHollowPattern(n,k);
    }
}