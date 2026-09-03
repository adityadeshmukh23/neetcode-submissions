class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String str : arr){
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        
        int cnt =0;

        for(String str: arr){
            if(hm.get(str) == 1){
                cnt++;
            }

            if(cnt == k){
                return str;
            }
        }
        return "";
    }
}