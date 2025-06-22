import java.util.Scanner;

public class InvertedRotatedHollowPyramid {
    public static void printInvertedRotatedHollowPyramid(int row , int col){
        for(int i = 1 ; i<=row;i++){
            for(int j =1 ; j<=col-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of row ");
        int row = sc.nextInt();
        System.out.print("Enter number of column ");
        int col = sc.nextInt();
        sc.close();
        printInvertedRotatedHollowPyramid(row, col);
    }
}
