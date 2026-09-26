class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];

        for(int i=1 ; i < arr.length ; i++){
            int prevNoDel = nodelete;
            int prevOneDel = onedelete;

            nodelete = Math.max(nodelete + arr[i] , arr[i]);

            int c2;
            if(prevOneDel == Integer.MIN_VALUE){
                c2 = arr[i];
            }
            else{
                c2 = prevOneDel + arr[i];
            }
            onedelete = Math.max(c2 , prevNoDel);

            res = Math.max(res ,Math.max(nodelete , onedelete));
        }
        return res;
    }
}