import java.util.Scanner;

public class Diamond {
    public static void diamond(int n)
    {
        for(int i =1;i<=n;i++){
            for(int j =1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =1;i<=n;i++){
             for(int j =1 ; j<=i-1;j++){
                 System.out.print(" ");
             }
             for(int k=1;k<=2*(n-i)+1;k++){
                 System.out.print("*");
             }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of lines ");
        int n = sc.nextInt();
        sc.close();
        diamond(n);
    }
}
