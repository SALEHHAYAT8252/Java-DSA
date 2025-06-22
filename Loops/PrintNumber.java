
import java.util.Scanner;

public class PrintNumber {
    public static void printNumber(int n){
        int i = 1;
        while(i<=n){
            System.out.print(i+" ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number range 1 to n ");
        int n = sc.nextInt();
        sc.close();
        printNumber(n);
    }
}
