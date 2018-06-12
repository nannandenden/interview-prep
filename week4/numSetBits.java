public class Solution {
    public int numSetBits(long a) {

            int count = 0;
            int mask = 0;
            while(a > 0) {

                if((a | mask) % 2 != 0) count++;
                a = a >> 1;
            }

            return count;
            
        }
}
