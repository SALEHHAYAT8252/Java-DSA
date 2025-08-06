public class SmallestElemetnInArray {
    
    public static int smallestElement(int[] arr){
        int largestElement = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largestElement){
                largestElement=arr[i];
            }
        }
        return largestElement;
    }

    public static void main(String[] args) {
        int[] arr = {111,5,7,12,91};
        System.out.println(smallestElement(arr));
    }

}
