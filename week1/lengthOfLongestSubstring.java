public class Solution {
	public static int lengthOfLongestSubstring(String a) {
		    int max = Integer.MIN_VALUE;
		    int left = 0, right = 0;
		    Set<Character> chSet = new HashSet<>();
		    
		    while(left < a.length() && right < a.length()) {
		        if(chSet.contains(a.charAt(right))) {
		            while(chSet.contains(a.charAt(right))) {
		                chSet.remove(a.charAt(left));
		                left++;
		            }
		        } else {
		             chSet.add(a.charAt(right));
		             right++;
		             max = Math.max(max, chSet.size());
		        }
		    }
		    return max;
	}
}
