public class Solution {
    public int climbStairs(int A) {
        return fib(A + 1);
    }
    // Ath stair can be reach from A-1 or A-2
    private int fib(int A) {
        if(A <= 1) return 1;
        return fib(A - 1) + fib(A - 1);
    }
    
}
