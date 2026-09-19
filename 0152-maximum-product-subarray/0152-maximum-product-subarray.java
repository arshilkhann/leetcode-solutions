class Solution {
    public int maxProduct(int[] nums) {
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int product = nums[0];

        for(int i=1 ; i< nums.length ; i++){
            
            int c1 = minEnd*nums[i];
            int c2 = maxEnd*nums[i];
            int c3 = nums[i];

            minEnd = Math.min(Math.min(c1,c2),c3);
            maxEnd = Math.max(Math.max(c1,c2),c3);
            product = Math.max(product,Math.max(minEnd,maxEnd));           
        } 
        return product;
    }
}