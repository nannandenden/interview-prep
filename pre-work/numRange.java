public class Solution {
    static int numRange(ArrayList<Integer> A, int B, int C) {
        int ans = 0, currentSum;
        for(int i = 0; i < A.size(); i++) {
        		currentSum = A.get(i);
        		for(int j = i + 1; j <= A.size(); j++) {
        			if(B <= currentSum && currentSum <= C) {
        				ans++;
        			}
        			if(j == A.size() || currentSum > C) break;
        			currentSum += A.get(j);
        		}
        }
        return ans;
    }
}