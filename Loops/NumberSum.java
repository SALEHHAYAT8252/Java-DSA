import java.util.Scanner;

public class NumberSum {
    public static void evenOddSum()
    {
        Scanner sc = new Scanner(System.in);
        int evenSum=0;
        int oddSum=0;
        char ch ;
        do{
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            if(n%2==0){
                evenSum+=n;
            }
            else{
                oddSum+=n;
            }
            System.out.println("Do you want to enter more number to continue press y/n ");
             ch = sc.next().charAt(0);
        }while(ch=='y'||ch=='y');
        sc.close();
        System.out.println("Even Sum = "+evenSum+"\nOdd Sum = "+oddSum);
    }
    public static void main(String[] args) {
        evenOddSum();
    }
}
