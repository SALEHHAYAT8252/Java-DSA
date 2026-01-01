import java.util.*;
public class EnoughFoodForCat{
    public static int numberOfHouses(int r,int unit,int[] arr){
       

        int totalFoodRequird = r*unit;
        int sum =0;
        if(arr.length==0||arr==null){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum>=totalFoodRequird){
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {2,8,3,5,7,4,1,2};

        System.out.println(numberOfHouses(7, 2,arr));;
    }
}