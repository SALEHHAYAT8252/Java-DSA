
import java.util.Scanner;

public class ReversePrint {
    public static void printNumber(int n){
        
        while(n>=1){
            System.out.print(n+" ");
            n--;
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
