public class EvenOdd{
    public static void idOddOrEven(int n){
        if((n&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        idOddOrEven(144);
    }
}