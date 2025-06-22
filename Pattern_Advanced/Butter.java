import java.util.Scanner;
public class Butter {

    public static void printButterFly(int n){
        for(int i =1 ; i<=n;i++){
            for(int j =1 ; j<=i;j++){
                System.out.print("*");
            }
            for(int j =1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1 ;k<=n-i;k++){
               System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1 ; i<=n;i++){
             for(int m =1 ; m<=(n-i)+1;m++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int k =1 ;k<=i-1;k++){
                System.out.print(" ");
            }
             for(int o =1 ; o<=(n-i)+1;o++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines ");
        int n = sc.nextInt();
        sc.close();
        printButterFly(n);
    }
}

