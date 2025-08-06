import java.util.Scanner;

public class linearSearch {

    public static boolean search(int[] arr,int key){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]==key){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter"+(i+1)+"Element of array");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search");
        int key = sc.nextInt();
        sc.close();
        System.out.println(search(arr, key));
    }
}