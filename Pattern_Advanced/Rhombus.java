import java.util.Scanner;

public class Rhombus {
    public static void solidRhommbus(int n){
        for(int i = 1 ; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=n;k++){
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
        solidRhommbus(n);

    }
}
