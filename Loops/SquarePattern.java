public class SquarePattern {
    public static void printPattern(){
        int n=4;
        for(int i =1 ; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern();
    }
}
