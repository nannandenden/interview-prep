public class Solution {
	// DO NOT MODIFY THE LIST
	// 5, 7, 7, 8, 8, 10
	// 1  1  1  0  0  0
	// 1  1  1  1  1  0
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    int start = -1;
	    int end = -1;
	    int low = 0;
	    int high = a.size() -1; 
	    
	    while(low <= high) {
	        int mid = (low + high) / 2;
	        if(lessThan(mid, a, b) == 1) low = mid + 1; //1
	        else high = mid - 1; // 0
	    }
	    start = low;
	    low = 0;
	    high = a.size() - 1;
	    while(low <= high) {
	        int mid = (low + high) / 2;
	        if(lessThanOrEqualTo(mid, a, b) == 1) low = mid + 1; // 1
	        else high = mid - 1; // 0
	    }
	    end = low - 1;
	    ArrayList<Integer> answer = new ArrayList<>();
	    if(start > end) {
	        answer.add(-1);
	        answer.add(-1);
	    } else {
	        answer.add(start);
	        answer.add(end);
	    }
	    return answer;
	}
	
	int lessThan(int index, List<Integer> a, int target) {
	    if(a.get(index) < target) return 1;
	    else return 0;
	}
	
	int lessThanOrEqualTo(int index, List<Integer> a, int target) {
	    if(a.get(index) <= target) return 1;
	    else return 0;
	}
}
