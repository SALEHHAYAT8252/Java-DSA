import java.util.Scanner;
public class NumPyramid {
    public static void numberPyramid(int n){
        for(int i = 1 ; i<=n;i++){
            for(int j= 1 ; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<=i;k++){
                   System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Number of lines ");
         int n = sc.nextInt();
         sc.close();
         numberPyramid(n);
    }
}
