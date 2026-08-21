class Solution {
    public int countOdds(int low, int high) {
        int diff = high - low;
        if(diff == 0 && high%2 == 0) return 0;
        return diff/2+1;
        
    }
}