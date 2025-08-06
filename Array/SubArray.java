public class SubArray {
    public static void subArray(int[] arr){
        int count =0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print("sum = "+sum);
                if(min>sum){
                    min=sum;
                }
                if(max<sum){
                    max=sum;
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array "+count);
        System.out.println("Minimum sub array sum "+min+" Maximum sub array sum "+max);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        subArray(arr);
    }
}
