import java.util.Scanner;

public class CharacterPattern {
    public static void characterPattern(int n){
        char ch = 'A';
        for(int i=1 ; i<=n;i++){
            
            for(int j = 1 ; j<=i;j++){
                System.err.print(ch);
                ch++;
            }
            System.out.println();
            // ch++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many lines ");
        int n = sc.nextInt();
        sc.close();
        characterPattern(n);
    }
}
