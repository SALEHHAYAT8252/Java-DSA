public class ArrayBacktrack{

    public static void arrayBacktrack(int[] arr,int idx){
        if(arr.length==idx){
            return;
        }

        arr[idx] = idx+1;
        arrayBacktrack(arr, idx+1);
        arr[idx]-=2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arrayBacktrack(arr, 0);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}