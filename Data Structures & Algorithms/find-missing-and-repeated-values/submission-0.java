class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n];
        int doub = 0;
        int miss = 0;
        
        for(int num=1;num<=n*n;num++){
            int cnt=0;
            for(int i=0;i<grid.length;i++){
                 for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j] == num){
                        cnt++;
                    }

                 }
            }
            if(cnt == 2){
                doub = num;
            }
            else if(cnt == 0){
                miss = num;
            }
        }

        
        return new int[]{doub,miss};
    }
}