public class TrappoingRainWater {
    public static int trappingRainWater(int[] height){
        int[] lMb =new int[height.length];
        int[] rMb = new int[height.length];
        int trapedWater=0;
        //Left Maximum Boundries
        // for(int i=0;i<height.length;i++)
        // {
        //     int max=height[i];
        //     for(int j=0;j<=i;j++){
        //         if(max<height[j])
        //         {
        //             max=height[j];
        //         }
        //     }
        //     lMb[i]=max;
        // }
        lMb[0]=height[0];
        for(int i=1;i<height.length;i++){
            lMb[i]=Math.max(height[i], lMb[i-1]);
        }

        for(int i=0;i<lMb.length;i++)
        {
            System.out.print(lMb[i]+" ");
        }

        //Right Maximum Boundries
        // for(int i=0;i<height.length;i++){
        //     int max=height[i];
        //     for(int j=i;j<height.length;j++)
        //     {
        //         if(max<height[j]){
        //             max=height[j];
        //         }
        //     }
        //     rMb[i]=max;
        // }
        rMb[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rMb[i]=Math.max(height[i], rMb[i+1]);
        }

        System.out.println();
         for(int i=0;i<rMb.length;i++)
        {
            System.out.print(rMb[i]+" ");
        }

        for(int i=0;i<height.length;i++)
        {
            trapedWater+=(Math.min(lMb[i], rMb[i])-height[i]);
        }

        return trapedWater*1;
    }
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
      System.out.println("\nTraped Water "+trappingRainWater(height)+"sqUnit");
    }
}
