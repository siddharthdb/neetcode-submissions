class Solution {
    private double helper(double x, long n) {
        if (n == 0) return 1.0;
        if (x == 0) return 0.0;
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }   

    public double myPow(double x, int n) {
        double res;       
        long N = n;
        if (N < 0) { x = 1 / x; N = -N; }
        res = helper(x, N);

        return N >=0 ? res : 1 / res;
        
    }
}
