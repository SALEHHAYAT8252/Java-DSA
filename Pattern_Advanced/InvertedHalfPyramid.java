import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void printInvertedHalfPyramid(int n){
        for(int i =1 ; i<=n;i++){
            for(int j =1 ;j<=(n-i)+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines ");
        int n = sc.nextInt();
        sc.close();
        printInvertedHalfPyramid(n);
    }
}
