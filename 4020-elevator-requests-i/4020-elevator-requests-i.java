class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int curr = 0;
        for(int i : requests){
            time += Math.abs(i - curr);
            curr = i;
        }
        return time;
    }
}