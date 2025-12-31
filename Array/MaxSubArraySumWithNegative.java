public class MaxSubArraySumWithNegative {
    public static int maxSubArraySum(int[] number){
        int cs=0;
        int ms=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            cs+=number[i];
            if(cs<0){
                cs=0;
            }

            ms=Math.max(ms, cs);
        }
       if(ms==0){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            max=Math.max(max, number[i]);
        }
        return max;
       }
       return ms;
    }

    public static void main(String[] args) {
        int[] number = {-2,-4,-6,-8,-10};
       System.out.println( maxSubArraySum(number));
    }
}