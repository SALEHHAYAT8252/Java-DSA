import java.util.Scanner;

public class HollowRhombus {

      public static void HollowRhommbus(int n){
        for(int i = 1 ; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=n;k++){
                if(i==1||i==n||k==1||k==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines ");
        int n = sc.nextInt();
        sc.close();
        HollowRhommbus(n);

    }
}