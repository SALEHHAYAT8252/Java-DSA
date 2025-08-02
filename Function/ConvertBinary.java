import java.util.Scanner;

public class ConvertBinary {

    public static int binaryToDecimal(int binary){
        int i=0;
        int dec =0;
       while(binary>0){
        int r = binary%10;
        dec=dec+r*(int)Math.pow(2,i);
        binary=binary/10;
        i++;
       }
       return dec;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary number ");
        int binary = sc.nextInt();
        System.out.println("Decimal = "+binaryToDecimal(binary));
        sc.close();
    }
}
