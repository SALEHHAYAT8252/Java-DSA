import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of Circle");
        float r = sc.nextFloat();
        float area = 3.14f*r*r;
        sc.close();
        System.out.println("Area of Cirlce = "+area);

    }
}
