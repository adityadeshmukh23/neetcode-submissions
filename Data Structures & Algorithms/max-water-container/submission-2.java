class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int area = (j-i)*(Math.min(heights[i],heights[j]));
                if(area >= max){
                    max = area;
                }
            }
        }
        return max;
    }
}
