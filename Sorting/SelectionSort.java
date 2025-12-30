public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int sIdx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    sIdx=j;
                }
            }
            if(sIdx!=i){
            int temp=arr[i];
            arr[i]=arr[sIdx];
            arr[sIdx] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5,8,7,9,6,10};
        selectionSort(arr);
        System.out.println("Sorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
