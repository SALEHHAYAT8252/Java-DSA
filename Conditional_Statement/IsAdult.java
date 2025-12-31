import java.util.Scanner;

public class IsAdult {
    public static boolean isAdult(int age){
        if(age>=18){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        sc.close();
        if(isAdult(age))
        {
            System.out.println("Adult");
        }
        else
        {
            System.out.println("Not adult");
        }
    }
}
