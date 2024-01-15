public class TrappingRainwater {

    public static int TrappedWater(int num[]){  //time complexity is O(n)  ----good time complexity
        int n = num.length;
        int trappedWater = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0]= num[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(num[i], leftMax[i-1]);
        }
        rightMax[n-1] = num[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(num[i], rightMax[i+1]);
        }

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - num[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Trapped water after raining will be: " + TrappedWater(height));
    }
}
