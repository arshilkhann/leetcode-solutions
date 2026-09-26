class Solution {

    static int maxSumSubArray(int[] a){
        int maxSum = a[0];
        int best = a[0];
        for(int i=1 ; i < a.length ; i++){
            best = Math.max(best + a[i],a[i]);
            maxSum = Math.max(maxSum , best);
        }
        return Math.abs(maxSum);
    }

    static int minSumSubArray(int[] a){
        int minSum = a[0];
        int best = a[0];
        for(int i=1 ; i < a.length ; i++){
            best = Math.min(best + a[i],a[i]);
            minSum = Math.min(minSum , best);
        }
        return Math.abs(minSum);
    }

    public int maxAbsoluteSum(int[] a) {
        int res = 0;
        int best = a[0];

        int min = minSumSubArray(a);
        int max = maxSumSubArray(a);
        
        res = Math.max(min,max);

        return res ;
    }
}