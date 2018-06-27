import java.awt.List;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProfit(final List<Integer> A) {
       int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = A.size() - 1; i >= 0; i--) {
            if(A.get(i) > max) {
                if(max > min) profit = Math.max(max - min, profit); 
                max = A.get(i);
                // reset the value 
                min = A.get(i);
            } else if(A.get(i) < min) {
                min = A.get(i);
                if(max > min) profit = Math.max(max - min, profit);
            }
        }
        if(max > min && (max - min) > profit) return max - min;
        return profit;
    }
}
