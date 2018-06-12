public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int result = 0;
        for(Integer i: A) {
            result ^= i;
        }
        return result;
    }
}
