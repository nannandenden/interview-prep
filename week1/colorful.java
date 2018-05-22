public class Solution {
	public int colorful(int a) {
	    Set<Integer> set = new HashSet<>();
        while (a > 0) {
            if (set.contains(a % 10)) {
                return 0;
            }
            set.add(a % 10);
            a = a / 10;
        }
        Integer[] result = set.toArray(new Integer[set.size()]);
        for (int i = 0; i < result.length; i++) {
            int product = result[i];
            for (int j = i+1; j < result.length; j++) {
                product *= result[j];
                if (set.contains(product)) {
                    return 0;
                }
            }
            product = 1;
        }
        return 1;
	}
}
