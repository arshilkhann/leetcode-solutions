class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = 0;
        int curr = 0;
        for(int i : requests){
            time += Math.abs(curr-i);
            curr = i;
        }
        return time;
    }
}