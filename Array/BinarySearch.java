public class BinarySearch {
    public static boolean binarySearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
           int mid=(start+end)/2;
           //Compression
            if(arr[mid]==key){
                return true;
            }
             if(arr[mid]>key){
                end=mid-1;
            }
            if(arr[mid]<key){
                start=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr ={12,56,78,90,99};
        int key=99;
        System.out.println(binarySearch(arr,key));
    }
}
