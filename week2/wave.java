public class Solution {
    public int[] wave(int[] A) {
        Arrays.sort(A);
        int[] result = new int[A.length];
        int j = 1;
        for (int i = 0; i < A.length; i+=2) {
            if (j < A.length) {
                result[j] = A[i];
                result[i] = A[j];
            } else {
                result[i] = A[i];
            }
            j += 2;
        }
        return result;
    }
}
