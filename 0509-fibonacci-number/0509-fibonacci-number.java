class Solution {
    public int fib(int n) {
        // if(n<=1) return n;
        // return fib(n-1) + fib(n-2);


        double sqrt = Math.sqrt(5);
        double fib = Math.pow((1 + sqrt) / 2, n) - Math.pow((1 - sqrt) / 2, n);
        return (int) Math.round(fib / sqrt);
    }
}