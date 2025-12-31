import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrom(int n){
        int rev=0;
        int num=n;
        while (n>0) {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(num==rev){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        System.out.println(isPalindrom(n));
        sc.close();
    }
}
