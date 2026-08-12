class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int low = 0;
        int ans = Integer.MIN_VALUE;

        for(int high = 0 ; high < nums.length ; high++){
            map.put(nums[high] , map.getOrDefault(nums[high] , 0)+1);

            while(map.get(nums[high]) > k){
                map.put(nums[low], map.get(nums[low]) - 1);
                if (map.get(nums[low]) == 0) {
                    map.remove(nums[low]);
                }
                low++ ;
            }
            int len = high-low+1;
            ans = Math.max(ans , len);
        }
        return ans ;
    }
}