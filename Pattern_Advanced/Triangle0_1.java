import java.util.Scanner;

public class Triangle0_1 {
    public static void printTriangle0_1(int n){
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=i ; j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
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
        printTriangle0_1(n);
    }
}
