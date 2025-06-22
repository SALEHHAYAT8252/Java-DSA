import java.util.Scanner;

public class NumberReverse {
    public static int reverse(int n){
        int revNum=0;
        while(n>0){
            int r = n%10;
            revNum=revNum*10+r;
            n=n/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Reverse of "+n+" is "+reverse(n));
    }
}
