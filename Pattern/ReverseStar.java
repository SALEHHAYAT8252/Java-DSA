import java.util.Scanner;

public class ReverseStar {
    public static void printReverseStar(int n)
    {
        for(int i = 1 ; i<=n ; i++)
        {
            // for(int j = 1 ; j<=(n-i)+1;j++){
            //     System.out.print("*");
            // }
            //  for(int j = n ; j>=1;j--){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of lines ");
        int n = sc.nextInt();
        sc.close();
        printReverseStar(n);
    }
}
