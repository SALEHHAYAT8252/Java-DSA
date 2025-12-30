public class BubbleSort{
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5,8,7,9,6,10};
        bubbleSort(arr);
        System.out.println("Sorted Array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}