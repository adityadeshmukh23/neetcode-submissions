class Solution {
    public int maxm(int[]height,int i,int j){
        int max = 0;
        for(int k = i;k<=j;k++){
            if(height[k]>max) max = height[k];

        }
        return max;
    }

    public int trap(int[] height) {
        int water = 0;
    
        for(int k=0;k<height.length;k++){
            
            water += Math.min(maxm(height,0,k),maxm(height,k,height.length-1)) - height[k];
        }
        return water;
    }
}
