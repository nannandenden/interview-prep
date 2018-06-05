public class Solution {
	// DO NOT MODIFY THE LIST
	// 4 5 6 7 0 1 2
	// 1 1 1 1 0 0 0
	public int search(final List<Integer> a, int b) {
	    int pivot = 0;
	    int low = 0;
	    int high = a.size() - 1;
	    while(low <= high) {
	        int mid = (low + high) / 2;
	        if(greaterThan(mid, a.get(0), a) == 1) low = mid + 1; // 1
	        else high = mid - 1; // 0
	    }
	    pivot = low - 1;
	    if(a.get(pivot) == b) return pivot;
	    low = 0;
	    high = 0;
	    if(a.get(0) > b){
	       low = pivot + 1;
	       high = a.size() - 1;
	       return binarySearch(low, high, a, b);
	    } else {
	        low = 0;
	        high = pivot - 1;
	        return binarySearch(low, high, a, b);
	    }    
	}
	
	int greaterThan(int index, int target, List<Integer> a) {
	    if(a.get(index) >= target) return 1;
	    else return 0;
	}
	
	int binarySearch(int low, int high, List<Integer> a, int target) {
	    while(low <= high) {
	        int mid = (low + high) / 2;
	        if(a.get(mid) == target) return mid;
	        if(a.get(mid) > target) high = mid - 1;
	        else low = mid + 1;
	    }
	    return -1;
	}
}
