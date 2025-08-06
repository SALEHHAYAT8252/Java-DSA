public class KadanesAlgorithm {
    public static void kadanesAlgorithm(int[] number){
        int cs=0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            cs=cs+number[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Max subArraySum = "+ms);
    }
    public static void main(String[] args) {
        int[] number = {-2,-4,-6,8,10};
        kadanesAlgorithm(number);
    }
}
