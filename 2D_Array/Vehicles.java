public class Vehicles {
    public static void count(int v,int w){
        int y = (w-2*v)/2;
        int x = 200-y;
        System.out.println("Two Wheel "+x+" Four Wheel "+y);
    }
    public static void main(String[] args) {
        count(200, 540);
    }
}
