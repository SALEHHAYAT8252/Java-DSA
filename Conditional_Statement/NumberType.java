import java.util.Scanner;

public class NumberType {
    public static String isEven(int n){
        if(n%2==0){
            return "Even";
        }
        return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(isEven(n));
    }
}
