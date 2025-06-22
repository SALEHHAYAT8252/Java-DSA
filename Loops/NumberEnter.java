import java.util.Scanner;

public class NumberEnter {

    public static void numberEnter(){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();
        // while (n%10!=0) {
            //  System.out.println("Enter a number");
            //  n = sc.nextInt();
        // }
        // int n;
        // do{
        //      System.out.println("Enter a number");
        //      n = sc.nextInt();
        // }while(n%10!=0);
        // sc.close();

        while (true) {
             System.out.println("Enter a number");
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        numberEnter();
    }
}