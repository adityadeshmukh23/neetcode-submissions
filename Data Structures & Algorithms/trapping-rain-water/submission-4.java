class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxLeft [] = new int[n];
        int maxRight[] = new int[n];
        int water[] = new int [n];

        if(n == 0) return 0;

        maxLeft[0] = height[0];
        maxRight[n-1] = height[n-1];


        for(int k=1;k<n;k++){
            maxLeft[k] = Math.max(maxLeft[k-1],height[k]);
        }

        for(int k=n-2;k>=0;k--){
            maxRight[k] = Math.max(maxRight[k+1],height[k]);
        }

        int total=0;
        for(int k=0;k<n;k++){
            if(maxLeft[k]<maxRight[k]){
            water[k] = maxLeft[k] - height[k];
            }
            else{
            water[k] = maxRight[k] - height[k];              
            }
            total += water[k];
        }
        return total;
    }
}
