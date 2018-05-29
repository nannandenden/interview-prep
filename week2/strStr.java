public class Solution {
	public int strStr(final String haystack, final String needle) {
	    if (!haystack.contains(needle)) return -1;

        String result = haystack.replace(needle, " ");
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') return i;
        }
        return -1;
	}
}
