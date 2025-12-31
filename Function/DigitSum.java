import java.util.Scanner;
public class DigitSum {
    public static int digitSum(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum = sum+r;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Sum of digit = "+ digitSum(n));
        sc.close();

    }
}
