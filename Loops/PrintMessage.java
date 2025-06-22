import java.util.Scanner;

public class PrintMessage {
    public static void printMessage(String msg){
        int i =0;
        while(i<100){
            System.out.print(msg+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message");
        String msg = sc.nextLine();
        sc.close();
        printMessage(msg);
    }
}
