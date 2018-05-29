public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int count = 0;
        for (int i = 1; i < A.length; i++) {
            int diffA = Math.abs(A[i] - A[i-1]);
            int diffB = Math.abs(B[i] - B[i-1]);

            count += Math.max(diffA, diffB);
        }

        return count;
    }
}
