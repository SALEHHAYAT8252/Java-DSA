import java.util.Scanner;

public class DecimalConvert {
    public static int decimalToBinary(int decimal){
        int pow=0;
        int binary=0;
        while(decimal>0){
            int r = decimal%2;
            binary=binary+r*(int)Math.pow(10, pow);
            decimal=decimal/2;
            pow++;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal Number");
        int decimal = sc.nextInt();
        System.out.println("Binary of "+decimal+" = "+decimalToBinary(decimal));
        sc.close();
    }
}
