import java.util.Scanner;

public class Largest {
    public static int largestNumber(int a,int b,int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }
            else{
                return c;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("Greatest number out og three "+a+","+b+","+c+" is "+largestNumber(a, b, c));
    }
}
