public class Solution {
	static int maxSubArray(final List<Integer> a) {
		// find the first positive, if all negative find
	    int index = 0, currentSum = 0, sumSoFar = Integer.MIN_VALUE;
	    
	    while(index < a.size()) {
	    		if(a.get(index) > 0) {
	    			sumSoFar = a.get(index);
	    			currentSum = a.get(index);
	    			break;
	    		} else {
	    			sumSoFar = Math.max(sumSoFar, a.get(index));
	    		}
	    		index++;
	    }
	    
	    if(sumSoFar > 0) {
	    		index++;
	    		while(index < a.size()) {
	    		    currentSum += a.get(index);
	    			if(currentSum < 0) currentSum = 0;
	    			if(sumSoFar < currentSum) sumSoFar = currentSum;
	    			index++;
	    	    }
	    		
	    } 

		return sumSoFar;
	}
}
