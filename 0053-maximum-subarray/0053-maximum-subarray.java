class Solution {
    public int maxSubArray(int[] a) {
        int best = a[0];
        int ans = a[0];

        for(int i=1 ; i < a.length ; i++){
            int c1 = best + a[i];
            int c2 = a[i];

            best = Math.max(c1,c2);

            ans = Math.max(ans , best);
        }
        return ans;
    }
}