public class SubArraySumPrefixMethod {
    public static void subArraySum(int[] number){
        int maxSum=Integer.MIN_VALUE;
        int[] prefix = new int[number.length];
         prefix[0] = number[0];
         for(int i=1;i<number.length;i++){
            prefix[i]=prefix[i-1]+number[i];
         }

         for(int i=0;i<number.length;i++){
            for(int j=0;j<number.length;j++){
                int currentSum=i==0?prefix[j]:number[j]-prefix[i-1];
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
         }

         System.out.println("Max subArray sum : "+maxSum);
    }
    public static void main(String[] args) {
        int[] number={2,4,6,8,10};
        subArraySum(number);
    }
}
